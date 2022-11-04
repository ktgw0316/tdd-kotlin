package money

import java.util.*

class Dollar(private val amount: Int): Money(amount) {
    override val currency: String
        get() = "USD"

    override operator fun times(multiplier: Int) = Dollar(amount * multiplier)
}