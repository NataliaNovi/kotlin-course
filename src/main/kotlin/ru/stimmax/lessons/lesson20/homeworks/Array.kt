package ru.stimmax.lessons.lesson20.homeworks

// 1 Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел - первое и последнее. Если массив был пуст то вернуть пару из null значений.
fun Array<Int>.getAround(): Pair<Int?, Int?> {
    return if (isEmpty()) {
        null to null
    } else {
        first() to last()
    }
}