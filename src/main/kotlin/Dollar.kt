package money

class Dollar(val amount: Int) {
    override fun equals(other: Any?) = amount == (other as? Dollar)?.amount
    operator fun times(multiplier: Int) = Dollar(amount * multiplier)
}