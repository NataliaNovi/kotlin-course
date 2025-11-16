package ru.stimmax.lessons.lesson20.homeworks
// 6 Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через ответы (но мы то знаем что слово только одно, но не будем его называть). Напиши метод расширения строки, который будет принимать список имён пользователей и выводить в консоли исходную строку побуквенно в верхнем регистре в столбик: имя автора и букву под ним. Вот ссылка на референс:
//https://x.com/SadNSober_/status/1370280031616897026
fun String.twitterize(authors: List<String>) {
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}
