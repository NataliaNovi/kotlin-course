package ru.stimmax.lessons.lesson16.homeworks
//Принтер
//Создай абстрактный принтер, который имеет абстрактный метод печати, принимающий в качестве аргумента строку.
//Создай классы наследники: лазерный и струйный
//Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно чёрными буквами на белом фоне (хорошо работает на тёмной теме)
//Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными
//буквами на цветном фоне. Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона и проходить циклически по этому списку при выводе текста. Проверить работу на длинном тексте
abstract class Printer {
    abstract fun print(text: String)
}

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println("\u001B[30m\u001B[47m$word\u001B[0m") // чёрный текст на белом фоне
        }
    }
}

class InkjetPrinter : Printer() {
    private val colors = listOf(
        Pair("\u001B[31m", "\u001B[47m"), // красный на белом
        Pair("\u001B[32m", "\u001B[45m"), // зелёный на фиолетовом
        Pair("\u001B[34m", "\u001B[43m")  // синий на жёлтом
    )

    override fun print(text: String) {
        val words = text.split(" ")
        for ((i, word) in words.withIndex()) {
            val (fg, bg) = colors[i % colors.size]
            println("$fg$bg$word\u001B[0m")
        }
    }
}

fun main() {
    val laser = LaserPrinter()
    val inkjet = InkjetPrinter()
    val longText = "Kotlin is a modern programming language that makes developers happier"

    println("=== Лазерный принтер ===")
    laser.print(longText)

    println("\n=== Струйный принтер ===")
    inkjet.print(longText)
}
