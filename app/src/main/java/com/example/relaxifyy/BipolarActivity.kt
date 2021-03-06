package com.example.relaxifyy

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class BipolarActivity : AppCompatActivity() , View.OnClickListener{


        var points:Int = 0

        var question : TextView? = null
        var option1 : TextView? = null
        var option2 : TextView? = null
        var option3 : TextView? = null
        var option4 : TextView? = null
        var selectedOption : Int? = null
        var questionList : ArrayList<Bipolar_Disorder_dc>? = null
        var currentPosition : Int =1
        var buttonNext : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bipolar)
        question = findViewById(R.id.question)
        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)
        buttonNext=findViewById(R.id.buttonNext)

        option1?.setOnClickListener(this)
        option2?.setOnClickListener(this)
        option3?.setOnClickListener(this)
        option4?.setOnClickListener(this)
        buttonNext?.setOnClickListener(this)

        points=0

        questionList = Bipolar_Disorder.getQuestions()

        getQues()
    }
        fun getQues(){
            defaultOptionView()
            val particularQuestion: Bipolar_Disorder_dc = questionList!!.get(currentPosition-1)
            question?.text= particularQuestion.question
            option1?.text= particularQuestion.option1
            option2?.text= particularQuestion.option2
            option3?.text= particularQuestion.option3
            option4?.text= particularQuestion.option4

            buttonNext?.text="SUBMIT"
        }

        fun selectedOptionView(tv:TextView,selectedOptionNo:Int){

            defaultOptionView()
            selectedOption = selectedOptionNo
            tv.background= ContextCompat.getDrawable(this,R.drawable.selected_option)
        }

        fun defaultOptionView(){

            var options = ArrayList<TextView>()

            option1?.let{
                options.add(0,it)
            }
            option2?.let{
                options.add(1,it)
            }
            option3?.let{
                options.add(2,it)
            }
            option4?.let{
                options.add(3,it)
            }

            for (option in options) {
                option.background= ContextCompat.getDrawable(this, R.drawable.normaal_option)
            }

        }

        override fun onClick(view: View?) {

            when(view?.id){

                R.id.option1 -> {
                    option1?.let{
                        selectedOptionView(it,1)
                    }
                }
                R.id.option2 -> {
                    option2?.let{
                        selectedOptionView(it,2)
                    }
                }
                R.id.option3 -> {
                    option3?.let{
                        selectedOptionView(it,3)
                    }
                }
                R.id.option4 -> {
                    option4?.let{
                        selectedOptionView(it,4)
                    }
                }
                R.id.buttonNext -> {

                    if(selectedOption==0){
                        currentPosition++
                        when{currentPosition <= questionList!!.size -> {
                            getQues()
                        }
                            else -> {
                                val intent = Intent(this,ResultActivity::class.java)
                                intent.putExtra("points",(points/4))
                                intent.putExtra("type","Bipolar Disorder \n Mood-O-Meter")
                                startActivity(intent)
                                finish()
                            }
                        }
                    }else {


                        val question = questionList?.get(currentPosition - 1)
                        points+= (5- selectedOption!!)
                        if (currentPosition == questionList!!.size) {
                            buttonNext?.text= "FINISH"
                        } else {
                            buttonNext?.text= "GO TO NEXT QUESTION"
                        }

                        selectedOption = 0
                    }


                }
            }
    }
}