import com.Val.NPCGenerator.Constantes
import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.core.spec.style.StringSpec

class ConstantesTest : StringSpec({
    "The races and their name lengths weights should be valid" {
        shouldNotThrow<Exception> {
            Constantes()
        }
    }
})