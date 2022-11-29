package money

interface Expression {
}

data class Sum(val augend: Money, val addend: Money): Expression {
}
