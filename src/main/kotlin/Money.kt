package money

open class Money(private val amount: Int) {
    override fun equals(other: Any?) = amount == (other as? Money)?.amount
}
