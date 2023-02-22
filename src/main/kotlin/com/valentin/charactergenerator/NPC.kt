package com.valentin.charactergenerator

data class NPC(
    val race: Race = Constantes().races.randomContent() as Race,
    val name: String = FullName(race.nameCount, race.nameWeight).fullName,
    val age: String = Constantes().age.random(),
    val gender: String = Constantes().gender.random(),
    val occupation: String = Constantes().occupation.random(),
    val appearance: String = Constantes().appearance.random(),
    val alignment: String = Constantes().alignment.random()
) {
    val raceName: String = race.raceName
}