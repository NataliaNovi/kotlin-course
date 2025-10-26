package ru.stimmax.lessons.lesson14.homeworks
//Аспект реальности: эмоция. Создайте класс Emotion, который
//представляет эмоцию. У него должно быть свойство type (String)
//и intensity (Int). Добавьте метод express(), который выводит
//описание эмоции в зависимости от её типа и интенсивности.

class Emotion(val type: String, val intensity: Int) {
    fun express(){
        println("Эмоция: $type; интенсивность: $intensity")

    }
}

fun main() {
    val emotion = Emotion("счастье", 5)
    emotion.express()
}