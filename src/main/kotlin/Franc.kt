package money

class Franc(private val amount: Int) : Money(amount) {
    operator fun times(multiplier: Int) = Franc(amount * multiplier)
}
