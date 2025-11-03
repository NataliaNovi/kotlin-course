package ru.stimmax.lessons.lesson16.homeworks
//Геометрические Фигуры и Их Площадь
//Абстрактный (базовый) класс: Shape с open методом area().
//Классы наследники: Circle, Square, Triangle.
//Метод area() возвращает 0.0.
//Переопределите метод area() в каждом классе-наследнике для расчета площади соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие вычислить площадь (для круга это радиус, для квадрата это сторона, для треугольника это две стороны и угол между ними)
//Создай набор геометрических фигур и выведи в цикле их площадь

import kotlin.math.*

open class Shape {
    open fun area(): Double = 0.0
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(private val a: Double, private val b: Double, private val angleDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angleDegrees)
        return 0.5 * a * b * sin(angleRadians)
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(3.0),
        Square(4.0),
        Triangle(5.0, 6.0, 30.0)
    )
    for (s in shapes) {
        println("Площадь фигуры: ${"%.2f".format(s.area())}")
    }
}
