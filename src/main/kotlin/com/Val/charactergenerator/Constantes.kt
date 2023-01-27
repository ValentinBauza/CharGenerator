package com.Val.charactergenerator

class Constantes {
    val vowels = arrayOf("a", "e", "i", "o", "u", "y")
    val consonants =
        arrayOf("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z")
    val races = makeRaces()
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

        val human = makeRace("human", arrayListOf(3, 4, 5, 6, 7, 8, 9), arrayListOf(5, 10, 15, 20, 25, 20, 5), 2)
        val orc = makeRace("orc", arrayListOf(3, 4, 5, 6), arrayListOf(30, 35, 25, 10), 1)
        val elf = makeRace("elf", arrayListOf(5, 6, 7, 8, 9, 10), arrayListOf(10, 10, 25, 25, 20, 10), 3)
        val dwarf = makeRace("dwarf", arrayListOf(5, 6, 7, 8, 9, 10), arrayListOf(5, 10, 15, 25, 25, 20), 3)
        val halfling = makeRace("halfling", arrayListOf(5, 6, 7, 8), arrayListOf(30, 50, 15, 5), 2)
        val tiefling = makeRace("tiefling", arrayListOf(5, 6, 7, 8, 9), arrayListOf(20, 25, 30, 20, 5), 1)
        val gnome = makeRace("gnome", arrayListOf(5, 6, 7, 8), arrayListOf(40, 45, 10, 5), 2)
        val halfelf = makeRace("half-elf", arrayListOf(5, 6, 7, 8, 9, 10), arrayListOf(5, 10, 25, 30, 25, 5), 3)
        val halforc = makeRace("half-orc", arrayListOf(3, 4, 5, 6, 7), arrayListOf(5, 25, 40, 25, 5), 2)
        val dragonborn =
            makeRace("dragonborn", arrayListOf(6, 7, 8, 9, 10, 11, 12, 13, 14), arrayListOf(5, 10, 15, 10, 20, 15, 15, 5, 5), 3)

        val raceContent = arrayListOf(human, orc, elf, dwarf, halfling, tiefling, gnome, halfelf, halforc, dragonborn)
        val raceWeights = arrayListOf(25, 10, 10, 10, 5, 5, 10, 10, 10, 5)

        return WeightedCollection(raceContent, raceWeights)
    }

    private fun makeRace(
        raceName: String,
        raceNameLenghts: ArrayList<Int>,
        raceNameWeights: ArrayList<Int>,
        raceNameCount: Int
    ) = Race(raceName, WeightedCollection(raceNameLenghts, raceNameWeights), raceNameCount)

}