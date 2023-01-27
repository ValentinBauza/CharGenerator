import com.Val.charactergenerator.FullName
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FullNameTest : StringSpec({
    "Should create proper full name with three names" {
        val testFullName = FullName(3, makeWeightedCollection()).fullName
        println(testFullName)
        testFullName.split(" ").size shouldBe 3
    }
})