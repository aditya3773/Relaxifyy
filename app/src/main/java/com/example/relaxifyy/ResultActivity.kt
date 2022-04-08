package com.example.relaxifyy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvPoints:TextView=findViewById(R.id.points)
        var tvType:TextView=findViewById(R.id.tv_type)
        var tvSolution:TextView=findViewById(R.id.tv_result_solution)
        var progressBar:ProgressBar=findViewById(R.id.progress_bar)
        var points=intent.getIntExtra("points",0)
        var btnSolution:Button=findViewById(R.id.btn_result_solution)
        progressBar.progress=points*10
        tvType.text=intent.getStringExtra("type")
        tvPoints.text=points.toString()

        if(tvType.text == "Anxiety Disorder \n" +
            " Mood-O-Meter") {

            if (points <= 3) {
                tvSolution.text =
                    "Anxiety is linked to many medical conditions, so it's always a good idea to speak with your doctor about it. If you're concerned about your feelings of anxiety, that's reason enough to talk with your doctor — there's no need to wait."
            } else if (points <= 5 && points > 3) {
                tvSolution.text =
                    "Anxiety is our body’s way of saying, “Hey, I’m experiencing too much stress all at once.” This happens to the best of us. But when that feeling of being “always on alert” becomes background noise that doesn’t go away, that’s when it’s time to seek help. Mindfulness and meditation for anxiety is a growing field that can help you navigate the many ways that anxiety can affect your life."

            } else if (points <= 8 && points > 5) {
                tvSolution.text=
                    "In essence, practicing mindfulness is a process of learning to trust and stay with feelings of discomfort rather than trying to escape from or analyze them.This often leads to a remarkable shift; time and again your feelings will show you everything you need to know about them—and something you need to know for your own well-being.”"

            } else {
                tvSolution.text=
                    "When your state of mind is generally optimistic, you're better able to handle everyday stress in a more constructive way. That ability may contribute to the widely observed health benefits of positive thinking."

            }
        }else if(tvType.text=="Bipolar Disorder \n Mood-O-Meter"){
            if (points <= 3) {
                tvSolution.text ="The primary treatments for bipolar disorder include medications and psychological counseling (psychotherapy) to control symptoms, and also may include education and support groups.Please refer to consult section to contact a doctor directly"
            } else if (points <= 5 && points > 3) {
                tvSolution.text ="Even though it’s not a cure for bipolar disorder, meditation can help you relax and reduce stress. It can also help you disengage from stressful or anxious thoughts, and better control your mood."

            } else if (points <= 8 && points > 5) {
                tvSolution.text="Meditation is easy and anyone can practice it, at home or in a class. It can be a helpful addition to your bipolar disorder treatment plan."

            } else {
                tvSolution.text="n order to raise awareness about bipolar disorder, we must talk to people outside the circle. This is easier said than done, but if you are willing, you will see many opportunities. The news media, for example, reports on mental illness quite often."

            }
        }
        else if(tvType.text=="Depression\n Mood-O-Meter"){

            if (points <= 3) {
                tvSolution.text ="Psychiatrists and other mental health professionals are used to seeing a variety of mental health diagnoses and have more experience than a family doctor or general practitioner in teasing out what's behind your symptoms."
            } else if (points <= 5 && points > 3) {
                tvSolution.text ="Meditation has been found to change certain brain regions that are specifically linked with depression. For instance, scientists have shown that the medial prefrontal cortex (mPFC) becomes hyperactive in depressed people. The mPFC is often called the \"me center\" because this is where you process information about yourself, such as worrying about the future and ruminating about the past. When people get stressed about life, the mPFC goes into overdrive."

            } else if (points <= 8 && points > 5) {
                tvSolution.text="The aim of meditation is not to push aside stress or block out negative thinking, but rather to notice those thoughts and feelings, all the while understanding that you don't have to act on them. This could be as simple as closing your eyes and repeating a single phrase or word, or counting breaths. \"This helps provide some distance from those negative thoughts or stressful feelings, allowing you to recognize that, although they affect you, they are not you"

            } else {
                tvSolution.text="Raising awareness about depression is vital for ending stigmas surrounding it and other mental health disorders. Depression awareness also helps people understand that they are not alone and that many support systems are available to help them tackle this disease"

            }

        }

        btnSolution.setOnClickListener{
            if (points <= 3) {
                val intent = Intent(this,Consult::class.java)
                startActivity(intent)
                val intent2 = Intent(this,HomePageActivity::class.java)
                intent2.putExtra("mood",points)
                } else if (points <= 5 && points > 3) {
                val intent = Intent(this,RelaxActivity::class.java)
                startActivity(intent)
            } else if (points <= 8 && points > 5) {
                val intent = Intent(this,RelaxActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this,HomePageActivity::class.java)
                intent.putExtra("mood",points)
                startActivity(intent)
            }

        }



    }
}