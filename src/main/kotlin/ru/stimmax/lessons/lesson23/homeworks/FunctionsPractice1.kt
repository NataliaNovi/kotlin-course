package ru.stimmax.lessons.lesson23.homeworks

//Задание 1
//Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка. С помощью require проверь, что список не пустой.
//1.Создай аналогичную анонимную функцию.
//2.Создай аналогичное лямбда выражение с указанием типа.
//3.Создай лямбда выражение без указания типа.
//4.Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).
fun example01(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.filter { it % 2 == 0 }
        .average()
}

fun main() {
    val e1 = fun (list: List<Int>): Double {
        require(list.isNotEmpty())
        return list.filter { it % 2 == 0 }
            .average()
    }
    val e11: (List<Int>) -> Double = { list ->
        require(list.isNotEmpty())
        list.filter { it % 2 == 0 }
            .average()
    }
    val e111 = { list: List<Int> ->
        require(list.isNotEmpty())
        list.filter { it % 2 == 0 }
            .average()
    }
    val list1 = listOf<Int>()
    val list2 = listOf(1)
    val list3 = listOf(1, 2, 3, 4, 5, 6)
    println(e111(list3))
}

