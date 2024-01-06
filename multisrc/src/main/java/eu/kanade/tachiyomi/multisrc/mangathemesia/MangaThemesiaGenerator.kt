package eu.kanade.tachiyomi.multisrc.mangathemesia

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

// Formerly WPMangaStream & WPMangaReader -> MangaThemesia
class MangaThemesiaGenerator : ThemeSourceGenerator {

    override val themePkg = "mangathemesia"

    override val themeClass = "MangaThemesia"

    override val baseVersionCode: Int = 27

    override val sources = listOf(
        MultiLang("Asura Scans", "https://asuratoon.com", listOf("en", "tr"), className = "AsuraScansFactory", pkgName = "asurascans", overrideVersionCode = 31),
        SingleLang("Animated Glitched Scans", "https://anigliscans.xyz", "en", overrideVersionCode = 1),
        SingleLang("Animated Glitched Comics", "https://agscomics.com", "en"),
        SingleLang("Arena Scans", "https://arenascans.net", "en", overrideVersionCode = 1),
        SingleLang("Cosmic Scans", "https://cosmic-scans.com", "en", overrideVersionCode = 2),
        SingleLang("Flame Comics", "https://flamecomics.com", "en"),
        SingleLang("Infernal Void Scans", "https://void-scans.com", "en", overrideVersionCode = 5),
        SingleLang("Komik Cast", "https://komikcast.lol", "id", overrideVersionCode = 25),
        SingleLang("Komik Lab", "https://komiklab.com", "en", overrideVersionCode = 3),
        SingleLang("NIGHT SCANS", "https://nightscans.net", "en", isNsfw = true, className = "NightScans", overrideVersionCode = 3),
        SingleLang("Raven Scans", "https://ravenscans.com", "en", overrideVersionCode = 1),
        SingleLang("Surya Scans", "https://suryacomics.com", "en", overrideVersionCode = 2),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MangaThemesiaGenerator().createAll()
        }
    }
}
