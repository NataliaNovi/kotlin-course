package ru.stimmax.lessons.lesson07.homeworks

fun main() {

//Задания для цикла for
//Прямой диапазон
//1.Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5){
        println(i)
    }

//2.Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10){
        if (i % 2 == 0){
            println(i)
        }
    }

//Обратный диапазон
//3.Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1){
        println(i)
    }

//4.Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    //без step
    for (i in 10 downTo 1){
        if (i % 2 == 0) {
            println(i)
        }
    }

    //co step
    for (i in 10 downTo 1 step 2){
        println(i)
    }

//С шагом (step)
//5.Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2){
        println(i)
    }

//6.Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3){
        println(i)
    }

//Использование до (until)
//7.Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    val size = 10
    for (i in 0 until size step 2) {
        println(i)
    }

//Задания для цикла while
//Цикл while
//8.Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var i = 1
    while (i <= 5) {
        println(i*i)
        i++
    }
//  var i = 0 // еще вариант
//  while (++i <= 5) {
//      println(i*i)
//  }

//9.Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var number = 10
    while (number >= 5) {
        println(number--)
    }

//Цикл do while
//10.Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var num = 5
    do {
        println(num)
    } while (--num >= 1)

//11.Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var couter = 5
    do {
        println(couter++)
    } while (couter < 10)

//Задания для прерывания и пропуска итерации
//Использование break
//12.Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (v in 1..10){
        if (v == 6) break
        println(v)
    }

//13.Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var g = 1
    while (true) {
        println(g)
        if (g++ == 10) break
    }

//Использование continue
//14.В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (d in 1..10){
        if (d % 2 == 0) continue
        println(d)
    }

//15.Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var p = 0
    while (p <= 9) {
        p++
        if (p % 3 == 0) continue
        println(p)
    }
}