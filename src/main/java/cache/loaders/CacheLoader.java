package cache.loaders;

/**
 * @author Jack | Sep 06 2024 | github.com/jackbuch
 */
public interface CacheLoader<T> {
    T load(int id, byte[] data);
}
