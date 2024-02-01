// 3. Дважды четное число
// Целое трехзначное число называется «дважды четным», если и сумма его
// цифр, и их произведение являются четными. Напишите класс, который
// принимает с клавиатуры положительное трехзначное число и проверяет,
// является ли оно «дважды четным».


fun main() {
    val number = TripleDigitNumber()
    number.readNumber()
    number.checkNumber()
}

class TripleDigitNumber {
    var number: Int = 0
    var sum: Int = 0
    var product: Int = 1

    fun readNumber() {
        println("Введите трехзначное число")
        number = readLine()!!.toInt()
        if (number < 100 || number > 999) {
            throw Exception("Число не трехзначное")
        }
    }

    fun checkNumber() {
        sum = number / 100 + number / 10 % 10 + number % 10
        product = (number / 100) * (number / 10 % 10) * (number % 10)
        if (sum % 2 == 0 && product % 2 == 0) {
            println("Число $number является дважды четным")
        } else {
            println("Число $number не является дважды четным")
        }
    }
}
