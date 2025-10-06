package ru.stimmax.lessons.lesson09.homeworks

fun main() {
    // Работа с массивами Array
    // 1) Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val arr1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("1) " + arr1.joinToString())

    // 2) Создайте пустой массив строк размером 10 элементов.
    val arr2: Array<String>  = Array(10) { "" }
    println("2) " + arr2.joinToString())

    // 3) Создайте массив из 5 элементов типа Double и заполните его значениями,
    // являющимися удвоенным индексом элемента.
    val arr3 = Array(5) { i -> i * 2.0 }
    println("3) " + arr3.joinToString())

    // 4) Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы
    // присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val arr4 = Array(5) { 0 }
    for (i in arr4.indices) {
        arr4[i] = i * 3
    }
    println("4) " + arr4.joinToString())

    // 5) Создайте массив из 3 nullable строк.
    // Инициализируйте его одним null значением и двумя строками.
    val arr5 = arrayOf<String?>(null, "Котлин", "Боль")
    println("5) " + arr5.joinToString())

    // 6) Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val arr6 = arrayOf(10, 20, 30, 40)
    val copyArr6 = Array(arr6.size) { 0 }
    for (i in arr6.indices) {
        copyArr6[i] = arr6[i]
    }
    println("6) " + copyArr6.joinToString())

    // 7) Создайте два массива целых чисел одинаковой длины. Создайте третий массив,
    // вычев значения одного из другого. Распечатайте полученные значения.
    val arr7a = arrayOf(10, 20, 30)
    val arr7b = arrayOf(5, 10, 15)
    val arr7c = Array(arr7a.size) { 0 }
    for (i in arr7a.indices) {
        arr7c[i] = arr7a[i] - arr7b[i]
    }
    println("7) " + arr7c.joinToString())

    // 8) Создайте массив целых чисел. Найдите индекс элемента со значением 5.
    // Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val arr8 = arrayOf(1, 3, 7, 5, 9)
    var index = 0
    var foundIndex = -1
    while (index < arr8.size) {
        if (arr8[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }
    println("8) $foundIndex")

    // 9) Создайте массив целых чисел. Используйте цикл для перебора массива и
    // вывода каждого элемента в консоль. Напротив каждого элемента должно быть
    // написано “чётное” или “нечётное”.
    val arr9 = arrayOf(1, 2, 3, 4, 5, 6)
    for (num in arr9) {
        if (num % 2 == 0)
            println("$num - чётное")
        else
            println("$num - нечётное")
    }

    // 10)Создай функцию, которая принимает массив строк и строку для поиска.
    // Функция должна находить в массиве элемент, в котором принятая строка является
    // подстрокой (метод contains()). Распечатай найденный элемент.
    val arr10 = arrayOf("Котлин", "очень", "интересный", "язык")
    findSubstring(arr10, "рес")
}

// Функция для поиска подстроки
fun findSubstring(arr: Array<String>, query: String) {
    for (str in arr) {
        if (str.contains(query)) {
            println("10) $str")
            return
        }
    }
    println("10) Ничего не найдено")
}





