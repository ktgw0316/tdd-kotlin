package money

import java.math.BigDecimal

class Bank {
    companion object {
        private val rates = mutableMapOf<Pair<String, String>, Int>();
        fun reduce(expression: Expression, currency: String): Money {
            return expression.reduce(currency)
        }

        fun addRate(from: String, to: String, rate: Int) = rates.put(Pair(from, to) , rate)

        fun rate(from: String, to: String): Int {
            return rates.get(Pair(from, to)) ?: 1
        }
    }
}
