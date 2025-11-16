package ru.stimmax.lessons.lesson20.homeworks

// 3 Создайте функцию-расширение для nullable словаря с дженериком:
//1.Ключ является дженериком
//2.Значение является списком из дженериков
//3.Принимает целое число
//4.Возвращает nullable словарь из ключей изначального словаря приведённых к строке через toString()
//5.Значений из nullable дженерика, взятых из изначального ключа-списка по индексу из аргумента, если такого индекса нет - значением будет null
fun <R> Map<R, List<R>>?.mapByIndex(index: Int): Map<String, R?>? {
    return this?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(index) }
}