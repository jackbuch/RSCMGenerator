# RSCMGenerator

Generates `item`, `npc` and `object` RSCM files for use with the [RSCM (RuneScape Config Mapping) - IntelliJ IDEA Plugin](https://github.com/blurite/rscm-plugin).  

Output files for OSRS revision 224.2 can be found in [here](output).

## Setup
- Download the desired OSRS cache from [OpenRS2](https://archive.openrs2.org/) and place it inside the `cache` directory.
- Run RSCMGenerator using `./gradlew run`
- Utilize the files found in `output` for the RSCM IntelliJ Plugin setup

## Credits
- [OpenRS2](https://archive.openrs2.org/) - providing the OSRS cache
- [Displee](https://github.com/Displee) - cache library
- [ushort](https://github.com/ushort), [Z-Kris](https://github.com/z-kris), [notmeta](https://github.com/notmeta) - RSCM IntelliJ Plugin
- [Polar](https://github.com/Joshua-F) - CS2 dump/namings