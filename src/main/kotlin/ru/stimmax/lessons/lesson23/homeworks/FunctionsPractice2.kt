package ru.stimmax.lessons.lesson23.homeworks

//Задание 2
//Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа. Сделай проверку, что входящее число больше нуля. Подсказка: для парсинга символа в число можно использовать функцию digitToInt()
//1.Создай аналогичную анонимную функцию.
//2.Создай аналогичное лямбда выражение с указанием типа.
//3.Создай лямбда выражение без указания типа.
//4.Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
fun example02(bigNumber: Long): Int {
    require(bigNumber > 0) { "Число должно быть больше нуля" }
    return "$bigNumber".sumOf { it.digitToInt() }
}

fun main() {
    val e2 = fun (bigNumber: Long): Int {
        require(bigNumber > 0) { "Число должно быть больше нуля" }
        return "$bigNumber".sumOf { it.digitToInt() }
    }
    val e22: (Long) -> Int = { number ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }
    val e222 = { number: Long ->
        require(number > 0) { "Число должно быть больше нуля" }
        "$number".sumOf { it.digitToInt() }
    }
}