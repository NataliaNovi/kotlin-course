package ru.stimmax.lessons.lesson25.homeworks
class Person(val name: String, val age: Int) {
    var email: String = ""
}

class Employee(val name: String, val age: Int, val position: String) {
    var email: String = ""
    var department: String = "General"
}

//Задание 1. Функция высшего порядка.
//Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет время её выполнения. Функция timeTracker должна возвращать затраченное время в миллисекундах. Для измерения времени используйте System.currentTimeMillis() до и после выполнения переданной функции.
//
//Для проверки результата можно выполнить в ней например такой ресурсоёмкий код:
//
//val myFunction = {
//   val list = List(10000000) { (0..10000).random() }
//   list.sorted()
//}
//Задания для работы со scope функциями
//Давайте создадим два класса, которые будут использоваться в заданиях для демонстрации работы scope функций с преобразованием объектов и инициализацией или обновлением полей. Классы будут представлять собой Person и Employee, где Employee может быть создан на основе данных класса Person.
//
//Классы для выполнения заданий
//
//class Person(val name: String, val age: Int) {
//   var email: String = ""
//}
//
//class Employee(val name: String, val age: Int, val position: String) {
//   var email: String = ""
//   var department: String = "General"
//}
fun ex1(fnc: () -> Any): Long {
    val start = System.currentTimeMillis()
    fnc()
    return System.currentTimeMillis() - start
}

fun runTask1() {
    val myFunction = {
        val list = List(10_000_000) { (0..10000).random() }
        list.sorted()
    }
    println("Task 1 Time: " + ex1(myFunction))
}


//Задание 2: Использование apply для инициализации объекта Employee
//
//Создайте объект Employee и используйте apply для инициализации его полей email и department.
//
fun runTask2() {
    val employee = Employee("Ivan", 23, "QA Engineer").apply {
        email = "ivan@gm.com"
        department = "Dep1"
    }
    println("Task 2 Employee: ${employee.name}, ${employee.email}, ${employee.department}")
}


//Задание 3: Использование also для логирования
//
//Создайте функцию, принимающую объект Person и выводящую информацию об объекте в консоль в красивом, отформатированном виде. Используй with для создания контекста Person и возможности использовать поля объекта напрямую без обращения к переменной.
//
//Создайте объект Person и используйте also для добавления почты и печати данных в консоль с помощью метода который только что создали.
//
fun printPerson(person: Person) {
    with(person) {
        println("""
           Name: $name
           Age: $age
           Email: $email
        """.trimIndent())
    }
}

fun runTask3() {
    val person = Person("Maria", 28).also {
        it.email = "maria@gm.com"
    }.also {
        printPerson(it)
    }
}



//Задание 4: Использование with для преобразование Person в Employee
//
//Создайте объект класса Person. Используйте функцию with, чтобы создать из этого объекта Employee, указав дополнительно должность. Возвращаемым значением должен быть новый объект Employee.
//
fun runTask4() {
    val person = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee = with(person) {
        Employee(name, age, "Front Dev").also {
            it.email = email
            it.department = "Dep2"
        }
    }

    println("Task 4 Employee: ${employee.name}, ${employee.email}, ${employee.department}")
}

//Задание 5: Использование run для преобразования и инициализации Employee
//
//Перепиши предыдущую задачу на использование run вместо with.
//
fun runTask5() {
    val person = Person("Andrew", 32).apply {
        email = "andrew@gm.com"
    }

    val employee = person.run {
        Employee(name, age, "Front Dev").also {
            it.email = email
            it.department = "Dep2"
        }
    }

    println("Task 5 Employee: ${employee.name}, ${employee.email}, ${employee.department}")
}


//Задание 6: Использование let для безопасного преобразования Person в Employee
//
//Создайте функцию toEmployee, которая расширяет класс Person, который может быть null. В функции используйте функцию let для создания Employee, только если объект Person не null. В противном случае возвращается null
//
fun Person?.toEmployee(position: String, depart: String): Employee? {
    return this?.let {
        Employee(it.name, it.age, position).apply {
            email = it.email
            department = depart
        }
    }
}

fun runTask6() {
    val person: Person? = Person("Olga", 30).apply { email = "olga@gm.com" }
    val employee = person.toEmployee("HR", "People Dept")

    println("Task 6 Result: ${employee?.name}, ${employee?.department}")
}


// ---------------------- ЕДИНСТВЕННАЯ MAIN -------------------------

fun main() {
    runTask1()
    runTask2()
    runTask3()
    runTask4()
    runTask5()
    runTask6()
}