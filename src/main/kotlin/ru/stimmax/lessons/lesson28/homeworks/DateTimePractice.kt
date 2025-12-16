package ru.stimmax.lessons.lesson28.homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

//1.Создай текущую метку времени и выведи её на печать (чтобы ещё раз запомнить название этого класса)
//2.Создай дату своего дня рождения.
//3.Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
//4.Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того, содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени. В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они представлены в переданном объекте. Обработай в методе все типы дат, которые знаешь. Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.
//5.Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше. Не используй в них метод now()
//6.Создайте функцию identifyGeneration, которая расширяет класс LocalDate и печатает строку, определяющую, к какому поколению принадлежит человек родившийся в эту дату: "Бумер" для тех, кто родился с 1946 по 1964 год включительно, и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один из этих диапазонов, функция должна печатать "Не определено". Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate) или проверку вхождения в диапазон. Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.
//7.Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату в месяц и день.
//8.Выведи первую отформатированную дату, прибавив к ней 10 дней.
//9.Выведи вторую отформатированную дату, прибавив к ней 10 дней. Найди отличия)))
val boomerFrom = LocalDate.of(1946, 1, 1)
val boomerTo = LocalDate.of(1964, 12, 31)

val zoomerFrom = LocalDate.of(1997, 1, 1)
val zoomerTo = LocalDate.of(2012, 12, 31)
fun main() {
    val t1 = Instant.now()
    println(t1)

    val t2 = LocalDate.of(1983, 10, 2)

    val t3 = Period.between(t2, LocalDate.now())
    println(t3.years)

    val date = LocalDate.of(2025, 4, 5)
    val time = LocalTime.of(15, 45, 12)
    printFormatted(date)
    printFormatted(time)
    printFormatted(LocalDateTime.of(date, time))
    printFormatted(ZonedDateTime.of(date, time, ZoneId.of("Europe/Amsterdam")))
    printFormatted(OffsetDateTime.of(LocalDateTime.of(date, time), ZoneOffset.of("+03")))
    LocalDate.of(2013, 12, 30).identifyGeneration()

    val t71 = LocalDate.of(2023, 2, 25)
    val t72 = LocalDate.of(2024, 2, 25)
    val formatter = DateTimeFormatter.ofPattern("MM-dd")
    println(t71.plusDays(10).format(formatter))
    println(t72.plusDays(10).format(formatter))
}

fun printFormatted(arg: Temporal) {
    when (arg) {
        is LocalDate -> "dd-MM-YYYY"
        is LocalTime -> "HH:mm:ss"
        is LocalDateTime -> "dd-MM-YYYY HH:mm:ss"
        is ZonedDateTime -> "dd-MM-YYYY HH:mm:ss z"
        is OffsetDateTime -> "dd-MM-YYYY HH:mm:ss ZZZ"
        else -> throw IllegalArgumentException("Неизвестный тип данных")
    }.let {
        DateTimeFormatter.ofPattern(it).format(arg)
    }.also { println(it) }
}

fun LocalDate.identifyGeneration() {
    when (this) {
        in boomerFrom..boomerTo -> println("Это бумер!")
        in zoomerFrom..zoomerTo -> println("Это зумер!")
        else -> println("Это обычный человек")
    }
}