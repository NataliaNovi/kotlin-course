package ru.stimmax.lessons.lesson09.homeworks

fun main() {
    //Работа с Множествами Set
    // 1) Создайте пустое неизменяемое множество целых чисел.
    val set1: Set<Int> = setOf()
    println("1) $set1")

    // 2) Создайте неизменяемое множество целых чисел, содержащее три различных
    // элемента (например, 1, 2, 3).
    val set2: Set<Int> = setOf(1, 2, 3)
    println("2) $set2")

    // 3) Создайте изменяемое множество строк и инициализируйте его несколькими
    // значениями (например, "Kotlin", "Java", "Scala").
    val set3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    println("3) $set3")

    // 4) Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val set4: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    set4.add("Swift")
    set4.add("Go")
    println("4) $set4")

    // 5) Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set5: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    set5.remove(2)
    println("5) $set5")

    // 6) Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set6 = setOf(10, 20, 30, 40)
    print("6) ")
    for (i in set6) {
        print("$i ")
    }
    println()

    // 7) Создай функцию, которая принимает множество строк (set) и строку и проверяет,
    // есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть.
    // Реши задачу через цикл.
    fun containsValue(set7: Set<String>) {
        val str = "я"
        for (element in set7) {
            if (element == str) {
                println("TRUE")
                return
            }
        }
        println("False")
    }

    // 8) Создайте множество строк и конвертируйте его в изменяемый список строк с
    // использованием цикла.
    val set8 = setOf("Kotlin", "Java", "Scala")
    val listWords = mutableListOf<String>()
    for (i in set8) {
        listWords.add(i)
    }
    println("8) $listWords")
}