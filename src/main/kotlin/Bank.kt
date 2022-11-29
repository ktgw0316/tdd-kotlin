package money

class Bank {
    companion object {
        fun reduce(expression: Expression, currency: String): Money {
            return expression.reduce(currency)
        }
    }
}
