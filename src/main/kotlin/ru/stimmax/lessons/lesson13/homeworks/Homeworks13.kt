package ru.stimmax.lessons.lesson13.homeworks

fun main() {
// Задание 1:
// Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val testTimes1 = mapOf("testLogin" to 12, "testSignup" to 20, "testSearch" to 8)
    val averageTime1 = testTimes1.values.average()
    println("Среднее время выполнения теста: $averageTime1")

// Задание 2:
// Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val meta2 = mapOf("testLogin" to "owner:alice", "testProfile" to "owner:bob")
    val methods2 = meta2.keys.toList()
    println("Список тестовых методов: $methods2")

// Задание 3:
// В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val runResults3 = mutableMapOf("testLogin" to "passed", "testSearch" to "failed")
    runResults3["testCheckout"] = "passed"
    println("Данные о прохождении тестов после добавления: $runResults3")

// Задание 4:
// Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val results4 = mapOf("t1" to "passed", "t2" to "failed", "t3" to "passed", "t4" to "skipped")
    val passedCount4 = results4.count { it.value == "passed" }
    println("Количество успешных тестов: $passedCount4")

// Задание 5:
// Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val bugs5 = mutableMapOf("BUG-1" to "open", "BUG-2" to "fixed", "BUG-3" to "in progress")
    bugs5.remove("BUG-2")
    println("Баги после удаления исправленного: $bugs5")

// Задание 6:
// Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val webResults6 = mapOf("/index" to "200", "/login" to "500")
    webResults6.forEach { (url, status) -> println("Страница $url — статус $status") }

// Задание 7:
// Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val serviceTimes7 = mapOf("auth" to 250, "user" to 80, "payment" to 300)
    val threshold7 = 200
    val slowServices7 = serviceTimes7.filterValues { it > threshold7 }
    println("Сервисы с временем ответа > $threshold7: $slowServices7")

// Задание 8:
// В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiResults8 = mapOf("/api/user" to "200", "/api/order" to "404")
    val endpoint8 = "/api/cart"
    val status8 = apiResults8.getOrElse(endpoint8) { "not tested" }
    println("Статус для $endpoint8: $status8")

// Задание 9:
// Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для \"browserType\". Ответ не может быть null.
    val envConfig9: Map<String, String?> = mapOf("browserType" to null, "timeout" to "30s")
    val browserType9 = envConfig9.getOrDefault("browserType", "chrome") ?: "chrome"
    println("browserType: $browserType9")

// Задание 10:
// Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val versions10 = mapOf("app" to "1.0.0")
    val versionsCopy10 = versions10.toMutableMap().also { it["app"] = "1.1.0" }.toMap()
    println("Словарь версий после добавления новой: $versionsCopy10")

// Задание 11:
// Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val mobileSettings11 = mapOf("Pixel5" to "dpi=420;api=30", "GalaxyS10" to "dpi=480;api=29")
    val model11 = "iPhone12"
    val settings11 = mobileSettings11.getOrDefault(model11, "default-settings")
    println("Настройки для $model11: $settings11")

// Задание 12:
// Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val errors12 = mapOf(1001 to "NullPointer", 1002 to "IndexOutOfBounds")
    val contains100212 = errors12.containsKey(1002)
    println("Содержит код ошибки 1002: $contains100212")

// Задание 13:
// Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате \"TestID_Version\", а значения — статусы выполнения этих тестов (\"Passed\", \"Failed\", \"Skipped\"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val scenarios13 = mapOf("T1_v1" to "Passed", "T2_v2" to "Failed", "T3_v1" to "Skipped")
    val requiredVersion13 = "v1"
    val filteredScenarios13 = scenarios13.filterKeys { it.contains("_$requiredVersion13") }
    println("Сценарии для версии $requiredVersion13: $filteredScenarios13")

// Задание 14:
// У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val modules14 = mapOf("auth" to "passed", "payments" to "failed", "ui" to "passed")
    val hasFailedModule14 = modules14.any { it.value == "failed" }
    println("Есть ли модули с неудачным тестированием: $hasFailedModule14")

// Задание 15:
// Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val env15 = mutableMapOf("env" to "staging")
    val extra15 = mapOf("timeout" to "60s", "retries" to "3")
    env15.putAll(extra15)
    println("Настройки после добавления: $env15")

// Задание 16:
// Объедините два неизменяемых словаря с данными о багах.
    val bugsA16 = mapOf("BUG-1" to "open")
    val bugsB16 = mapOf("BUG-2" to "in progress")
    val mergedBugs16 = bugsA16 + bugsB16
    println("Объединённые баги: $mergedBugs16")

// Задание 17:
// Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val tempRuns17 = mutableMapOf("run1" to "ok", "run2" to "fail")
    tempRuns17.clear()
    println("Временные данные после очистки: $tempRuns17")

// Задание 18:
// Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val report18 = mapOf("a" to "passed", "b" to "skipped", "c" to "failed")
    val reportWithoutSkipped18 = report18.filterValues { it != "skipped" }
    println("Отчёт без skipped: $reportWithoutSkipped18")

// Задание 19:
// Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val fullConfig19 = mapOf("browser" to "chrome", "db" to "postgres", "cache" to "redis")
    val reducedConfig19 = fullConfig19 - listOf("db", "cache")
    println("Копия конфигурации с удалёнными элементами: $reducedConfig19")

// Задание 20:
// Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val resultsMap20 = mapOf("001" to "passed", "002" to "failed")
    val reportLines20 = resultsMap20.map { (id, res) -> "Test ID: $id: $res" }
    println("Отчёт строками: $reportLines20")

// Задание 21:
// Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val lastRun21 = mutableMapOf("t1" to "passed", "t2" to "failed")
    val archived21 = lastRun21.toMap()
    println("Неизменяемая копия для архива: $archived21")

// Задание 22:
// Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val numericIds22 = mapOf(1 to 120, 2 to 200)
    val stringIds22 = numericIds22.mapKeys { it.key.toString() }
    println("Ключи как строки: $stringIds22")

// Задание 23:
// Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val perf23 = mapOf("1.0" to 0.5, "1.1" to 0.7)
    val increasedPerf23 = perf23.mapValues { it.value * 1.10 }
    println("Оценки после увеличения на 10%: $increasedPerf23")

// Задание 24:
// Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compileErrors24 = emptyMap<String, String>()
    val isCompileErrorsEmpty24 = compileErrors24.isEmpty()
    println("Словарь ошибок компиляции пуст: $isCompileErrorsEmpty24")

// Задание 25:
// Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadResults25 = mapOf("load1" to "ok")
    val isLoadResultsNotEmpty25 = loadResults25.isNotEmpty()
    println("Словарь нагрузочного тестирования не пуст: $isLoadResultsNotEmpty25")

// Задание 26:
// Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val autoResults26 = mapOf("a" to "passed", "b" to "passed")
    val allPassed26 = autoResults26.all { it.value == "passed" }
    println("Все автоматизированные тесты прошли успешно: $allPassed26")

// Задание 27:
// Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val someResults27 = mapOf("x" to "passed", "y" to "failed")
    val hasAnyFailed27 = someResults27.any { it.value == "failed" }
    println("Есть ли хотя бы один тест с ошибкой: $hasAnyFailed27")

// Задание 28:
// Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val serviceResults28 = mapOf("optional_auth" to "failed", "mandatory_pay" to "failed", "optional_cache" to "passed")
    val filteredOptional28 = serviceResults28.filter { (k, v) -> v != "passed" && k.contains("optional") }
    println("Отфильтрованные сервисы (optional & не прошли): $filteredOptional28")

}

