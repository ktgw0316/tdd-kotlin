package money

class Franc(private val amount: Int) : Money(amount) {
    override val currency: String
        get() = "CHF"

    override operator fun times(multiplier: Int) = Franc(amount * multiplier)
}
