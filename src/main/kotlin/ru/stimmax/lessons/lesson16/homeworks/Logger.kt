package ru.stimmax.lessons.lesson16.homeworks
//Класс “Логгер”: представляет из себя инструмент для вывода информации в консоль с разным префиксами уровня логирования (INFO, WARNING, ERROR, DEBUG)
//Базовый метод log(message) выводит в консоль сообщение message с префиксом INFO
//Выполнить перегрузку метода log, который:
//Принимает уровень логирования и сообщение. Выводит сообщения типа WARNING жёлтым цветом, а ERROR белым цветом на красном фоне.
//Принимает список сообщений и все их выводит с уровнем INFO
//Принимает объект типа Exception и выводит его поле message с префиксом уровня ERROR
//Попробуй создать логгер и добавить в него сообщения разными способами. Проверь вывод в консоли.
class Logger {
    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("\u001B[33mWARNING: $message\u001B[0m")
            "ERROR" -> println("\u001B[37m\u001B[41mERROR: $message\u001B[0m")
            "DEBUG" -> println("\u001B[36mDEBUG: $message\u001B[0m")
            else -> println("INFO: $message")
        }
    }

    fun log(messages: List<String>) {
        for (msg in messages) {
            log(msg)
        }
    }

    fun log(e: Exception) {
        log("ERROR", e.message ?: "Unknown error")
    }
}

fun main() {
    val logger = Logger()
    logger.log("Программа запущена")
    logger.log("WARNING", "Память почти закончилась")
    logger.log("ERROR", "Файл не найден")
    logger.log(listOf("Шаг 1 выполнен", "Шаг 2 выполнен", "Шаг 3 выполнен"))
    logger.log(Exception("Ошибка сети"))
}
