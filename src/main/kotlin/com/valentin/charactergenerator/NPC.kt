package com.valentin.charactergenerator

data class NPC(
    val race: Race = Constantes().races.randomContent() as Race,
    val name: String = FullName(race.nameCount, race.nameWeight, race.doubleVowelRate).fullName,
    val age: String = Constantes().ageMap.keys.random(),
    val gender: String = Constantes().genderMap.keys.random(),
    val occupation: String = Constantes().occupationMap.keys.random(),
    val appearance: String = Constantes().appearanceMap.keys.random(),
    val alignment: String = Constantes().alignmentMap.keys.random(),
    val description: String = makeDescription(race, name, age, gender, occupation, appearance, alignment)
) {
    val raceName: String = race.raceName
}

fun makeDescription(
    race: Race,
    name: String,
    age: String,
    gender: String,
    occupation: String,
    appearance: String,
    alignment: String
): String {
    val descriptions = NpcDescriptions()
    val constantes = Constantes()

    val nameDescription = descriptions.nameDescriptionArray.random().replace("<nameValue>", name)
    val raceDescription = constantes.raceMap.getValue(race.raceName).random()
    val genderDescription = constantes.genderMap.getValue(gender).random()
    val ageDescriptions = constantes.ageMap.getValue(age).random()
    val occupationDescription = constantes.occupationMap.getValue(occupation).random()
    val appearanceDescription = constantes.appearanceMap.getValue(appearance).random()
    val alignmentDescription = constantes.alignmentMap.getValue(alignment).random()
    return "$nameDescription $raceDescription $genderDescription $ageDescriptions $occupationDescription $appearanceDescription $alignmentDescription"
}
