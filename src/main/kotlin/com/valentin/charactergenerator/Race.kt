package com.valentin.charactergenerator

data class Race(
    val raceName: String,
    val nameWeight: WeightedCollection,
    val nameCount: Int,
    val doubleVowelRate: Int
)