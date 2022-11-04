package money

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MoneyTest : FreeSpec({

    "Multiplication" - {
        val five = Dollar(5)
        "$5 * 2 = $10" {
            val product = five * 2
            product.amount shouldBe 10
        }
        "$5 * 3 = $15" {
            val product = five * 3
            product.amount shouldBe 15
        }
    }
})
