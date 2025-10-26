package ru.stimmax.lessons.lesson14.homeworks

//Мероприятие: концерт. Создайте класс, который будет представлять концерт.
//У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”.
//Также приватное поле “проданные билеты”.
//Добавьте метод, который выводит информацию о концерте и метод “купить билет”,
//который увеличивает количество проданных билетов на один.

class Concert(val band: String, val location: String, val cost: Int, val capacity: Int) {

    private var ticketSold = 0

    fun buyTicket() {
        if (ticketSold < capacity) {
            ticketSold++
        }
    }

    fun printDetails() {
        println("Концерт группы $band в $location. Стоимость билета $cost. Осталось ${capacity - ticketSold} мест")
    }
}

fun main() {
    val concert = Concert("КотЛин", "Москва Арена", 5000, 1000)
    concert.printDetails()
    concert.buyTicket()
    concert.printDetails()
}