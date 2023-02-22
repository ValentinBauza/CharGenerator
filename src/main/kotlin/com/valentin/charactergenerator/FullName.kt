package com.valentin.charactergenerator

class FullName(
    private val nameCount: Int,
    private val weightedCollection: WeightedCollection
) {
    val fullName = generateFullName()

    private fun generateFullName(): String {
        var newFullname = ""
        for (i in 1..nameCount)
            newFullname += if (i == 1) Name(weightedCollection.randomContent().toString().toInt(), randomIntUntilChosenValue(3)).name
            else " " + Name(weightedCollection.randomContent().toString().toInt(), randomIntUntilChosenValue(3)).name
        return newFullname
    }
}