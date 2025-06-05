package com.valentin.charactergenerator

class Constantes {
    val descriptions = NpcDescriptions()
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
    val raceMap = mapOf(
        "elf" to descriptions.elfDescriptionArray,
        "human" to descriptions.humanDescriptionArray,
        "dwarf" to descriptions.dwarfDescriptionArray,
        "halfling" to descriptions.halflingDescriptionArray,
        "half-elf" to descriptions.halfelfDescriptionArray,
        "half-orc" to descriptions.halforcDescriptionArray,
        "gnome" to descriptions.gnomeDescriptionArray,
        "tiefling" to descriptions.tieflingDescriptionArray,
        "dragonborn" to descriptions.dragonbornDescriptionArray,
        "orc" to descriptions.orcDescriptionArray,
    )
    val genderMap = mapOf("Male" to descriptions.maleDescriptionArray, "Female" to descriptions.femaleDescriptionArray)
    val ageMap = mapOf(
        "Child" to descriptions.childDescriptionArray,
        "Teenager" to descriptions.teenagerDescriptionArray,
        "Adult" to descriptions.adultDescriptionArray,
        "Middle-aged" to descriptions.middleagedDescriptionArray,
        "Elderly" to descriptions.elderlyDescriptionArray
    )
    val occupationMap = mapOf(
        "Apothecary" to descriptions.apothecaryDescriptionArray,
        "Armorer" to descriptions.armorerDescriptionArray,
        "Alchemist" to descriptions.alchemistDescriptionArray,
        "Apprentice" to descriptions.apprenticeDescriptionArray,
        "Baker" to descriptions.bakerDescriptionArray,
        "Bandit" to descriptions.banditDescriptionArray,
        "Beggar" to descriptions.beggarDescriptionArray,
        "Blacksmith" to descriptions.blacksmithDescriptionArray,
        "Brewer" to descriptions.brewerDescriptionArray,
        "Busker" to descriptions.buskerDescriptionArray,
        "Butcher" to descriptions.butcherDescriptionArray,
        "Camp follower" to descriptions.campfollowerDescriptionArray,
        "Carpenter" to descriptions.carpenterDescriptionArray,
        "Carter" to descriptions.carterDescriptionArray,
        "Cheesemaker" to descriptions.cheesemakerDescriptionArray,
        "Cook" to descriptions.cookDescriptionArray,
        "Cordwainer" to descriptions.cordwainerDescriptionArray,
        "Costermonger" to descriptions.costermongerDescriptionArray,
        "Court jester" to descriptions.courtjesterDescriptionArray,
        "Diplomat" to descriptions.diplomatDescriptionArray,
        "Falconer" to descriptions.falconerDescriptionArray,
        "Farmer" to descriptions.farmerDescriptionArray,
        "Fishmonger" to descriptions.fishmongerDescriptionArray,
        "Furrier" to descriptions.furrierDescriptionArray,
        "Fletcher" to descriptions.fletcherDescriptionArray,
        "Gardener" to descriptions.gardenerDescriptionArray,
        "Gravedigger" to descriptions.gravediggerDescriptionArray,
        "Grocer" to descriptions.grocerDescriptionArray,
        "Groom" to descriptions.groomDescriptionArray,
        "Innkeeper" to descriptions.innkeeperDescriptionArray,
        "Jeweler" to descriptions.jewelerDescriptionArray,
        "Locksmith" to descriptions.locksmithDescriptionArray,
        "Mason" to descriptions.masonDescriptionArray,
        "Merchant" to descriptions.merchantDescriptionArray,
        "Miller" to descriptions.millerDescriptionArray,
        "Minstrel" to descriptions.minstrelDescriptionArray,
        "Outlaw" to descriptions.outlawDescriptionArray,
        "Page" to descriptions.pageDescriptionArray,
        "Poison tester" to descriptions.poisontesterDescriptionArray,
        "Peasant" to descriptions.peasantDescriptionArray,
        "Pig farmer" to descriptions.pigfarmerDescriptionArray,
        "Painter" to descriptions.painterDescriptionArray,
        "Ropemaker" to descriptions.ropemakerDescriptionArray,
        "Sailor" to descriptions.sailorDescriptionArray,
        "Scribe" to descriptions.scribeDescriptionArray,
        "Servant" to descriptions.servantDescriptionArray,
        "Shepherd" to descriptions.shepherdDescriptionArray,
        "Silversmith" to descriptions.silversmithDescriptionArray,
        "Skinner" to descriptions.skinnerDescriptionArray,
        "Soldier" to descriptions.soldierDescriptionArray,
        "Spy" to descriptions.spyDescriptionArray,
        "Squire" to descriptions.squireDescriptionArray,
        "Storyteller" to descriptions.storytellerDescriptionArray,
        "Summoner" to descriptions.summonerDescriptionArray,
        "Tailor" to descriptions.tailorDescriptionArray,
        "Tanner" to descriptions.tannerDescriptionArray,
        "Tax collector" to descriptions.taxcollectorDescriptionArray,
        "Trader" to descriptions.traderDescriptionArray,
        "Guard" to descriptions.guardDescriptionArray,
        "Winemaker" to descriptions.winemakerDescriptionArray
    )
    val appearanceMap = mapOf(
        "Earrings" to descriptions.earringsDescriptionArray,
        "Necklace" to descriptions.necklaceDescriptionArray,
        "Circlet" to descriptions.circletDescriptionArray,
        "Bracelet" to descriptions.braceletDescriptionArray,
        "Piercings" to descriptions.piercingsDescriptionArray,
        "Outlandish clothes" to descriptions.outlandishclothesDescriptionArray,
        "Flamboyant clothes" to descriptions.flamboyantclothesDescriptionArray,
        "Formal clothes" to descriptions.formalclothesDescriptionArray,
        "Ragged clothes" to descriptions.raggedclothesDescriptionArray,
        "Scar" to descriptions.scarDescriptionArray,
        "Missing teeth" to descriptions.missingteethDescriptionArray,
        "Missing finger" to descriptions.missingfingerDescriptionArray,
        "Unusual eye color" to descriptions.unusualeyecolorDescriptionArray,
        "Tattoos" to descriptions.tattoosDescriptionArray,
        "Birthmark" to descriptions.birthmarkDescriptionArray,
        "Unusual skin color" to descriptions.unusualskincolorDescriptionArray,
        "Bald" to descriptions.baldDescriptionArray,
        "Braided hair" to descriptions.braidedhairDescriptionArray,
        "Unusual hair color" to descriptions.unusualhaircolorDescriptionArray,
        "Beautiful" to descriptions.beautifulDescriptionArray,
        "Ugly" to descriptions.uglyDescriptionArray,
        "Crooked" to descriptions.crookedDescriptionArray,
        "Rigid" to descriptions.rigidDescriptionArray,
        "Distinctive Nose" to descriptions.distinctivenoseDescriptionArray
    )
    val alignmentMap = mapOf(
        "Lawful good" to descriptions.lawfulgoodDescriptionArray,
        "Neutral good" to descriptions.neutralgoodDescriptionArray,
        "Chaotic good" to descriptions.chaoticgoodDescriptionArray,
        "Lawful neutral" to descriptions.lawfulneutralDescriptionArray,
        "True neutral" to descriptions.trueneutralDescriptionArray,
        "Chaotic neutral" to descriptions.chaoticneutralDescriptionArray,
        "Lawful evil" to descriptions.lawfulevilDescriptionArray,
        "Neutral evil" to descriptions.neutralevilDescriptionArray,
        "Chaotic evil" to descriptions.chaoticevilDescriptionArray,
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