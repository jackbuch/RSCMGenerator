import cache.definitions.ItemDefinition
import cache.definitions.NpcDefinition
import cache.definitions.ObjectDefinition
import cache.loaders.CacheLoader
import cache.loaders.ItemLoader
import cache.loaders.NpcLoader
import cache.loaders.ObjectLoader
import com.displee.cache.CacheLibrary
import java.io.File

/**
 * @author Jack | Sep 06 2024 | github.com/jackbuch
 */
val library = CacheLibrary("cache")

fun main() {
    generateRSCM("output/object.rscm", ObjectLoader(), 6) { obj: ObjectDefinition ->
        obj.name.filtered().takeIf { it.isNotBlank() && "null" !in it }?.let { it to obj.id }
    }

    generateRSCM("output/npc.rscm", NpcLoader(), 9) { npc: NpcDefinition ->
        npc.name.filtered().takeIf { it.isNotBlank() && "null" !in it }?.let { it to npc.id }
    }

    generateRSCM("output/item.rscm", ItemLoader(), 10) { item: ItemDefinition ->
        if (item.notedTemplate > -1) {
            library.data(2, 10, item.notedID)?.let { notedData ->
                val notedItem = ItemLoader().load(item.notedID, notedData)
                item.name = "${notedItem.name} noted"
            }
        }
        item.name.filtered().takeIf { it.isNotBlank() && "null" !in it }?.let { it to item.id }
    }
}

fun <T> generateRSCM(
    outputFilePath: String,
    loader: CacheLoader<T>,
    archive: Int,
    nameExtractor: (T) -> Pair<String, Int>?
) {
    val outputFile = File(outputFilePath)
    val nameCountMap = mutableMapOf<String, Int>()

    outputFile.bufferedWriter().use { writer ->
        for (file in 0 until 65535) {
            val data = library.data(2, archive, file) ?: continue
            val definition = loader.load(file, data) ?: continue
            nameExtractor(definition)?.let { (name, id) ->
                var finalName = name
                val count = nameCountMap.getOrDefault(finalName, 0)
                if (count > 0) {
                    finalName = "${finalName}_$id"
                }
                nameCountMap[finalName] = count + 1
                writer.write("$finalName:$id\n")
            }
        }
    }
}

fun String.filtered(): String = this
    .lowercase()
    .replace("'", "")
    .replace(" ", "_")
    .replace("-", "_")
    .replace("(", "")
    .replace(")", "")
    .replace(Regex("<col=[0-9a-fA-F]{6}>"), "")
    .replace("</col>", "")