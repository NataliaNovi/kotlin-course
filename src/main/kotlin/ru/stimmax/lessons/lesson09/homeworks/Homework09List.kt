package ru.stimmax.lessons.lesson09.homeworks

fun main() {
    // Работа со списками List
    // 1) Создайте пустой неизменяемый список целых чисел.
    val list1: List<Int> = listOf()
    println("1) $list1")

    // 2) Создайте неизменяемый список строк, содержащий три элемента
    // (например, "Hello", "World", "Kotlin").
    val list2: List<String> = listOf("Hello", "World", "Kotlin")
    println("2) $list2")

    // 3) Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println("3) $list3")

    // 4) Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val list4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)
    println("4) $list4")

    // 5) Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list5: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")
    println("5) $list5")

    // 6) Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list6 = listOf(10, 20, 30, 40)
    print("6) ")
    for (i in list6) {
        print("$i ")
    }
    println()

    // 7) Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7 = listOf("Привет", "как", "дела?")
    val second = list7[1]
    println("7) $second")

    // 8) Имея изменяемый список чисел, измените значение элемента на определенной позиции
    // (например, замените элемент с индексом 2 на новое значение).
    val list8: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 15
    println("8) $list8")

    // 9) Создайте два списка строк и объедините их в один новый список, содержащий элементы
    // обоих списков. Реши задачу с помощью циклов.
    val list91 = listOf("Привет", "как", "дела?")
    val list92 = listOf("Спасибо", "все", "отлично")
    val list93 = mutableSetOf<String>()
    for (elements in list91) {
        list93.add(elements)
    }
    for (elements in list92) {
        list93.add(elements)
    }
    println("9) $list93")

    // 10) Создайте список целых чисел и найдите в нем минимальный и максимальный элементы
    // используя цикл.
    val list10 = listOf(1, 20, 36, 410)
    var min = list10[0]
    var max = list10[0]
    for (i in list10) {
        if (i < min) min = i
        if (i > max) max = i
    }
    println("10) $min, $max")

    // 11) Имея список целых чисел, создайте новый список, содержащий только четные числа из
    // исходного списка используя цикл.
    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val listNew = mutableListOf<Int>()
    for (i in list11) {
        if (i % 2 == 0) {
            listNew.add(i)
        }
    }
    println("11) $listNew")
}