package ru.stimmax.lessons.lesson14.homeworks
//Класс Rack (Стеллаж)
//
//Характеристики:
//
//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.
//Методы:
//
//Добавление Полки (addShelf):
//Добавляет новую полку в стеллаж.
//Возвращает true, если полка была успешно добавлена или false если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.
//Удаление Полки (removeShelf):
//Принимает индекс полки для удаления.
//Удаляет полку по указанному индексу.
//Возвращает список предметов полки, если полка была успешно удалена или пустой список если полка не существует.
//Добавление Предмета (addItem):
//Добавляет предмет на первую свободную полку.
//Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.
//Удаление Предмета (removeItem):
//Находит и удаляет только один предмет с любой полки.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//Проверка наличия предмета на стеллаже (containsItem):
//Возвращает true если предмет есть на одной из полок
//Получение списка полок (getShelves):
//Возвращает неизменяемый список полок
//Печать Содержимого (printContents):
//Выводит в консоль информацию о каждой полке: индекс, вместимость, оставшуюся вместимость, список предметов. Информацию выводить в наглядном читаемом виде
//Сложное удаление полки (advancedRemoveShelf):
//Принимает индекс полки для удаления
//Перераспределяет предметы по имеющимся полкам, начиная с самых длинных. Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
//Удаляет полку с оставшимися предметами
//Возвращает неизменяемый список предметов, которые не удалось удалить или пустой список если полки с таким индексом нет.
//
class Rack(private val maxShelves: Int) {

    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.contains(shelf) || shelves.size == maxShelves) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val items = shelves[index].getItems()
        shelves.removeAt(index)
        return items
    }

    fun addItem(name: String): Boolean {
        if (shelves.isEmpty()) {
            return false
        }
        for (shelf in shelves) {
            if (shelf.canAccommodate(name)) {
                return shelf.addItem(name)
            }
        }
        return false
    }

    fun removeItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(name)) {
                return shelf.removeItem(name)
            }
        }
        return false
    }

    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    fun getShelves() = shelves.toList()

    fun printContents() {
        for (i in shelves.indices) {
            val capacity = shelves[i].capacity
            val accessiblePlace = capacity - shelves[i].getItems()
                .map { it.length }
                .sum()
            val meta = "$i вместимость: $capacity доступно: $accessiblePlace"
            val items = shelves[i].getItems().joinToString()
            println(meta)
            println("Предметы: $items")
            println()
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val notReplacedItems = mutableListOf<String>()
        val otherShelves = shelves - shelves[index]
        for (item in shelves[index].getItems()) {
            if (otherShelves.none { it.addItem(item) }) {
                notReplacedItems.add(item)
            }
        }
        shelves.removeAt(index)
        return notReplacedItems.toList()
    }
}