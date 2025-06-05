package com.valentin.charactergenerator

class NpcDescriptions(
    val elfDescriptionArray: Array<String> = arrayOf(
        "As an elf, they carry the elegance of ancient woods and the weight of centuries.",
        "Their pointed ears and timeless features mark them clearly as one of the elven kind.",
        "Elven heritage grants them an ethereal grace and a deep connection to nature."
    ),

    val humanDescriptionArray: Array<String> = arrayOf(
        "As a human, they are defined by their ambition and ability to adapt.",
        "Though short-lived compared to others, their determination leaves lasting marks.",
        "Human resilience and resourcefulness shape their every step."
    ),

    val dwarfDescriptionArray: Array<String> = arrayOf(
        "As a dwarf, their stout frame and thick beard are unmistakable.",
        "Dwarven blood grants them a love of stone, steel, and strong drink.",
        "They walk with the surefooted pride of their subterranean kin."
    ),

    val halflingDescriptionArray: Array<String> = arrayOf(
        "As a halfling, their small stature conceals a bold spirit.",
        "They carry joy and cunning in equal measure wherever they roam.",
        "Halflings have a knack for comfort, community, and the occasional mischief."
    ),

    val halfelfDescriptionArray: Array<String> = arrayOf(
        "As a half-elf, they embody both the passion of humans and the grace of elves.",
        "Straddling two worlds, they are often wanderers seeking a place to belong.",
        "Their features blend elegance and earthiness in a unique harmony."
    ),

    val halforcDescriptionArray: Array<String> = arrayOf(
        "As a half-orc, they bear the might of orcs tempered by human will.",
        "Their presence is formidable, and strength pulses through every motion.",
        "Half-orcs live at the edge of acceptance, where grit and honor are earned."
    ),

    val gnomeDescriptionArray: Array<String> = arrayOf(
        "As a gnome, their curiosity seems limitless and their laughter contagious.",
        "Small in stature, they brim with cleverness and innovation.",
        "They often carry odd trinkets and wild ideas, always ready for mischief."
    ),

    val tieflingDescriptionArray: Array<String> = arrayOf(
        "As a tiefling, they walk with infernal ancestry visible in every horn and tail.",
        "Their unsettling aura is matched by a depth often overlooked.",
        "Suspicion follows them, yet so does undeniable allure."
    ),

    val dragonbornDescriptionArray: Array<String> = arrayOf(
        "As a dragonborn, their scaled form commands respect and awe.",
        "Draconic heritage grants them a proud bearing and a fierce breath.",
        "Each word they speak rumbles with a hint of ancient power."
    ),

    val orcDescriptionArray: Array<String> = arrayOf(
        "As an orc, their towering presence turns heads and quiets rooms.",
        "They are driven by raw emotion, unfiltered and fierce.",
        "With every breath, they carry the traditions of their war-born people."
    ),

    val nameDescriptionArray: Array<String> = arrayOf(
        "They are known as <nameValue>, a name that carries stories wherever it's spoken.",
        "Those who cross paths with <nameValue> often remember the name longer than the face.",
        "<nameValue> is a name whispered with wonder, fear, or both."
    ),

    val childDescriptionArray: Array<String> = arrayOf(
        "Still a child, they see wonder where others see routine.",
        "Their innocence shines through their curiosity and boundless energy.",
        "As a young soul, every day offers something new to explore."
    ),

    val teenagerDescriptionArray: Array<String> = arrayOf(
        "As a teenager, their emotions are fierce and their ideals unshaped.",
        "They stand at the cusp of adulthood, pulled between rebellion and responsibility.",
        "Restless and daring, they often leap before they look."
    ),

    val adultDescriptionArray: Array<String> = arrayOf(
        "In adulthood, they carry confidence earned through experience.",
        "They have come into their own, tested by time and triumph.",
        "Their steps are measured, their choices deliberate and strong."
    ),

    val middleagedDescriptionArray: Array<String> = arrayOf(
        "With middle age comes pragmatism and a weathered perspective.",
        "They wear the marks of a life lived—hard decisions, old victories, faded regrets.",
        "No longer young, but far from done, they balance wisdom and vitality."
    ),

    val elderlyDescriptionArray: Array<String> = arrayOf(
        "Elderly and wise, they speak with the weight of years behind them.",
        "Their body may falter, but their mind holds entire generations.",
        "They are a walking chronicle of lessons hard-earned and carefully remembered."
    ),

    val maleDescriptionArray: Array<String> = arrayOf(
        "He carries himself with a quiet confidence rooted in experience.",
        "As a man, his presence speaks of paths walked and battles faced.",
        "With every word, he reveals discipline, humor, or raw conviction."
    ),

    val femaleDescriptionArray: Array<String> = arrayOf(
        "She moves with grace sharpened by life's many tests.",
        "As a woman, strength and elegance intertwine in her every action.",
        "Her gaze is steady, her will firm, shaped by joy and pain alike."
    ),

    val apothecaryDescriptionArray: Array<String> = arrayOf(
        "As an apothecary, they blend herbs with care and secrets with precision.",
        "The scent of dried leaves and bitter roots clings to their clothing.",
        "Their shop shelves brim with powders, potions, and whispered cures."
    ),

    val armorerDescriptionArray: Array<String> = arrayOf(
        "As an armorer, they shape steel like a poet crafts verse.",
        "Their hands are calloused from forging protection for those who fight.",
        "Each piece they make tells a story of war and craftsmanship."
    ),

    val alchemistDescriptionArray: Array<String> = arrayOf(
        "As an alchemist, their world bubbles with strange fumes and volatile mixtures.",
        "They chase the hidden truths of the world through transformation and fire.",
        "Symbols and ingredients clutter their workspace like a mad scholar's dream."
    ),

    val apprenticeDescriptionArray: Array<String> = arrayOf(
        "As an apprentice, they follow orders with one eye on mastery.",
        "Their hands are still unsure, but their ambition burns bright.",
        "Mistakes and lessons come daily, shaping the craftsman they hope to become."
    ),

    val bakerDescriptionArray: Array<String> = arrayOf(
        "As a baker, they rise before the sun, bringing warmth to cold mornings.",
        "Flour dusts their hair and apron, and their hands move with practiced ease.",
        "The smell of fresh bread is their constant companion and their pride."
    ),

    val banditDescriptionArray: Array<String> = arrayOf(
        "As a bandit, they trust their blade more than any law.",
        "Their life is lived on the edge of danger and desperation.",
        "Their grin is sharp, and their eyes never stop scanning for opportunity."
    ),

    val beggarDescriptionArray: Array<String> = arrayOf(
        "As a beggar, they survive on charity, wit, and weathered patience.",
        "Their clothes are worn, their voice soft from too many unanswered pleas.",
        "Each coin tossed their way carries both pity and pride."
    ),

    val blacksmithDescriptionArray: Array<String> = arrayOf(
        "As a blacksmith, they forge both tools and trust in equal measure.",
        "The rhythmic clang of hammer and anvil echoes their daily life.",
        "They mold raw metal into the backbone of civilization."
    ),

    val brewerDescriptionArray: Array<String> = arrayOf(
        "As a brewer, they craft joy from yeast and grain.",
        "Their barrels hold celebrations and sorrows alike.",
        "The scent of hops and fermented dreams trails behind them."
    ),

    val buskerDescriptionArray: Array<String> = arrayOf(
        "As a busker, they earn their keep with every note and gesture.",
        "Street corners are their stage, and passing crowds their fickle audience.",
        "Their performance is both art and plea, raw and real."
    ),

    val butcherDescriptionArray: Array<String> = arrayOf(
        "As a butcher, they cleave meat with a practiced hand and a steady mind.",
        "The scent of blood and smoke clings to them like a second skin.",
        "Few speak to them at length, but all rely on their grim trade."
    ),

    val campfollowerDescriptionArray: Array<String> = arrayOf(
        "As a camp follower, they move with the tides of war.",
        "Their survival hinges on charm, labor, and grim acceptance.",
        "Soldiers pass through their life like seasons—temporary and dangerous."
    ),

    val carpenterDescriptionArray: Array<String> = arrayOf(
        "As a carpenter, they build homes, hope, and sometimes coffins.",
        "Their tools are extensions of their will, precise and worn.",
        "They measure twice, cut once, and seldom speak without reason."
    ),

    val carterDescriptionArray: Array<String> = arrayOf(
        "As a carter, they know every rutted road and hidden path.",
        "Dust and distance are constants in their world of wheels and beasts.",
        "They ferry goods and secrets with equal discretion."
    ),

    val cheesemakerDescriptionArray: Array<String> = arrayOf(
        "As a cheesemaker, they turn milk and time into quiet treasures.",
        "Their cellar is rich with the scent of fermentation and pride.",
        "They judge cheese like others judge wine—by smell, texture, and patience."
    ),

    val cookDescriptionArray: Array<String> = arrayOf(
        "As a cook, they rule their kitchen with authority and a sharp knife.",
        "Flavors are their language, and every meal a message.",
        "They feed bellies and moods with practiced instinct."
    ),

    val cordwainerDescriptionArray: Array<String> = arrayOf(
        "As a cordwainer, they craft shoes that outlive their owners.",
        "Leather and awls clutter their workshop like old friends.",
        "Each stitch holds years of experience and silent pride."
    ),

    val costermongerDescriptionArray: Array<String> = arrayOf(
        "As a costermonger, their cries rise above the market noise.",
        "They sell fruit and gossip in equal measure.",
        "Charm and quick hands keep their produce moving fast."
    ),

    val courtjesterDescriptionArray: Array<String> = arrayOf(
        "As a court jester, they speak truth through laughter and riddles.",
        "Their antics mask a clever mind that sees far more than it says.",
        "They dance on the edge of offense and favor, laughing all the while."
    ),

    val diplomatDescriptionArray: Array<String> = arrayOf(
        "As a diplomat, every word they utter is measured and poised.",
        "They wield influence with tact instead of weapons.",
        "Their calm demeanor hides the pressure of kingdoms behind their smile."
    ),

    val falconerDescriptionArray: Array<String> = arrayOf(
        "As a falconer, their bond with birds of prey is sacred and silent.",
        "They train predators with patience and trust.",
        "Their commands carry on the wind, answered with a cry from the sky."
    ),

    val farmerDescriptionArray: Array<String> = arrayOf(
        "As a farmer, they rise with the sun and rest only when it sets.",
        "Their hands are calloused from coaxing life from the soil.",
        "They know the rhythm of the land and the hunger of seasons."
    ),

    val fishmongerDescriptionArray: Array<String> = arrayOf(
        "As a fishmonger, they carry the scent of the sea wherever they go.",
        "Their stall is a cacophony of scales, knives, and shouts.",
        "They barter with salt-hardened hands and sharp eyes."
    ),

    val furrierDescriptionArray: Array<String> = arrayOf(
        "As a furrier, they deal in warmth and quiet cruelty.",
        "Their wares speak of both fashion and necessity.",
        "They know how to cut, tan, and sell with equal skill."
    ),

    val fletcherDescriptionArray: Array<String> = arrayOf(
        "As a fletcher, they craft arrows that fly truer than most truths.",
        "Feathers and shafts become deadly elegance in their hands.",
        "Archers seek them out, for their name carries quiet renown."
    ),

    val gardenerDescriptionArray: Array<String> = arrayOf(
        "As a gardener, they coax beauty and bounty from the earth.",
        "Their hands know every root and bloom like a trusted friend.",
        "They speak little, but their flowers speak volumes."
    ),

    val gravediggerDescriptionArray: Array<String> = arrayOf(
        "As a gravedigger, they know silence better than most priests.",
        "Their shovel carves memories into the earth.",
        "The dead do not frighten them—they keep solemn company."
    ),

    val grocerDescriptionArray: Array<String> = arrayOf(
        "As a grocer, they juggle coin and freshness with equal care.",
        "They know everyone’s favorite food and forgotten debts.",
        "Their market stall is always stocked and bustling."
    ),

    val groomDescriptionArray: Array<String> = arrayOf(
        "As a groom, they treat animals with a gentleness rarely shown to people.",
        "Their days begin with brushing and bridling.",
        "They whisper to horses like others speak to gods."
    ),

    val innkeeperDescriptionArray: Array<String> = arrayOf(
        "As an innkeeper, they offer shelter, ale, and well-earned advice.",
        "Their hearth welcomes all, and their ledger forgets little.",
        "They know everyone's secrets, collected one drink at a time."
    ),

    val jewelerDescriptionArray: Array<String> = arrayOf(
        "As a jeweler, they see value in the smallest sparkle.",
        "Their tools are fine and their judgment finer.",
        "They make beauty permanent and portable."
    ),

    val locksmithDescriptionArray: Array<String> = arrayOf(
        "As a locksmith, they understand both the keeping and breaking of trust.",
        "No lock is safe from their skilled hands.",
        "They deal in security, mystery, and quiet power."
    ),

    val masonDescriptionArray: Array<String> = arrayOf(
        "As a mason, they shape cities from stone and sweat.",
        "Their fingers trace blueprints in their sleep.",
        "They leave monuments behind, silent but strong."
    ),

    val merchantDescriptionArray: Array<String> = arrayOf(
        "As a merchant, they speak the language of trade fluently.",
        "Their wares are as varied as their clients.",
        "They smell opportunity like a wolf smells prey."
    ),

    val millerDescriptionArray: Array<String> = arrayOf(
        "As a miller, they grind grain into life-sustaining flour.",
        "Their work hums with gears and water wheels.",
        "They speak in weights and measures, not riddles."
    ),

    val minstrelDescriptionArray: Array<String> = arrayOf(
        "As a minstrel, they turn taverns into temples of song.",
        "Their voice can silence a room or stir it into frenzy.",
        "They collect stories and hearts with every verse."
    ),

    val outlawDescriptionArray: Array<String> = arrayOf(
        "As an outlaw, they live by their own code, outside the law’s reach.",
        "Their eyes scan for danger like a cornered animal.",
        "Freedom is their prize, and the noose its price."
    ),

    val pageDescriptionArray: Array<String> = arrayOf(
        "As a page, they scurry through halls bearing messages and ambition.",
        "Their duties are humble, but their dreams stretch far.",
        "They watch and learn, ears always open, feet always moving."
    ),

    val poisontesterDescriptionArray: Array<String> = arrayOf(
        "As a poison tester, each sip could be their last.",
        "They eat with care, live with caution, and fear little.",
        "Their survival hinges on knowledge, instinct, and luck."
    ),

    val peasantDescriptionArray: Array<String> = arrayOf(
        "As a peasant, their life is one of toil and quiet strength.",
        "They endure the seasons and the whims of lords alike.",
        "Their back is bent, but not their spirit."
    ),

    val pigfarmerDescriptionArray: Array<String> = arrayOf(
        "As a pig farmer, they wade through muck and laughter.",
        "They know more about beasts than most nobles do about people.",
        "Their pigs are fat, their humor fatter."
    ),

    val painterDescriptionArray: Array<String> = arrayOf(
        "As a painter, they see the world in colors others miss.",
        "Their fingers are stained with dreams and visions.",
        "They leave behind beauty, even when no one is watching."
    ),

    val ropemakerDescriptionArray: Array<String> = arrayOf(
        "As a ropemaker, they twist fibers and futures alike.",
        "Knots are their language, and tension their trade.",
        "Their ropes have held ships, prisoners, and secrets."
    ),

    val sailorDescriptionArray: Array<String> = arrayOf(
        "As a sailor, their heart beats with the ocean’s rhythm.",
        "They live by tides, stars, and risky bets.",
        "Salt and storms cling to them like a second skin."
    ),

    val scribeDescriptionArray: Array<String> = arrayOf(
        "As a scribe, they trap knowledge in ink and parchment.",
        "Their script is flawless, their patience endless.",
        "They preserve the voices of those long gone."
    ),

    val servantDescriptionArray: Array<String> = arrayOf(
        "As a servant, they move quietly but observe everything.",
        "They know the habits of their masters better than their own.",
        "Their deference hides a keen awareness of power."
    ),

    val shepherdDescriptionArray: Array<String> = arrayOf(
        "As a shepherd, they walk with their flock through solitude.",
        "Wolves, weather, and whispers do not shake them.",
        "They speak more to animals than people, and the animals listen."
    ),

    val silversmithDescriptionArray: Array<String> = arrayOf(
        "As a silversmith, they craft elegance from precious metal.",
        "Their hands are steady, their eyes sharp with detail.",
        "They turn cold silver into heirlooms and art."
    ),

    val skinnerDescriptionArray: Array<String> = arrayOf(
        "As a skinner, they are familiar with blood and blade.",
        "Their trade is grisly but necessary.",
        "They strip away the facade, quite literally."
    ),

    val soldierDescriptionArray: Array<String> = arrayOf(
        "As a soldier, they follow orders and forge their resolve in battle.",
        "Their armor is worn, their scars many.",
        "Discipline is their shield, and camaraderie their sword."
    ),

    val spyDescriptionArray: Array<String> = arrayOf(
        "As a spy, they vanish into crowds and secrets alike.",
        "They gather truths wrapped in lies.",
        "Their true allegiance is known only to themselves."
    ),

    val squireDescriptionArray: Array<String> = arrayOf(
        "As a squire, they serve with hope of knighthood.",
        "They polish armor and ambition alike.",
        "Their every deed is preparation for glory or failure."
    ),

    val storytellerDescriptionArray: Array<String> = arrayOf(
        "As a storyteller, they breathe life into the past and possibility into the present.",
        "Their voice paints pictures more vivid than any brush.",
        "They collect tales like others collect coin."
    ),

    val summonerDescriptionArray: Array<String> = arrayOf(
        "As a summoner, they call forth entities from realms unseen.",
        "Their chants ripple through dimensions.",
        "They walk a line between power and peril."
    ),

    val tailorDescriptionArray: Array<String> = arrayOf(
        "As a tailor, they stitch personality into every garment.",
        "Their shop is full of fabric, fashion, and quiet judgment.",
        "They dress both nobles and knaves, never missing a measurement."
    ),

    val tannerDescriptionArray: Array<String> = arrayOf(
        "As a tanner, their hands bear the stink and skill of the trade.",
        "They work in hides, harsh chemicals, and hard-earned coin.",
        "Their work is tough, but so are they."
    ),

    val taxcollectorDescriptionArray: Array<String> = arrayOf(
        "As a tax collector, they are rarely welcomed but always remembered.",
        "Ledgers and laws are their weapons of choice.",
        "They carry the weight of a kingdom’s greed."
    ),

    val traderDescriptionArray: Array<String> = arrayOf(
        "As a trader, they cross borders with coin in hand and stories in tow.",
        "Their voice is persuasive, their eyes always scanning for a deal.",
        "They trade goods, favors, and secrets with equal skill."
    ),

    val guardDescriptionArray: Array<String> = arrayOf(
        "As a guard, they stand firm at thresholds, a wall of muscle and resolve.",
        "Their gaze is sharp, trained to catch trouble before it starts.",
        "Discipline keeps them alert, and duty keeps them anchored."
    ),

    val winemakerDescriptionArray: Array<String> = arrayOf(
        "As a winemaker, they turn patience and fruit into bottled poetry.",
        "Their hands are stained with juice and years of quiet work.",
        "Each vintage they craft tells a story of sun, soil, and soul."
    ),

    val earringsDescriptionArray: Array<String> = arrayOf(
        "A pair of ornate earrings dangle from their ears, catching every glint of light.",
        "Their earrings seem to shimmer with hidden meaning and quiet rebellion.",
        "Tiny jewels swing with each step, a subtle badge of taste or defiance."
    ),

    val necklaceDescriptionArray: Array<String> = arrayOf(
        "A necklace rests at their collar, its pendant worn smooth by years of touch.",
        "The charm around their neck speaks of memory, love, or perhaps magic.",
        "Glimmers of metal peek through their shirt, hinting at something cherished."
    ),

    val circletDescriptionArray: Array<String> = arrayOf(
        "A delicate circlet adorns their brow, regal and unyielding.",
        "Its design suggests a noble past—or an unspoken claim to greatness.",
        "The circlet never leaves their head, as though part of their identity."
    ),

    val braceletDescriptionArray: Array<String> = arrayOf(
        "A bracelet wraps around their wrist, clinking softly as they move.",
        "The etchings on its surface tell a story few are allowed to hear.",
        "They often glance at it, as if recalling someone or something lost."
    ),

    val piercingsDescriptionArray: Array<String> = arrayOf(
        "Piercings line their ears, nose, and brow, a constellation of rebellion.",
        "Each piece of metal feels like a chapter of their untold tale.",
        "They wear their piercings like armor, proud and deliberate."
    ),

    val outlandishclothesDescriptionArray: Array<String> = arrayOf(
        "Their clothes are wild, brightly colored, and impossible to ignore.",
        "Patterns and styles clash spectacularly, as if challenging fashion itself.",
        "They walk like a canvas of chaos and creativity."
    ),

    val flamboyantclothesDescriptionArray: Array<String> = arrayOf(
        "Their flamboyant attire sparkles and swirls with flair.",
        "Each piece is bold, meant to turn heads and start whispers.",
        "Their outfit speaks louder than most voices in a room."
    ),

    val formalclothesDescriptionArray: Array<String> = arrayOf(
        "Dressed in sharp, formal clothing, they exude discipline and decorum.",
        "Not a crease nor thread is out of place in their polished ensemble.",
        "Their style commands respect, if not admiration."
    ),

    val raggedclothesDescriptionArray: Array<String> = arrayOf(
        "Their clothes are threadbare, patched, and soaked in hardship.",
        "Fabric hangs from them in weary strips, a testament to survival.",
        "Even worn thin, their clothing clings stubbornly to its purpose."
    ),

    val scarDescriptionArray: Array<String> = arrayOf(
        "A scar slices across their skin, impossible to ignore.",
        "Each line tells a story written in blood and grit.",
        "They wear it like a badge, not a blemish."
    ),

    val missingteethDescriptionArray: Array<String> = arrayOf(
        "Several teeth are gone, leaving their grin a jagged mystery.",
        "Their smile reveals gaps earned through fists and misfortune.",
        "They speak around the spaces, unbothered by judgment."
    ),

    val missingfingerDescriptionArray: Array<String> = arrayOf(
        "One finger is absent, the stump clean or crudely healed.",
        "They gesture with a hand that once held more.",
        "No explanation is offered, and none dare ask twice."
    ),

    val unusualeyecolorDescriptionArray: Array<String> = arrayOf(
        "Their eyes shimmer with an unnatural hue, arresting and eerie.",
        "People often do a double take, caught by the strange glow in their gaze.",
        "Their eye color is not found in nature, yet suits them perfectly."
    ),

    val tattoosDescriptionArray: Array<String> = arrayOf(
        "Tattoos curl across their skin in intricate, unreadable patterns.",
        "Each inked line seems to whisper of oaths, travels, or hidden lore.",
        "Their body is a canvas of memory and myth."
    ),

    val birthmarkDescriptionArray: Array<String> = arrayOf(
        "A birthmark rests somewhere visible, oddly shaped and oddly placed.",
        "Their mark draws curiosity—some say it’s a sign, others a curse.",
        "It seems almost intentional, as though fate branded them at birth."
    ),

    val unusualskincolorDescriptionArray: Array<String> = arrayOf(
        "Their skin bears a hue not commonly seen—blue, green, or something stranger.",
        "They wear their unusual skin like a cloak of defiance or destiny.",
        "Children stare, adults pretend not to."
    ),

    val baldDescriptionArray: Array<String> = arrayOf(
        "Their head is smooth and hairless, reflecting candlelight like polished stone.",
        "Completely bald, their bare scalp adds to a stern and striking appearance.",
        "The absence of hair gives them a clean, almost monastic presence."
    ),

    val braidedhairDescriptionArray: Array<String> = arrayOf(
        "Their hair is intricately braided, each plait a labor of care.",
        "Braids drape over their shoulders like woven cords of tradition.",
        "Every twist and tie speaks of patience and style."
    ),

    val unusualhaircolorDescriptionArray: Array<String> = arrayOf(
        "Their hair boasts a hue nature never intended—vibrant, shocking, mesmerizing.",
        "Whether dyed or magical, it leaves an impression as bold as fire.",
        "Crowds part for the one with the crimson or cobalt mane."
    ),

    val beautifulDescriptionArray: Array<String> = arrayOf(
        "They are strikingly beautiful, the kind that silences rooms.",
        "Every motion, every glance seems touched by grace.",
        "People stare, admiring or envying, but never indifferent."
    ),

    val uglyDescriptionArray: Array<String> = arrayOf(
        "They are not just plain, but memorably ugly—every feature off just enough.",
        "Their face unsettles, their voice redeems little.",
        "Yet there is honesty in their appearance, and a strange sort of strength."
    ),

    val crookedDescriptionArray: Array<String> = arrayOf(
        "Their posture leans or bends oddly, shaped by injury or habit.",
        "They walk as if the world leans with them.",
        "Their crooked frame draws whispers and wary looks."
    ),

    val rigidDescriptionArray: Array<String> = arrayOf(
        "They stand perfectly straight, as if held by invisible wires.",
        "Every movement is tight and mechanical, like a soldier or statue.",
        "Their rigidity unnerves, demanding attention through sheer control."
    ),

    val distinctivenoseDescriptionArray: Array<String> = arrayOf(
        "Their nose is a defining feature—large, hooked, or unusually sharp.",
        "It gives them a profile seen once, remembered forever.",
        "Even in shadow, their silhouette is unmistakable."
    ),

    val lawfulgoodDescriptionArray: Array<String> = arrayOf(
        "They are driven by an unwavering commitment to justice and order.",
        "Honesty, duty, and righteousness form the foundation of their every action.",
        "With a deep respect for laws and morality, they seek to make the world a better place."
    ),

    val neutralgoodDescriptionArray: Array<String> = arrayOf(
        "Guided by kindness, their actions reflect the balance of a Neutral good spirit.",
        "They help others not because of rules, but because it is right.",
        "Compassion drives them, free from dogma or chaos."
    ),

    val chaoticgoodDescriptionArray: Array<String> = arrayOf(
        "They follow their conscience over rules, embodying a Chaotic good soul.",
        "Rebellion for the sake of justice burns brightly within them.",
        "They do what's right, even if the world disagrees."
    ),

    val lawfulneutralDescriptionArray: Array<String> = arrayOf(
        "Order above all defines them—a true Lawful neutral.",
        "They follow rules with the same reverence others reserve for gods.",
        "Their loyalty is to structure and duty, not to good or evil."
    ),

    val trueneutralDescriptionArray: Array<String> = arrayOf(
        "Unmoved by extremes, they maintain the balance of a True neutral being.",
        "They act as needed, shifting with the winds of reason.",
        "They favor equilibrium over ideology."
    ),

    val chaoticneutralDescriptionArray: Array<String> = arrayOf(
        "Freedom is paramount to them, even if chaos follows—a Chaotic neutral life.",
        "They are wild, unpredictable, and deeply loyal to themselves.",
        "Their path is ruled by impulse and instinct."
    ),

    val lawfulevilDescriptionArray: Array<String> = arrayOf(
        "They pursue power through order, a calculated Lawful evil force.",
        "Rules are tools, useful for controlling others and preserving dominance.",
        "Their ambition hides behind manners and tradition."
    ),

    val neutralevilDescriptionArray: Array<String> = arrayOf(
        "They seek personal gain without remorse—a coldly Neutral evil persona.",
        "There is no right or wrong in their world, only success and failure.",
        "Their heart is a ledger, balanced only by benefit."
    ),

    val chaoticevilDescriptionArray: Array<String> = arrayOf(
        "Their actions sow mayhem and suffering, thriving as a Chaotic evil agent.",
        "They revel in destruction, following whims twisted by hatred.",
        "The world is their playground, and pain its price."
    )
)