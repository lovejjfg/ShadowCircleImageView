package com.lovejjfg.shadowcircleimageview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.CheckBox
import com.lovejjfg.shadowcircle.CircleImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById(R.id.civ) as CircleImageView

        val checkBox = findViewById(R.id.cb_shadow) as CheckBox
        checkBox.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                imageView.setShadow(9)
            } else {
                imageView.setShadow(0)

            }
        }
    }
}
