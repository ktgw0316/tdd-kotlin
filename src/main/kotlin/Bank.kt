package money

class Bank {
    companion object {
        fun reduce(expression: Expression, currency: String): Money {
            return expression.reduce(currency)
        }

        fun addRate(from: String, to: String, rate: Int) {
            return // TODO
        }
    }
}
