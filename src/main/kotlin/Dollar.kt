package money

class Dollar(val amount: Int) {
    operator fun times(multiplier: Int) = Dollar(amount * multiplier)
}