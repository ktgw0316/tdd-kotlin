package money

class Franc(private val amount: Int) {
    override fun equals(other: Any?) = amount == (other as? Franc)?.amount
    operator fun times(multiplier: Int) = Franc(amount * multiplier)
}
