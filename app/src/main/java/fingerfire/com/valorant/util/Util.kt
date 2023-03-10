package fingerfire.com.valorant.util

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import java.util.*

class Util {

    companion object {

        val setAppLanguage: String
            get() {
                return Locale.getDefault().toLanguageTag()
            }
    }

    fun createGradientDrawable(
        startColor: String,
        centerColor: String,
        endColor: String
    ): GradientDrawable {
        val startColorInt = Color.parseColor(startColor)
        val centerColor = Color.parseColor(centerColor)
        val endColorInt = Color.parseColor(endColor)
        val colors = intArrayOf(startColorInt, centerColor, endColorInt)
        return GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, colors)
    }

     fun initAdMob(adView: AdView) {
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }
}