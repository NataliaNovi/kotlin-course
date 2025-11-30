package ru.stimmax.lessons.lesson23.homeworks

//Задание 3
//Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел (встречающихся в списке более одного раза).
//1.Создай аналогичную анонимную функцию.
//2.Создай аналогичное лямбда выражение с указанием типа.
//3.Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
//
fun List<Int>.duplicates(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

fun main() {
    val d1 = fun List<Int>.(): Set<Int> {
        return toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    val d11: List<Int>.() -> Set<Int> = {
        toSet().associate { element ->
            element to this.count { it == element }
        }.filter { it.value > 1 }
            .keys
    }
    val l = listOf(0, 1, 2, 4, 2, 5, 6, 5, 7)
    println(l.d11())
}