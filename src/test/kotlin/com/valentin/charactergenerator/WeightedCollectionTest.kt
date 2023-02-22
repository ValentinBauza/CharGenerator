import com.valentin.charactergenerator.randomIntUntilChosenValue
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe

class WeightedCollectionTest : StringSpec({
    val collection = makeWeightedCollection()

    "Fixed choice, collection should content should be 5" {
        collection.randomContent(15) shouldBe 1
    }

    "Bad weights, collection should throw exception" {
        shouldThrow<Exception> {
            makeWrongWeightedCollection()
        }
    }

    "Multiple random choices, the weights should be respected" {
        val arrayOfRandomContent = IntArray(4)
        for (i in 1 until 10000) arrayOfRandomContent[collection.randomContent(randomIntUntilChosenValue(100)).toString().toInt() - 1] += 1
        for (i in arrayOfRandomContent) 2300..2700 shouldContain arrayOfRandomContent[0]
    }

})
