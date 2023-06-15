import com.valentin.charactergenerator.Constantes
import com.valentin.charactergenerator.Name
import com.valentin.charactergenerator.randomIntUntilChosenValue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.collections.shouldNotBeIn
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeUpperCase

class NameTest : StringSpec({
    "First letter should be uppercase" {
        val testName = Name(5, randomIntUntilChosenValue(3), 0).name
        testName.first().toString().shouldBeUpperCase()
    }

    "First letter should be a vowel" {
        val vowelTestName = Name(5, 0, 0).name
        vowelTestName.first().lowercase() shouldBeIn Constantes().vowels
    }

    "First letter should be a consonant" {
        val vowelTestName = Name(5, 4, 0).name
        vowelTestName.first().lowercase() shouldBeIn Constantes().consonants
    }

    "Name length should respect sent length" {
        val testName = Name(5, randomIntUntilChosenValue(3), 0).name
        testName.length shouldBe 5
    }

    "Name should have no doubled vowels" {
        val testName = Name(5, 0, 0).name
        testName.first().lowercase() shouldBeIn Constantes().vowels
        testName[1].toString() shouldNotBeIn Constantes().vowels
        testName[2].toString() shouldBeIn Constantes().consonants
        testName[3].toString() shouldBeIn Constantes().vowels
        testName[4].toString() shouldNotBeIn Constantes().vowels
    }

    "Name should have only doubled vowels" {
        val testName = Name(5, 0, 100).name
        testName.first().lowercase() shouldBeIn Constantes().vowels
        testName[1].toString() shouldBeIn Constantes().vowels
        testName[2].toString() shouldBeIn Constantes().consonants
        testName[3].toString() shouldBeIn Constantes().vowels
        testName[4].toString() shouldBeIn Constantes().vowels
    }
})