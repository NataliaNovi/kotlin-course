package ru.stimmax.lessons.lesson15.homeworks.exercise1

//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Круг


class Circle(val radius: Double) : GeometricFigure(name = "Круг") {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}