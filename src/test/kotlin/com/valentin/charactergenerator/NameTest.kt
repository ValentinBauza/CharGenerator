import com.valentin.charactergenerator.Constantes
import com.valentin.charactergenerator.Name
import com.valentin.charactergenerator.randomIntUntilChosenValue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeUpperCase

class NameTest : StringSpec({
    "First letter should be uppercase" {
        val testName = Name(5, randomIntUntilChosenValue(3)).name
        testName.first().toString().shouldBeUpperCase()
    }

    "First letter should be a vowel" {
        val vowelTestName = Name(5, 0).name
        vowelTestName.first().lowercase() shouldBeIn Constantes().vowels
    }

    "First letter should be a consonant" {
        val vowelTestName = Name(5, 4).name
        vowelTestName.first().lowercase() shouldBeIn Constantes().consonants
    }

    "Name length should respect sent length" {
        val testName = Name(5, randomIntUntilChosenValue(3)).name
        testName.length shouldBe 5
    }
})