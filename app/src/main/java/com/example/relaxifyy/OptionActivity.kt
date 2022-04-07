package com.example.relaxifyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OptionActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)
    }

    override fun onClick(view: View?) {
        when(view?.id) {

            R.id.anxiety -> {
                val intent = Intent(this , AnxietyActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.bipolar -> {
                val intent = Intent(this , BipolarActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.depression -> {
                val intent = Intent(this , DepressionActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }
}