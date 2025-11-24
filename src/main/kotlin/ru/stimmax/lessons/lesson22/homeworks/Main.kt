package ru.stimmax.lessons.lesson22.homeworks



//Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//
//1. NullPointerException
//2. IndexOutOfBoundsException
//3. ClassCastException
//4. IllegalArgumentException
//5. NumberFormatException
//6. IllegalStateException
//7. OutOfMemoryError
//8. StackOverflowError
//Задание 9. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок
fun main() {
    // 1
    try {
        null!!
    } catch (e: NullPointerException) {
        println("It is NullPointerException! \uD83C\uDF89")
    }
// 2
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("It is IndexOutOfBoundsException! \uD83C\uDF89")
    }
// 3
    try {
        "" as Int
    } catch (e: ClassCastException) {
        println("It is ClassCastException! \uD83C\uDF89")
    }
// 4
    try {
        require(false)
    } catch (e: IllegalArgumentException) {
        println("It is IllegalArgumentException! \uD83C\uDF89")
    }
// 5
    try {
        "".toInt()
    } catch (e: NumberFormatException) {
        println("It is NumberFormatException! \uD83C\uDF89")
    }
// 6
    try {
        check(false)
    } catch (e: IllegalStateException) {
        println("It is IllegalStateException! \uD83C\uDF89")
    }
// 7
    try {
        (0..Long.MAX_VALUE).map { Long.MAX_VALUE }
    } catch (e: OutOfMemoryError) {
        println("It is OutOfMemoryError! \uD83C\uDF89")
    }
// 8
    try {
        a()
    } catch (e: StackOverflowError) {
        println("It is StackOverflowError! \uD83C\uDF89")
    }
}

fun a() {
    a()
}
//Задание 10. Напиши функцию, которая принимает nullable аргумент типа Any и в блоке try/catch выполни набор действий с этим аргументом которые могут потенциально вызвать одно из исключений в этом же порядке:
//
//1. NullPointerException
//2. IndexOutOfBoundsException
//3. ClassCastException
//4. IllegalArgumentException
//5. NumberFormatException
//6. IllegalStateException
//В блоке catch перехватывай исключение с общим типом Throwable а внутри через when определи тип исключения и выведи сообщение с названием исключения. Сразу после when выброси перехваченное исключение через throw, чтобы прекратить работу программы. Если аргумент функции не вызвал исключение, то выведи текст, сообщающий что переданный аргумент фантастически хорош!

fun catchable(arg: Any?) {
    try {
        arg!!
        arg as List<*>
        arg[2]
        require(arg[2] is String)
        check((arg[2] as String).toInt() == 3)
    } catch (e: Throwable) {
        val result = when (e) {
            is NullPointerException -> "It is NullPointerException"
            is ClassCastException -> "It is ClassCastException"
            is IndexOutOfBoundsException -> "It is IndexOutOfBoundsException"
            is NumberFormatException -> "It is NumberFormatException"
            is IllegalArgumentException -> "It is IllegalArgumentException"
            is IllegalStateException -> "It is IllegalStateException"
            else -> "It is unknown exception"
        }
        println(result)
        throw e
    }
    println("We have a fantastically good argument!")
}
//Варианты проверки функции

//fun main() {
//    catchable(null)
//    catchable("WTF?")
//    catchable(listOf(""))
//    catchable(listOf(1, 2, 3))
//    catchable(listOf(1, 2, "WTF?"))
//    catchable(listOf(1, 2, "3"))
//}