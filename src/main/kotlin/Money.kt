package money

import java.util.Currency

abstract class Money(private val amount: Int) {

    abstract val currency: String

    override fun equals(other: Any?): Boolean {
        return other is Money
                && this::class == other::class
                && amount == other.amount
    }

    abstract operator fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount)
        }

        fun franc(amount: Int): Money {
            return Franc(amount)
        }
    }
}
