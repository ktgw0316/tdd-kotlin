package money

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MoneyTest : FreeSpec({

    "Multiplication" - {
        val five = Dollar(5)
        "$5 * 2 = $10" {
            (five * 2 == Dollar(10)) shouldBe true
        }
        "$5 * 3 = $15" {
            (five * 3 == Dollar(15)) shouldBe true
        }
    }
    "Equality" - {
        "$5 = $5" {
            (Dollar(5) == Dollar(5)) shouldBe true
        }
        "$5 != $6" {
            (Dollar(5) == Dollar(6)) shouldBe false
        }
    }
})
