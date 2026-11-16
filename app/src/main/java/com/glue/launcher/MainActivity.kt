
package com.glue.launcher

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 48, 24, 24)
            setBackgroundColor(Color.rgb(18, 20, 32))
        }

        val title = TextView(this).apply {
            text = "GLUE LAUNCHER"
            textSize = 28f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Minecraft Java Launcher • V0.1"
            textSize = 15f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val play = Button(this).apply {
            text = "PLAY"
        }

        val versions = Button(this).apply {
            text = "Version Manager"
        }

        val mods = Button(this).apply {
            text = "Mods & Resource Packs"
        }

        val account = Button(this).apply {
            text = "Account"
        }

        val settings = Button(this).apply {
            text = "Settings"
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(play)
        root.addView(versions)
        root.addView(mods)
        root.addView(account)
        root.addView(settings)

        setContentView(root)
    }
}
