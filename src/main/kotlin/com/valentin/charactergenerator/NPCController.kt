package com.valentin.charactergenerator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NPCController {

    @GetMapping
    fun newNPC(): NPC {
        return NPC()
    }
}