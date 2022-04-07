package com.example.relaxifyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePageActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        var btnTherapy:Button=findViewById(R.id.btn_therapy)
        var btnRelax:Button=findViewById(R.id.btn_relax)
        var btnConsult:Button=findViewById(R.id.btn_consult)

        btnTherapy.setOnClickListener{
            val intent = Intent(this,OptionActivity::class.java)
            startActivity(intent)
        }
    }
}