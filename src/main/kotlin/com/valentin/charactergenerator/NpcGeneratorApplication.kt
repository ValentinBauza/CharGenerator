package com.valentin.charactergenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NpcGeneratorApplication

fun main(args: Array<String>) {
	runApplication<NpcGeneratorApplication>(*args)
	val mainNPC = NPC()
	val elfNPC = NPC(Constantes().elfRace)

	println("Randomly generated character: ${mainNPC.name} ${mainNPC.age} ${mainNPC.occupation} ${mainNPC.gender} ${mainNPC.alignment} ${mainNPC.appearance} ${mainNPC.raceName}")
	println("Randomly generated elf character: ${elfNPC.name} ${elfNPC.age} ${elfNPC.occupation} ${elfNPC.gender} ${elfNPC.alignment} ${elfNPC.appearance} ${elfNPC.raceName}")
}
