package ru.stimmax.lessons.lesson15.homeworks.exercise1
//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class Polygon(name: String, val sides: Int) : GeometricFigure(name) {

}

// Дополнительное разветвление: Треугольник
class Triangle(val a: Double, val b: Double, val c: Double) : Polygon("Треугольник", 3) {

    override fun perimeter(): Double = a + b + c

    override fun area(): Double {
        val p = perimeter() / 2
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)) // формула Герона
    }
}

// Дополнительное разветвление: Четырехугольник
class Quadrilateral(val a: Double, val b: Double, val c: Double, val d: Double) :
    Polygon("Четырёхугольник", 4) {

    override fun perimeter(): Double = a + b + c + d

    override fun area(): Double {
        // Упрощённо: если прямоугольник
        return a * b
    }
}