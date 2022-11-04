package money

class Dollar(private val amount: Int): Money(amount) {
    override operator fun times(multiplier: Int) = Dollar(amount * multiplier)
}