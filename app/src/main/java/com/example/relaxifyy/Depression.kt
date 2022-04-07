package com.example.relaxifyy

object Depression {

    fun getQuestions(): ArrayList<depression_dc> {
        val questionList = ArrayList<depression_dc>()

        val ques1 = depression_dc(
            1,
            "Little interest or pleasure in doing things",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques1)

        val ques2 = depression_dc(
            2,
            "Feeling down, depressed, or hopeless",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques2)

        val ques3 = depression_dc(
            3,
            "Trouble falling or staying asleep, or sleeping too much",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques3)

        val ques4 = depression_dc(
            4,
            "Feeling tired or having little energy",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques4)

        val ques5 = depression_dc(
            5,
            "Poor appetite or overeating",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques5)

        val ques6 = depression_dc(
            6,
            "Feeling bad about yourself - or that you are a failure or have let yourself or your family down",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques6)

        val ques7 = depression_dc(
            7,
            "Trouble concentrating on things, such as reading the newspaper or watching television",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques7)

        val ques8 = depression_dc(
            8,
            "Moving or speaking so slowly that other people could have noticed",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques8)

        val ques9 = depression_dc(
            9,
            "Thoughts that you would be better off dead, or of hurting yourself",
            "Not at all",
            "Several days",
            "More than half of the days",
            "Nearly every day"
        )
        questionList.add(ques9)

        val ques10 = depression_dc(
            10,
            "If you've had any days with issues above, how difficult have these problems made it for you at work, home, school, or with other people?",
            "Not difficult at all",
            "Somewhat difficult",
            "Very difficult",
            "Extremely difficult",
        )
        questionList.add(ques10)

        return questionList
    }
}
