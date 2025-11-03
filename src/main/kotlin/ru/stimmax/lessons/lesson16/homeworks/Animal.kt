package ru.stimmax.lessons.lesson16.homeworks
//Животные и Их Звуки
//Базовый класс: Animal с методом makeSound().
//Классы наследники: Dog, Cat, Bird.
//Базовый метод makeSound() в классе Animal выводит "This animal makes no sound."
//Переопределите метод makeSound() в каждом классе-наследнике, чтобы Dog выводил "Bark", Cat - "Meow", Bird - "Tweet". Обогати вывод звуков цветом.
//Создайте список животных List<Animal> и вызовите в цикле метод makeSound()
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[33mBark\u001B[0m") // жёлтый
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[35mMeow\u001B[0m") // фиолетовый
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("\u001B[36mTweet\u001B[0m") // голубой
    }
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())
    for (a in animals) {
        a.makeSound()
    }
}
