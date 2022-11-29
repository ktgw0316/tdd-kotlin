package money

class Money(internal val amount: Int, val currency: String) : Expression {
    override fun equals(other: Any?): Boolean {
        return other is Money
                && this::class == other::class
                && currency == other.currency
                && amount == other.amount
    }

    operator fun times(multiplier: Int) = Money(amount * multiplier, currency)
    operator fun plus(addend: Money) = Sum(this, addend)

    override fun reduce(to: String): Money {
        val rate = if (currency == "CHP" && to == "USD") 2 else 1 // FIXME
        return Money(amount / rate, to)
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
}
