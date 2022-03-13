package ru.netology


fun main() {
    result(1)
    result(61)
    result(32)
    result(11)
    result(123)
    result(464)
    result(4665)
    result(6)
    result(507)
    result(7588)
    result(1009)
    result(501)
}

fun result(likes: Int) {
    if ((likes % 100 == 11) || (likes % 10 != 1)) {
        println("Понравилось $likes людям")
    } else {
        println("Понравилось $likes человеку")
    }
}