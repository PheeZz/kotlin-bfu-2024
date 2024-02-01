// 4. Найти наибольшую подстроку без повторяющихся символов.
//  Условие: Напишите метод, который принимает строку и возвращает
// наибольшую подстроку, в которой все символы уникальны.

fun main() {
    println("Введите строку для поиска наибольшей подстроки без повторяющихся символов")
    val stringToCheck = readLine()!!
    println("Самая длинная подстрока без повторяющихся символов: ${findLongestSubstring(stringToCheck)}")
}

fun findLongestSubstring(str: String): String {
    var longestSubstring = ""
    var currentSubstring = ""
    for (i in str.indices) {
        val index = currentSubstring.indexOf(str[i])
        if (index > -1) {
            currentSubstring = currentSubstring.substring(index + 1)
        }
        currentSubstring += str[i]
        if (currentSubstring.length > longestSubstring.length) {
            longestSubstring = currentSubstring
        }
    }
    return longestSubstring
}

