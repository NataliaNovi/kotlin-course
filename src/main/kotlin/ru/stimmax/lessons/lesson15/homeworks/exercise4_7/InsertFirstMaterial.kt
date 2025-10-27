package ru.stimmax.lessons.lesson15.homeworks.exercise4_7

//Создай подклассы этого контейнера, которые будут добавлять строку material
//(или коллекции или словари строк) в какое-то определённое место (места).
//
//4.Первый класс должен вставлять строку на дно контейнера
//(должно появиться под индексом 0)

class InsertFirstMaterial : Materials() {

    fun insert(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach {
            addMaterial(it)
        }
    }
}