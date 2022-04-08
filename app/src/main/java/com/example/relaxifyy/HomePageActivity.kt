package com.example.relaxifyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomePageActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        var btnTherapy:Button=findViewById(R.id.btn_therapy)
        var btnRelax:Button=findViewById(R.id.btn_relax)
        var btnConsult:Button=findViewById(R.id.btn_consult)
        var tvUsername:TextView=findViewById(R.id.tv_username)
        var tvMoodometer:TextView=findViewById(R.id.tv_mood)

        tvMoodometer.text="Mood-O-Meter: ${intent.getIntExtra("mood",5)}"

        tvUsername.text="Hi ${intent.getStringExtra("username")}"
        btnTherapy.setOnClickListener{
            val intent = Intent(this,OptionActivity::class.java)
            startActivity(intent)
        }

        btnRelax.setOnClickListener{
            val intent = Intent(this,RelaxActivity::class.java)
            startActivity(intent)
        }

        btnConsult.setOnClickListener{
            val intent = Intent(this,Consult::class.java)
            startActivity(intent)
        }

    }
}