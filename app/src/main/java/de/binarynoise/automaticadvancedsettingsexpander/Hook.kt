package de.binarynoise.automaticadvancedsettingsexpander

import android.util.Log
import androidx.annotation.Keep
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_LoadPackage

const val TAG = "AutomaticSettingsExpand"

@Keep
class Hook : IXposedHookLoadPackage {
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        XposedHelpers.findAndHookMethod(
            "androidx.preference.PreferenceGroup",
            lpparam.classLoader,
            "setInitialExpandedChildrenCount",
            Int::class.javaPrimitiveType,
            object : XC_MethodHook() {
                override fun beforeHookedMethod(param: MethodHookParam) {
                    val expectedCount = param.args[0]
                    Log.d(TAG, "expandedCount would have been set to $expectedCount, but skipped")
                    param.result = Unit
                }
            },
        )
    }
}
