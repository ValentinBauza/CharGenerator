package com.Val.charactergenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NpcGeneratorApplication

fun main(args: Array<String>) {
	runApplication<NpcGeneratorApplication>(*args)
	val mainNPC = NPC()

	println("${mainNPC.name} ${mainNPC.age} ${mainNPC.occupation} ${mainNPC.gender} ${mainNPC.alignment} ${mainNPC.appearance} ${mainNPC.raceName}")
}
