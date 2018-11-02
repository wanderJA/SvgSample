package com.wander.svgsample

import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isCheckSelect = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rotation.setOnClickListener { (rotation.drawable as Animatable).start() }
        androidAnim.setOnClickListener { (androidAnim.drawable as Animatable).start() }
        morphing.setOnClickListener {
            isCheckSelect = !isCheckSelect
            morphing.setImageState(
                intArrayOf(if (isCheckSelect) android.R.attr.state_checked else -android.R.attr.state_checked),
                true
            )


        }
    }
}
