package ru.stimmax.lessons.lesson15.homeworks.exercise4_7
//5.Второй класс должен получать список строк и вставлять их в начало контейнера,
//но поочерёдно с теми данными, которые уже есть.
//То-есть, наш список должен появиться в контейнере по индексам 0, 2, 4 и так далее.
import kotlin.math.max

class InsertOneByOneMaterials : Materials() {

    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = max(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}