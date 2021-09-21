package com.example.accesstestproject

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.AccessibilityDelegateCompat
import androidx.core.view.ViewCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import androidx.core.view.children
import androidx.core.view.isVisible

class Cell(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    init {
        View.inflate(context, R.layout.item_t, this)
        orientation = LinearLayout.VERTICAL
    }

}
