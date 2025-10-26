package ru.stimmax.lessons.lesson14.homeworks

//Событие: вечеринка. Создайте класс Party, который описывает вечеринку.
//У него должны быть свойства location (String) и attendees (Int).
//Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.

class Party(val location: String, val attendees: Int) {

    fun details() {
        println("The party is at $location with $attendees attendees.")
    }
}

fun main() {
    val party = Party("Beach House", 10)
    party.details()
}