package com.example.kotlinprogressbar

import ademar.phasedseekbar.PhasedListener
import ademar.phasedseekbar.PhasedSeekBar
import ademar.phasedseekbar.SimplePhasedAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val psbStar = findViewById<PhasedSeekBar>(R.id.psb_star)
//        var psbNoImages = findViewById<PhasedSeekBar>(R.id.psb_no_images)

        val resources = resources

        psbStar.setAdapter(
            SimplePhasedAdapter(
                resources, intArrayOf(
                    R.drawable.ic_point
                )
            )
        )
    }
}