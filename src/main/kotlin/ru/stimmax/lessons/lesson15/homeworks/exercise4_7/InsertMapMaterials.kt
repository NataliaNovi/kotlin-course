package ru.stimmax.lessons.lesson15.homeworks.exercise4_7

//Четвёртый класс должен принимать словарь (ключи и значения строки).
//Каждая пара ключа и значения должна попадать в контейнер следующим образом -
//ключ в начало, значение в конец. Таким образом в начале должны быть ключи в обратном порядке,
//потом существующие материалы, потом все значения.
//
class InsertMapMaterials : Materials() {

    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}