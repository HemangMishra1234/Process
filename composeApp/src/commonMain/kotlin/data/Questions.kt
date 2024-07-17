package data

data class Questions(
    val name: String,
    val question: String,
    val estimatedTimeInMin: Int,
    val order: Int
)

data class CollectionOfQuestions(val name: String, val collection: List<Questions>)

val normalLowMood: List<Questions> = listOf(
    Questions(
        "Current feeling", "Can you describe what you are feeling right now?",
        2, 1
    ),
    Questions(
        "Current thoughts", "What thoughts are accompanying this emotion?",
        2, 2
    ),
    Questions(
        "Past pattern", "Have you noticed any patterns in how and when this emotion arises?",
        2, 3
    ),
    Questions(
        "Handle the emotion", "What would help you feel better or more in control of this emotion?",
        2, 4
    ),
    Questions(
        "Power", "Is there a possibility that you can simply use this emotion for your power?",
        2, 5
    )
)

val veryLowMood: List<Questions> = listOf(
    Questions(
        "Current feeling", "Can you describe what you are feeling right now?",
        2, 1
    ),
    Questions(
        "Current thoughts", "What thoughts are accompanying this emotion?",
        2, 2
    ),
    Questions(
        "Past pattern", "Have you noticed any patterns in how and when this emotion arises?",
        2, 3
    ),
    Questions(
        "Handle the emotion", "What would help you feel better or more in control of this emotion?",
        2, 4
    ),
    Questions(
        "Power", "Is there a possibility that you can simply use this emotion for your power?",
        2, 5
    )
)


val listOfOptions = listOf(
    CollectionOfQuestions("Low Mood", normalLowMood), CollectionOfQuestions(
        "Very Low Mood", veryLowMood
    )
)
