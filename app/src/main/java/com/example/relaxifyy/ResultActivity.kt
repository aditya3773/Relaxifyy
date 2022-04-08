package com.example.relaxifyy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvPoints:TextView=findViewById(R.id.points)
        var tvType:TextView=findViewById(R.id.tv_type)

        tvType.text=intent.getStringExtra("type")
        tvPoints.text=intent.getIntExtra("points",0).toString()

    }
}