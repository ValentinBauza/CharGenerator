import com.valentin.charactergenerator.NPC
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class NPCTest : StringSpec({
    "A random NPC should be created if no arguments are passed" {
        val testNPC = NPC()
        testNPC.name shouldNotBe null
        testNPC.age shouldNotBe null
        testNPC.alignment shouldNotBe null
        testNPC.gender shouldNotBe null
        testNPC.appearance shouldNotBe null
        testNPC.occupation shouldNotBe null
        testNPC.race shouldNotBe null
        testNPC.raceName shouldNotBe null
        testNPC.description shouldNotBe null
    }

    "A defined NPC should be created with defined arguments" {
        val testRace = makeTestRace()
        val testNPC = NPC(testRace, "John Doe", "Young", "Male", "Farmer", "Pretty", "Neutral", "descriptionPlaceHolder")
        testNPC.name shouldBe "John Doe"
        testNPC.age shouldBe "Young"
        testNPC.alignment shouldBe "Neutral"
        testNPC.gender shouldBe "Male"
        testNPC.appearance shouldBe "Pretty"
        testNPC.occupation shouldBe "Farmer"
        testNPC.race shouldBe testRace
        testNPC.raceName shouldBe "human"
        testNPC.description shouldBe "descriptionPlaceHolder"
    }
})