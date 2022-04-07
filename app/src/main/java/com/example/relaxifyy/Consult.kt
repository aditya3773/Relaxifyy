package com.example.relaxifyy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Consult : AppCompatActivity(), View.OnClickListener {

    private var call_1 : ImageView? = null
    private var call_2 : ImageView? = null
    private var call_3 : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consult)

        call_1 = findViewById(R.id.call_icon_1)
        call_2 = findViewById(R.id.call_icon_2)
        call_3 = findViewById(R.id.call_icon_3)

        call_1?.setOnClickListener(this)
        call_2?.setOnClickListener(this)
        call_3?.setOnClickListener(this)
    }

    override fun onClick(View: View?) {
        when(View?.id) {
            R.id.call_icon_1-> {
                var intent = Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:12123123132"))
                startActivity(intent)
            }

            R.id.call_icon_2-> {
                var intent = Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:12123123132"))
                startActivity(intent)
            }

            R.id.call_icon_3-> {
                var intent = Intent(Intent.ACTION_DIAL)
                intent.setData(Uri.parse("tel:12123123132"))
                startActivity(intent)
            }
        }
    }
}