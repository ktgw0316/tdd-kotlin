package money

interface Expression {
    fun reduce(to: String): Money
}

data class Sum(val augend: Money, val addend: Money): Expression {
    override fun reduce(to: String): Money {
        return Money(augend.amount + addend.amount, to)
    }
}
