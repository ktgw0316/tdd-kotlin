package money

class Bank {
    companion object {
        fun reduce(expression: Expression, currency: String): Money {
            return expression.reduce(currency)
        }

        fun addRate(from: String, to: String, rate: Int) {
            return // TODO
        }

        fun rate(from: String, to: String): Int {
            return if (from == "CHP" && to == "USD") 2 else 1 // FIXME
        }
    }
}
