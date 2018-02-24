package purez.zawzaw.materialredtheme

import purez.zawzaw.materialredtheme.BuildConfig.SUPPORTS_THIRD_PARTY_THEME_SYSTEMS

object Constants {

    const internal val SUBSTRATUM_FILTER_CHECK = false

    const val ENFORCE_MINIMUM_SUBSTRATUM_VERSION = true
    const val MINIMUM_SUBSTRATUM_VERSION = 712 // 510 is the final MM build
    const val ENABLE_KNOWN_THIRD_PARTY_THEME_MANAGERS = SUPPORTS_THIRD_PARTY_THEME_SYSTEMS

    val BLACKLISTED_APPLICATIONS = arrayOf(
            "cc.madkite.freedom",
            "zone.jasi2169.uretpatcher",
            "uret.jasi2169.patcher",
            "p.jasi2169.al3",
            "com.dimonvideo.luckypatcher",
            "com.chelpus.lackypatch",
            "com.forpda.lp",
            "com.android.vending.billing.InAppBillingService.LUCK",
            "com.android.vending.billing.InAppBillingService.CLON",
            "com.android.vending.billing.InAppBillingService.LOCK",
            "com.android.vending.billing.InAppBillingService.CRAC",
            "com.android.vending.billing.InAppBillingService.LACK",
            "com.android.vendinc",
            "com.appcake",
            "ac.market.store",
            "org.sbtools.gamehack",
            "com.zune.gamekiller",
            "com.aag.killer",
            "com.killerapp.gamekiller",
            "cn.lm.sq",
            "net.schwarzis.game_cih",
            "org.creeplays.hack",
            "com.baseappfull.fwd",
            "com.zmapp",
            "com.dv.marketmod.installer",
            "org.mobilism.android",
            "com.blackmartalpha",
            "org.blackmart.market"
    )

    // fucking shit SlimROM. (Are you a thief?...LOL)
    val OTHER_THEME_SYSTEMS = arrayOf(
            "com.slimroms.thememanager",
            "com.slimroms.omsbackend"
    )

}