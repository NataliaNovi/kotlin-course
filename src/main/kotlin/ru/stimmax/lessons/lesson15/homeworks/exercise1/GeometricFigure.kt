package ru.stimmax.lessons.lesson15.homeworks.exercise1

//Для каждого задания опиши в коде базовый класс с базовыми свойствами и если применимо - методами.
//
//Для производных классов также добавь специфичные для класса свойства.
//Детально описывать не нужно, упражнение на то, чтобы усвоить иерархию наследования и
//развитие функциональности у наследников.
//
//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class GeometricFigure(val name: String) {

    open fun area(): Double {
        println("Площадь фигуры: '$name'")
        return 0.0
    }

    open fun perimeter(): Double {
        println("Периметр фигуры: '$name'")
        return 0.0
    }

    fun info() {
        println("Фигура: $name")
        println("Площадь: ${area()}")
        println("Периметр: ${perimeter()}")
        println()
    }
}
fun main() {
    val circle = Circle(1.26) // радиус для площади примерно 5
    val triangle = Triangle(3.0, 4.0, 5.0)
    val quad = Quadrilateral(2.0, 3.0, 2.0, 3.0)

    circle.info()
    triangle.info()
    quad.info()
}