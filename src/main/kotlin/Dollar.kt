package money

class Dollar(var amount: Int) {
    operator fun times(multiplier: Int): Dollar {
        amount *= multiplier
        return this
    }
}