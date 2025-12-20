package ru.stimmax.lessons.lesson29.homeworks

import java.io.File
//Задание 5
//
//Для любителей алгоритмов. Не обязательное для выполнения.
//
//-Прочитай текст из файла и десериализуй в объект класса Employee.
//-Сгруппируй всех сотрудников по их должности.
//-Выведи в консоль в виде секций: должность и имена сотрудников через запятую.
//-Получение всех сотрудников выполняется через рекурсивную функцию, которая
//принимает объект Employee а возвращает список всех Employee без вложений.

fun ex5(arg: Employee): List<Employee> {
    return if (arg.subordinates.isNotEmpty()) {
        arg.subordinates
            .flatMap {
                ex5(it)
            } + arg.copy(subordinates = emptyList())
    } else {
        listOf(arg)
    }
}