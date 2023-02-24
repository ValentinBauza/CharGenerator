package com.valentin.charactergenerator

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
class NPCController {

    @GetMapping("/NPC")
    fun getNPC(): NPC {
        return NPC()
    }

    @PostMapping("/NPC")
    fun postNPC(): NPC {
        return NPC()
    }
}