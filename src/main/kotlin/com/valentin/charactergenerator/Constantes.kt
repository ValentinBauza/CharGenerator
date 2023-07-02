package com.valentin.charactergenerator

class Constantes {
    val vowels = arrayOf("a", "e", "i", "o", "u", "y")
    val consonants =
        arrayOf("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z")
    val races = makeRaces()
    val elfRace = makeElfRace()
    val humanRace = makeHumanRace()
    val dwarfRace = makeDwarfRace()
    val halflingRace = makeHalflingRace()
    val halfelfRace = makeHalfelfRace()
    val halforcRace = makeHalforcRace()
    val gnomeRace = makeGnomeRace()
    val tieflingRace = makeTieflingRace()
    val dragonbornRace = makeDragonbornRace()
    val orcRace = makeOrcRace()
    val racesToChoose = mapOf(
        "elf" to elfRace,
        "human" to humanRace,
        "dwarf" to dwarfRace,
        "halfling" to halflingRace,
        "halfelf" to halfelfRace,
        "halforc" to halforcRace,
        "gnome" to gnomeRace,
        "tiefling" to tieflingRace,
        "dragonborn" to dragonbornRace,
        "orc" to orcRace,
        )
    val gender = arrayOf("Male", "Female", "Non-binary")
    val age = arrayOf("Child", "Teenager", "Adult", "Middle-aged", "Elderly")
    val occupation = arrayOf(
        "Apothecary",
        "Armorer",
        "Alchemist",
        "Apprentice",
        "Baker",
        "Bandit",
        "Beggar",
        "Blacksmith",
        "Brewer",
        "Busker",
        "Butcher",
        "Camp follower",
        "Carpenter",
        "Carter",
        "Cheesemaker",
        "Cook",
        "Cordwainer",
        "Costermonger",
        "Court jester",
        "Diplomat",
        "Falconer",
        "Farmer",
        "Fishmonger",
        "Furrier",
        "Fletcher",
        "Gardener",
        "Gravedigger",
        "Grocer",
        "Groom",
        "Innkeeper",
        "Jeweler",
        "Locksmith",
        "Mason",
        "Merchant",
        "Miller",
        "Minstrel",
        "Outlaw",
        "Page",
        "Poison tester",
        "Peasant",
        "Pig farmer",
        "Painter",
        "Ropemaker",
        "Sailor",
        "Scribe",
        "Servant",
        "Shepherd",
        "Silversmith",
        "Skinner",
        "Soldier",
        "Spy",
        "Squire",
        "Storyteller",
        "Summoner",
        "Tailor",
        "Tanner",
        "Tax collector",
        "Trader",
        "Guard",
        "Winemaker"
    )
    val appearance = arrayOf(
        "Earrings",
        "Necklace",
        "Circlet",
        "Bracelet",
        "Piercings",
        "Outlandish clothes",
        "Flamboyant clothes",
        "Formal clothes",
        "Ragged clothes",
        "Scar",
        "Missing teeth",
        "Missing finger",
        "Unusual eye color",
        "Tattoos",
        "Birthmark",
        "Unusual skin color",
        "Bald",
        "Braided hair",
        "Unusual hair color",
        "Beautiful",
        "Ugly",
        "Crooked",
        "Rigid",
        "Distinctive Nose"
    )
    val alignment = arrayOf(
        "Lawful good",
        "Neutral good",
        "Chaotic good",
        "Lawful neutral",
        "True neutral",
        "Chaotic neutral",
        "Lawful evil",
        "Neutral evil",
        "Chaotic evil",
        "Unaligned"
    )

    private fun makeRaces(): WeightedCollection {

        val human = makeHumanRace()
        val orc = makeOrcRace()
        val elf = makeElfRace()
        val dwarf = makeDwarfRace()
        val halfling = makeHalflingRace()
        val tiefling = makeTieflingRace()
        val gnome = makeGnomeRace()
        val halfelf = makeHalfelfRace()
        val halforc = makeHalforcRace()
        val dragonborn = makeDragonbornRace()

        val raceContent = arrayListOf(human, orc, elf, dwarf, halfling, tiefling, gnome, halfelf, halforc, dragonborn)
        val raceWeights = arrayListOf(25, 10, 10, 10, 5, 5, 10, 10, 10, 5)

        return WeightedCollection(raceContent, raceWeights)
    }

    private fun makeDragonbornRace(): Race {
        return makeRace("dragonborn", arrayListOf(6, 7, 8, 9, 10, 11, 12, 13, 14), arrayListOf(5, 10, 15, 10, 20, 15, 15, 5, 5), 3, 50)
    }

    private fun makeHalforcRace(): Race {
        return makeRace("half-orc", arrayListOf(3, 4, 5, 6, 7), arrayListOf(5, 25, 40, 25, 5), 2, 10)
    }

    private fun makeHalfelfRace(): Race {
        return makeRace("half-elf", arrayListOf(5, 6, 7, 8, 9, 10), arrayListOf(5, 10, 25, 30, 25, 5), 3, 40)
    }

    private fun makeGnomeRace(): Race {
        return makeRace("gnome", arrayListOf(5, 6, 7, 8), arrayListOf(40, 45, 10, 5), 2, 30)
    }

    private fun makeTieflingRace(): Race {
        return makeRace("tiefling", arrayListOf(5, 6, 7, 8, 9), arrayListOf(20, 25, 30, 20, 5), 1, 20)
    }

    private fun makeHalflingRace(): Race {
        return makeRace("halfling", arrayListOf(5, 6, 7, 8), arrayListOf(30, 50, 15, 5), 2, 30)
    }

    private fun makeDwarfRace(): Race {
        return makeRace("dwarf", arrayListOf(5, 6, 7, 8, 9, 10), arrayListOf(5, 10, 15, 25, 25, 20), 3, 10)
    }

    private fun makeOrcRace(): Race {
        return makeRace("orc", arrayListOf(3, 4, 5, 6), arrayListOf(30, 35, 25, 10), 1, 5)
    }

    private fun makeElfRace(): Race {
        return makeRace("elf", arrayListOf(5, 6, 7, 8, 9, 10), arrayListOf(10, 10, 25, 25, 20, 10), 3, 60)
    }

    private fun makeHumanRace(): Race {
        return makeRace("human", arrayListOf(3, 4, 5, 6, 7, 8, 9), arrayListOf(5, 10, 15, 20, 25, 20, 5), 2, 30)
    }

    private fun makeRace(
        raceName: String,
        raceNameLenghts: ArrayList<Int>,
        raceNameWeights: ArrayList<Int>,
        raceNameCount: Int,
        raceDoubleVowelRate: Int
    ) = Race(raceName, WeightedCollection(raceNameLenghts, raceNameWeights), raceNameCount, raceDoubleVowelRate)

}