package money

abstract class Money(private val amount: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Money
                && this::class == other::class
                && amount == other.amount
    }

    abstract operator fun times(multiplier: Int): Money
}
