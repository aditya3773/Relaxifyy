package com.example.relaxifyy

object Anxiety {



    fun getQuestions():ArrayList<anxietyClass>{
        val questionList = ArrayList<anxietyClass>()

        val ques1 = anxietyClass(
            1,
            "Do you worry about lots of different things?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques1)

        val ques2 = anxietyClass(
            2,
            "Do you have trouble controlling your worries?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques2)

        val ques3 = anxietyClass(
            3,
            "Do you get irritable and/or easily annoyed when anxious?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques3)

        val ques4 = anxietyClass(
            4,
            "Do you worry about lots of different things?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques4)

        val ques5 = anxietyClass(
            5,
            "Does worry or anxiety make you feel fatigued or worn out?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques5)

        val ques6 = anxietyClass(
            6,
            "Does worry or anxiety interfere with falling and/or staying asleep?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques6)

        val ques7 = anxietyClass(
            7,
            "Does worry or anxiety make it hard to concentrate?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques7)

        val ques8 = anxietyClass(
            8,
            "Do you feel jumpy?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques8)

        val ques9 = anxietyClass(
            9,
            "Do you worry about how well you do things?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques9)

        val ques10 = anxietyClass(
            10,
            "Do you worry about things working out in the future?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques10)


        return questionList
    }
}