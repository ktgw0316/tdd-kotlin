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
    "Currency" - {
        "USD" {
            dollar(1).currency shouldBe "USD"
        }
        "CHF" {
            franc(1).currency shouldBe "CHF"
        }
    }
    "Addition" - {
        "$5 + $5 = $10" {
            val five = dollar(5)
            val sum = five + five
            val reduced = Bank.reduce(sum, "USD")
            reduced shouldBe dollar(10)
        }
    }
    "Reduction" - {
        "$5 + $5 is Sum" {
            val five = dollar(5)
            val sum = five + five
            sum.augend shouldBe five
            sum.addend shouldBe five
        }
        "$3 + $4 = $7" {
            val sum = Sum(dollar(3), dollar(4))
            val reduced = Bank.reduce(sum, "USD")
            reduced shouldBe dollar(7)
        }
        "$1 reduce to $1" {
            val reduced = Bank.reduce(dollar(1), "USD")
            reduced shouldBe dollar(1)
        }
    }
})
