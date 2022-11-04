package money

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class MoneyTest : FreeSpec({

    "Multiplication" - {
        "Dollar" - {
            val five = Dollar(5)
            "$5 * 2 = $10" {
                five * 2 shouldBe Dollar(10)
            }
            "$5 * 3 = $15" {
                five * 3 shouldBe Dollar(15)
            }
        }
        "Franc" - {
            val five = Franc(5)
            "$5 * 2 = $10" {
                five * 2 shouldBe Franc(10)
            }
            "$5 * 3 = $15" {
                five * 3 shouldBe Franc(15)
            }
        }
    }
    "Equality" - {
        "$5 = $5" {
            Dollar(5) shouldBe Dollar(5)
        }
        "$5 != $6" {
            Dollar(5) shouldNotBe Dollar(6)
        }
    }
})
