package eu.kanade.tachiyomi.multisrc.madara

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class MadaraGenerator : ThemeSourceGenerator {

    override val themePkg = "madara"

    override val themeClass = "Madara"

    override val baseVersionCode: Int = 32

    override val sources = listOf(
        SingleLang("Ansh Scans", "https://anshscans.org", "en", overrideVersionCode = 1),
        SingleLang("Arcanescans", "https://arcanescans.com", "en"),
        SingleLang("Dark Scans", "https://darkscans.com", "en", overrideVersionCode = 1),
        SingleLang("Drake Scans", "https://drakescans.com", "en", overrideVersionCode = 4),
        SingleLang("GalaxyDegenScans", "https://gdscans.com", "en", overrideVersionCode = 4),
        SingleLang("IsekaiScan.com", "https://isekaiscan.com", "en", className = "IsekaiScanCom", overrideVersionCode = 4),
        SingleLang("KSGroupScans", "https://ksgroupscans.com", "en"),
        SingleLang("Leviatan Scans", "https://lscomic.com", "en", overrideVersionCode = 15),
        SingleLang("LHTranslation", "https://lhtranslation.net", "en", overrideVersionCode = 1),
        SingleLang("NekoScan", "https://nekoscan.com", "en", overrideVersionCode = 2),
        SingleLang("Platinum Crown", "https://platinumscans.com", "en", overrideVersionCode = 1),
        SingleLang("Rightdark Scan", "https://rightdark-scan.com", "es"),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MadaraGenerator().createAll()
        }
    }
}
