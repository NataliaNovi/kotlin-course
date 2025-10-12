package ru.stimmax.lessons.lesson11.homeworks

fun main() {
    example2(5, 5)
    example3("Anna")
}

//Задачи на сигнатуру метода
// Напишите сигнатуру метода в которую входит модификатор доступа, название функции,
// список аргументов с типами и возвращаемое значение. В теле метода можешь сделать
// возврат объекта нужного типа если это требуется для устранения ошибок.

// 1) Не принимает аргументов и не возвращает значения.
fun example1() {
}

// 2) Принимает два целых числа и возвращает их сумму.
fun example2(a: Int, b: Int): Int {
    println("Сумма чисел $a и $b равна ${a + b}")
    return a + b
}
//fun example2(a: Int, b: Int): Int = a + b

// 3) Принимает строку и ничего не возвращает.
fun example3(name: String): Unit {
    println(name)
}

// 4) Принимает список целых чисел и возвращает среднее значение типа Double.
fun example4(numbers: List<Int>): Double {
    return numbers.average()
}

// 5) Принимает nullable строку и возвращает её длину в виде nullable целого числа и
// доступна только в текущем файле.
private fun example5(text: String?): Int? {
    return text?.length
}

// 6) Не принимает аргументов и возвращает nullable вещественное число.
fun example6(): Double? {
    return null
}

// 7) Принимает nullable список целых чисел, не возвращает значения и доступна только
// в текущем файле.
private fun example7(a: List<Int?>) {
    println(a)
}

// 8) Принимает целое число и возвращает nullable строку.
fun example8(f: Int): String? {
    return "$f"
}

// 9) Не принимает аргументов и возвращает список nullable строк.
fun example9(): List<String?> {
    return listOf()
}

// 10) Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun example10(text: String?, num: Int?): Boolean? {
    return true
}


//Задачи на написание кода
//Напишите валидную сигнатуру метода, а так же рабочий код для задач.
//
// 11) Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его,
// умноженное на 2.
fun multiplyByTwo(a: Int): Int = a * 2

// 12) Создайте функцию isEven, которая принимает целое число и возвращает true,
// если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    if (a % 2 == 0) {
        return true
    } else return false
}

// 13) Напишите функцию printNumbersUntil, которая принимает целое число n и выводит
// на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с
// помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// 14) Создайте функцию findFirstNegative, которая принимает список целых чисел и
// возвращает первое отрицательное число в списке. Если отрицательных чисел нет,
// функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (num in numbers) {
        if (num < 0) {
            return num
        }
    }
    return null
}

// 15) Напишите функцию processList, которая принимает список строк. Функция должна
// проходить по списку и выводить каждую строку. Если встречается null значение,
// функция должна прекратить выполнение с помощью return без возврата значения.

fun processList(list: List<String?>) {
    for (item in list) {
        if (item == null) return
        println(item)
    }
}

