package com.valentin.charactergenerator

import java.util.Random

class WeightedCollection(
    content: List<*>,
    weights: List<Int>,
) {

    private var aggregatedWeights: MutableList<Int>

    private var content: List<*>

    init {
        if (checkWeights(weights)) {
            this.aggregatedWeights = makeAggregatedWeights(weights)
            this.content = content
        } else {
            throw (Exception("Weights aren't good"))
        }
    }

    fun randomContent(randomNumber: Int? = randomIntUntilChosenValue(100)): Any? {
        var randomContent = content[0]
        for (i in 1 until content.size) {
            if (randomNumber != null) {
                if (aggregatedWeights[i] >= randomNumber + 1 && aggregatedWeights[i - 1] < randomNumber + 1) {
                    randomContent = content[i]
                }
            }
        }
        return randomContent
    }

    private fun makeAggregatedWeights(weights: List<Int>): MutableList<Int> {
        val aggregatedWeights = mutableListOf<Int>()
        for (i in weights.indices) {
            if (i == 0) {
                aggregatedWeights.add(weights[i])
            } else {
                aggregatedWeights.add(weights[i] + aggregatedWeights[i - 1])
            }
        }
        return aggregatedWeights
    }

    private fun checkWeights(weights: List<Int>) = weights.sum() == 100
}

fun randomIntUntilChosenValue(upperLimit: Int) = Random().nextInt(upperLimit)