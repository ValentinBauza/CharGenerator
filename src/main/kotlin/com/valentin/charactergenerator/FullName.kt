package com.valentin.charactergenerator

class FullName(
    private val nameCount: Int,
    private val weightedCollection: WeightedCollection,
    private val doubleVowelRate: Int
) {
    val fullName = generateFullName()

    private fun generateFullName(): String {
        var newFullname = ""
        for (i in 1..nameCount)
            newFullname += if (i == 1) Name(weightedCollection.randomContent().toString().toInt(), randomIntUntilChosenValue(3), doubleVowelRate).name
            else " " + Name(weightedCollection.randomContent().toString().toInt(), randomIntUntilChosenValue(3), doubleVowelRate).name
        return newFullname
    }
}