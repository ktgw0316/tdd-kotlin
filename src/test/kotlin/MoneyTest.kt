package money

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

import money.Money.Companion.dollar
import money.Money.Companion.franc

class MoneyTest : FreeSpec({

    "Multiplication" - {
        "Dollar" - {
            val five = dollar(5)
            "$5 * 2 = $10" {
                five * 2 shouldBe dollar(10)
            }
            "$5 * 3 = $15" {
                five * 3 shouldBe dollar(15)
            }
        }
        "Franc" - {
            val five = franc(5)
            "$5 * 2 = $10" {
                five * 2 shouldBe franc(10)
            }
            "$5 * 3 = $15" {
                five * 3 shouldBe franc(15)
            }
        }
    }
    "Equality" - {
        "$5 = $5" {
            dollar(5) shouldBe dollar(5)
        }
        "$5 != $6" {
            dollar(5) shouldNotBe dollar(6)
        }
        "5 Franc != $5" {
            franc(5) shouldNotBe dollar(5)
        }
    }
})
