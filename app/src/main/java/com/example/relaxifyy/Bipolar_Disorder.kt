package com.example.relaxifyy

object Bipolar_Disorder {


    fun getQuestions():ArrayList<Bipolar_Disorder_dc>{
        val questionList = ArrayList<Bipolar_Disorder_dc>()

        val ques1 = Bipolar_Disorder_dc(
            1,
            "At times I am MUCH more talkative or speak MUCH faster than usual.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques1)

        val ques2 = Bipolar_Disorder_dc(
            2,
            "There have been times when I was MUCH more active or did MANY more things than usual.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques2)

        val ques3 = Bipolar_Disorder_dc(
            3,
            "I get into moods where I feel VERY speeded up or irritable.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques3)

        val ques4 = Bipolar_Disorder_dc(
            4,
            "There have been times when I have felt both high (elated) and low (depressed) AT THE SAME TIME.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques4)

        val ques5 = Bipolar_Disorder_dc(
            5,
            "At times I have been MUCH more interested in sex than usual.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques5)

        val ques6 = Bipolar_Disorder_dc(
            6,
            "My self-confidence ranges from GREAT self-doubt to EQUALLY GREAT overconfidence.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques6)

        val ques7 = Bipolar_Disorder_dc(
            7,
            "There have been GREAT variations in the quantity or quality of my work.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques7)

        val ques8 = Bipolar_Disorder_dc(
            8,
            "FOR NO OBVIOUS REASON I sometimes have been VERY angry or hostile.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques8)

        val ques9 = Bipolar_Disorder_dc(
            9,
            "Sometimes I am mentally dull and at other times I think VERY creatively.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques9)

        val ques10 = Bipolar_Disorder_dc(
            10,
            "At times I am GREATLY interested in being with people and at other times I just want to be left alone with my thoughts.",
            "Never",
            "Rarely",
            "Sometime",
            "Often",
        )
        questionList.add(ques10)


        return questionList
    }
}
