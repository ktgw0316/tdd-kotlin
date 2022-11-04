package money

open class Money(private val amount: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Money
                && this::class == other::class
                && amount == other.amount
    }
}
