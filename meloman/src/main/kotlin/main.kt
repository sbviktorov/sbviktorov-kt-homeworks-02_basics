import kotlin.math.roundToInt

fun main() {
    price(100, 10000, "Alex")
    price(100, 10001, "Ivan")
    price(1001, 1000, "Olga")
    price(1001, 1001, "Oleg")
    price(1001, 10001, "Roman")
}

fun isMeloman(user: String): Boolean {
    val melomans = arrayOf("Alex", "Ivan", "Sonya", "Julia")
    var meloman = false
    for (element in melomans) {
        if (user == element) {
            meloman = true
            break
        }
    }
    return meloman
}

fun price(sum: Int, sumOfPurchases: Int, user: String) {
    var cost: Int = sum * 100
    val statusBoolean = isMeloman(user)
    val status = if (statusBoolean) "(меломан)" else "(не меломан)"
    println("Покупатель $user$status, сумма предыдущих покупок $sumOfPurchases рублей.")
    print("Стоимость покупки $sum рублей")
    if (sumOfPurchases > 1000 || statusBoolean) {
        print(" →")
    }
    println()
    if (sumOfPurchases > 1000) {
        if (sumOfPurchases > 10000) {
            cost = (cost * 0.95).roundToInt()

            println("после применения 5% скидки - ${(cost / 100)} рублей ${cost % 100} копеек")
        } else if (sum >= 1000) {
            cost = cost - 100_00
            println("после применения скидки в размере 100 рублей - ${cost / 100} рублей ${cost % 100} копеек")
        }
    }
    if (statusBoolean) {
        cost = (cost * 0.99).roundToInt()
        println("после применения 1% скидки - ${cost / 100} рублей ${cost % 100} копеек")
    }
    println()
}