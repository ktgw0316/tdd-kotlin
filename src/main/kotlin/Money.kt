package money

class Money(private val amount: Int, val currency: String) {

    override fun equals(other: Any?): Boolean {
        return other is Money
                && this::class == other::class
                && currency == other.currency
                && amount == other.amount
    }

    operator fun times(multiplier: Int) = Money(amount * multiplier, currency)
    operator fun plus(other: Money): Money = TODO()

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
}
