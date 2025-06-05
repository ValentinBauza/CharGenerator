package com.valentin.charactergenerator

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class NPCController {

    @GetMapping("/NPC/{race}")
    fun getNPC(
        @PathVariable race: String
    ): NPC {
        return NPC(Constantes().racesToChoose.getOrDefault(race, Constantes().races.randomContent() as Race))
    }

    @GetMapping("/NPC/random")
    fun getRandomNPC(
    ): NPC {
        return NPC()
    }

}