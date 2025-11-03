package ru.stimmax.lessons.lesson16.homeworks
//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.
//Выполнить перегрузку addToCart который:
//Принимает два аргумента (itemId и количество amount)
//Принимает словарь из id и количества и добавляет всё в корзину
//Принимает список из id (добавляет по одной единице).
//Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы, включая итоговое количество артикулов и общее количество всего товара в корзине.
class Cart {
    private val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(newItems: Map<Int, Int>) {
        for ((id, amount) in newItems) {
            addToCart(id, amount)
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (id in itemIds) {
            addToCart(id)
        }
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.appendLine("╔════╦══════════╗")
        sb.appendLine("║ ID ║ Quantity ║")
        sb.appendLine("╠════╬══════════╣")
        var total = 0
        for ((id, qty) in items) {
            sb.appendLine("║ %-2d ║ %-8d ║".format(id, qty))
            total += qty
        }
        sb.appendLine("╚════╩══════════╝")
        sb.appendLine("Всего товаров: ${items.size}, Кол-во единиц: $total")
        return sb.toString()
    }
}

fun main() {
    val cart = Cart()
    cart.addToCart(1)
    cart.addToCart(2, 3)
    cart.addToCart(mapOf(3 to 5, 4 to 2))
    cart.addToCart(listOf(1, 2, 3))
    println(cart)
}
