package ru.stimmax.lessons.lesson19.homeworks
// 5 Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь, в котором ключ и значения поменялись местами.
fun <I, D> transposition(map: Map<I, D>): Map<D, I> {
    return map.map { it }.associate { it.value to it.key }
}