package money

class Bank {
    companion object {
        fun reduce(expression: Expression, currency: String): Money {
            return Money(10, "USD") // FIXME
        }
    }
}
