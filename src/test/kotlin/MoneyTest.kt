package money

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MoneyTest : FreeSpec({

    "Multiplication" - {
        "$5 * 2 = $10" {
            val five = Dollar(5)
            five * 2
            five.amount shouldBe 10
        }
    }
})
