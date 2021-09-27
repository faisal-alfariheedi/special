package com.example.special

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var location: EditText
    lateinit var mobile: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var na:String
        var loc: String
        var mo:String
        var toa=findViewById<Button>(R.id.toa)
        var tv=findViewById<Button>(R.id.tv)
        var tvs=findViewById<TextView>(R.id.tvshow)
        var go=findViewById<Button>(R.id.go)
        name=findViewById(R.id.name)
        location=findViewById(R.id.location)
        mobile=findViewById(R.id.mobile)
        var list=listOf(name.text,location.text,mobile.text)
        toa.setOnClickListener{
            Toast.makeText(applicationContext,list.toString(),Toast.LENGTH_SHORT).show()
        }
        tv.setOnClickListener{
            tvs.setText("$list")
        }
        go.setOnClickListener{
            val intent = Intent(this, A2::class.java)
            intent.putExtra("list",list.toString())
            startActivity(intent)
        }


    }
}