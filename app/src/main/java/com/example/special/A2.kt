package com.example.special;

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class A2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a2)
        val tvMain = findViewById<TextView>(R.id.tva2)

        val extra = intent.extras!!.get("list")

        tvMain.text = extra.toString()
    }
}
