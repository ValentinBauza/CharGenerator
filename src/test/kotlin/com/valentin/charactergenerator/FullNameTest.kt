import com.valentin.charactergenerator.FullName
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FullNameTest : StringSpec({
    "Should create proper full name with three names" {
        val testFullName = FullName(3, makeWeightedCollection(), 0).fullName
        println(testFullName)
        testFullName.split(" ").size shouldBe 3
    }
})