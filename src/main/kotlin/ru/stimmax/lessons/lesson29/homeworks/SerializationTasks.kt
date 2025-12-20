package ru.stimmax.lessons.lesson29.homeworks

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
//
//Задание 3
//
//Создай функцию в которой:
//
//-сериализуй CTO в текст с настройкой prettyPrinting
//-текст запиши в файл в корне проекта.
//Задание 4
//
//Создай функцию в которой:
//
//-прочитай текст из файла
//-десериализуй его в объект класса Employee
//-распечатай в консоль
fun ex3() {
    val gson = GsonBuilder().setPrettyPrinting().create()
    gson.toJson(cto).also {
        File("structure.json").writeText(it)
    }
}


//Задание 4

fun ex4() {
    val gson = Gson()
    val json = File("structure.json").readText()
    val cto = gson.fromJson(json, Employee::class.java)
    println(cto)
    // Задание 5
    ex5(cto).groupBy { it.position }
        .map { group -> "${group.key}: ${group.value.joinToString { it.name }}" }
        .forEach { println(it) }
}




