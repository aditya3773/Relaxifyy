package com.example.relaxifyy

object Anxiety {



    fun getQuestions():ArrayList<anxiety>{
        val questionList = ArrayList<anxiety>()

        val ques1 = anxiety(
            1,
            "Do you worry about lots of different things?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques1)

        val ques2 = anxiety(
            2,
            "Do you have trouble controlling your worries?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques2)

        val ques3 = anxiety(
            3,
            "Do you get irritable and/or easily annoyed when anxious?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques3)

        val ques4 = anxiety(
            4,
            "Do you worry about lots of different things?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques4)

        val ques5 = anxiety(
            5,
            "Does worry or anxiety make you feel fatigued or worn out?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques5)

        val ques6 = anxiety(
            6,
            "Does worry or anxiety interfere with falling and/or staying asleep?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques6)

        val ques7 = anxiety(
            7,
            "Does worry or anxiety make it hard to concentrate?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques7)

        val ques8 = anxiety(
            8,
            "Do you feel jumpy?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques8)

        val ques9 = anxiety(
            9,
            "Do you worry about how well you do things?",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
            )
        questionList.add(ques9)

        val ques10 = anxiety(
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