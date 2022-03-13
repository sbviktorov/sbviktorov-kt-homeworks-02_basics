package ru.netology

import kotlin.math.roundToInt


fun main() {
    calculate(100)
    calculate(4667)
    calculate(4668)
    calculate(5001)
    calculate(7589)
    calculate(10000)

}

fun calculate(amount: Int) {
    val sum: Int = (amount * 100 * 0.0075).roundToInt()
    val commission: Double = if (sum < 3500) 35.00 else sum.toDouble() / 100.0
    println("Комиссия от $amount составила $commission рублей")
}