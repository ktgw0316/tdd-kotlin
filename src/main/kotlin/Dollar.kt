package money

class Dollar(private val amount: Int): Money(amount) {
    operator fun times(multiplier: Int) = Dollar(amount * multiplier)
}