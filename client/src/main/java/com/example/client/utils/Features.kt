package com.example.client.utils

import android.content.ComponentName
import android.content.Context
import android.provider.Settings
import android.text.TextUtils.SimpleStringSplitter

fun isAccessibilityServiceEnabled(context: Context, accessibilityService: Class<*>?): Boolean {
    val expectedComponentName = ComponentName(context, accessibilityService!!)
    val enabledServicesSetting: String =
        Settings.Secure.getString(context.contentResolver, "enabled_accessibility_services")
            ?: return false
    val colonSplitter = SimpleStringSplitter(':')
    colonSplitter.setString(enabledServicesSetting)
    while (colonSplitter.hasNext()) {
        val enabledService = ComponentName.unflattenFromString(colonSplitter.next())
        if (enabledService != null && enabledService == expectedComponentName) {
            return true
        }
    }
    return false
}