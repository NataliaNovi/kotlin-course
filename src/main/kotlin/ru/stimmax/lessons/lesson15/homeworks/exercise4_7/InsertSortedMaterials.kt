package ru.stimmax.lessons.lesson15.homeworks.exercise4_7

//6.Третий класс при добавлении строки должен отсортировать весь список метиралов
//в алфавитном порядке включая добавляемый материал.

class InsertSortedMaterials : Materials() {

    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}