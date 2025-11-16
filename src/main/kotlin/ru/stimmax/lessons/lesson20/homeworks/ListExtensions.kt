package ru.stimmax.lessons.lesson20.homeworks

// 2 Создайте функцию-расширение для изменяемого списка элементов:
//1.с дженериком T ограниченным интерфейсом Comparable<T>
//2.которая принимает булево значение
//3.возвращает этот же список только в виде неизменяемого
//4.сам изменяемый список при этом должен стать отсортированным по возрастанию, если в функцию передано true и по убыванию, если false (используем функции sort() и sortDescending()
fun <T : Comparable<T>> MutableList<T>.sort(direction: Boolean): List<T> {
    val self = toList()
    if (direction) {
        sort()
    } else {
        sortDescending()
    }
    return self
}