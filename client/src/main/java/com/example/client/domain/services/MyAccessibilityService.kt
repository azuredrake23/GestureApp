package com.example.client.domain.services

import android.accessibilityservice.AccessibilityGestureEvent
import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.graphics.Path
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import com.example.client.MainActivity

class MyAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d("Accessibility_service", event!!.eventType.toString())
        when (event.eventType) {
            AccessibilityEvent.TYPE_GESTURE_DETECTION_START -> {
                Log.d("Accessibility_service", "TYPE_GESTURE_DETECTION_START")}
            AccessibilityEvent.TYPE_GESTURE_DETECTION_END -> {Log.d("Accessibility_service", "TYPE_GESTURE_DETECTION_END")}
        }
    }

    override fun onGesture(gestureEvent: AccessibilityGestureEvent): Boolean {
        Log.d("Accessibility_service", gestureEvent.toString())
        return super.onGesture(gestureEvent)
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        Log.d("Accessibility_service", "onServiceConnected")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onInterrupt() {
        Log.d("Accessibility_service", "INTERRUPTED")
        stopSelf()
    }

    override fun onDestroy() {
        Log.d("Accessibility_service", "onDestroy")
        super.onDestroy()
    }
}



