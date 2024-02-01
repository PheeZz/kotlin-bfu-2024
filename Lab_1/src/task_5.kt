// 5. Задача: Найти максимальный элемент в каждой строке двумерного
// массива.
//  Условие: Напишите метод, который принимает двумерный массив целых
// чисел и возвращает одномерный массив, содержащий максимальный элемент
// из каждой строки исходного массива. Массив задается случайным образом.
// Пользователь вводит только размер массива по строкам и столбцам.

fun main() {
    val array = createRandomArray()
    printMatrix("\nИсходный массив:", array)
    val maxArray = findMaxElements(array)
    printArray("\nМассив максимальных элементов:", maxArray)
}

fun createRandomArray(): Array<IntArray> {
    println("Введите количество строк")
    val n = readLine()!!.toInt()
    println("Введите количество столбцов")
    val m = readLine()!!.toInt()
    val array = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        for (j in 0 until m) {
            array[i][j] = (0..100).random()
        }
    }
    return array
}

fun findMaxElements(array: Array<IntArray>): IntArray {
    val n = array.size
    val maxArray = IntArray(n)
    for (i in 0 until n) {
        var max = array[i][0]
        for (j in 0 until array[i].size) {
            if (array[i][j] > max) {
                max = array[i][j]
            }
        }
        maxArray[i] = max
    }
    return maxArray
}

fun printMatrix(message: String, array: Array<IntArray>) {
    println(message)
    for (row in array) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}

fun printArray(message: String, array: IntArray) {
    println(message)
    for (element in array) {
        print("$element ")
    }
    println()
}
