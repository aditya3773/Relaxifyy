package com.example.relaxifyy

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.relaxifyy.R
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

class RelaxActivity : AppCompatActivity() {


    var textView : TextView? = null
    var btnPause :Button? =null
    var btnStop :Button? =null
    var btnStart :Button? =null
    var mediaPlayer:MediaPlayer?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relax)
        textView = findViewById(R.id.tv)
        // Time is in millisecond so 50sec = 50000 I have used
        // countdown Interveal is 1sec = 1000 I have used
        // Time is in millisecond so 50sec = 50000 I have used
        // countdown Interveal is 1sec = 1000 I have used
        object : CountDownTimer(60000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                textView?.setText( "${millisUntilFinished / 1000} \n seconds ")
            }

            override fun onFinish() {
                mediaPlayer?.stop()
                val intent = Intent(this@RelaxActivity,HomePageActivity::class.java)
                startActivity(intent)
                Toast.makeText(this@RelaxActivity,"Congratulations on completing your relaxation therapy", Toast.LENGTH_LONG).show()

            }
        }.start()

        mediaPlayer = MediaPlayer.create(this, R.raw.sound)
        mediaPlayer?.start()
        // mediaPlayer?.start()

        btnPause=findViewById(R.id.pause)
        btnStop=findViewById(R.id.stop)
        btnStart=findViewById(R.id.start)

        btnStart?.setOnClickListener{
            mediaPlayer?.start()
        }

        btnPause?.setOnClickListener{
            pauseSong()
        }
        btnStop?.setOnClickListener{
            stopSong()

        }




        // When the task is over it will print 00:00:00 there

    }
    fun pauseSong() {
        mediaPlayer?.pause()
    }

    fun stopSong() {
        mediaPlayer?.stop()

        val intent = Intent(this@RelaxActivity,HomePageActivity::class.java)
        startActivity(intent)
        finish()
    }
}