package com.Val.NPCGenerator

class Name(
    private val nameLength: Int,
    private val firstLetter: Int
    ) {

    var name: String

    private fun generateName(): String {
        var newName = ""
        val numberOfVowels = Constantes().vowels.size
        val numberOfConsonants = Constantes().consonants.size
        for (i in 0 until nameLength) {
            newName = if (i % 3 == firstLetter) {
                if (i == 0) {
                    newName + Constantes().vowels[randomIntUntilChosenValue(numberOfVowels)].uppercase()
                } else {
                    newName + Constantes().vowels[randomIntUntilChosenValue(numberOfVowels)]
                }
            } else {
                if (i == 0) {
                    newName + Constantes().consonants[randomIntUntilChosenValue(numberOfConsonants)].uppercase()
                } else {
                    newName + Constantes().consonants[randomIntUntilChosenValue(numberOfConsonants)]
                }
            }
        }
        return newName
    }

    init {
        this.name = generateName()
    }
}