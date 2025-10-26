package ru.stimmax.lessons.lesson14.homeworks
//Покупка: продукт. Создайте дата класс для продукта, который будет представлять
//продукт в магазине. У него должны быть свойства “название”, “цена”, “количество”.

data class Product(val name: String, val price: Double, val quantity: Int)
fun main() {
    val pineapple = Product("Pineapple", 0.3, 1)
    println(pineapple)
}