package ru.stimmax.lessons.lesson18.homeworks.devices

import java.io.InputStream
//Задача 2. Создай абстрактный класс для включаемого оборудования и имплементируй соответствующий интерфейс с реализацией методов (достаточно println с выполняемым действием).
// Реализация всех устройств с println

// Абстрактный базовый класс
abstract class PoweredDevice : Powerable {
    override fun powerOn() = println("${this::class.simpleName} включено")
    override fun powerOff() = println("${this::class.simpleName} выключено")
}

// 1. Refrigerator -------------------------------------------------
class MyRefrigerator : Refrigerator() {
    override fun open() = println("Холодильник открыт")
    override fun close() = println("Холодильник закрыт")

    override val maxTemperature: Int = 8
    override fun setTemperature(temp: Int) = println("Температура холодильника установлена на $temp°C")

    override fun clean() = println("Холодильник очищен")

    override fun programAction(action: String) = println("Холодильник запрограммирован на: $action")
    override fun execute() = println("Холодильник выполняет программу")

    override fun powerOn() = println("Холодильник включён")
    override fun powerOff() = println("Холодильник выключен")
}

// 2. WashingMachine -------------------------------------------------
class MyWashingMachine : WashingMachine() {
    override fun connectToWaterSupply() = println("Стиральная машина подключена к воде")
    override fun getWater(amount: Int) = println("Стиральная машина взяла $amount литров воды")

    override fun connectToDrain() = println("Стиральная машина подключена к сливу")
    override fun drain() = println("Стиральная машина сливает воду")

    override fun setTimer(time: Int) = println("Таймер установлен на $time минут")

    override val maxTemperature: Int = 90
    override fun setTemperature(temp: Int) = println("Температура стирки установлена на $temp°C")

    override fun clean() = println("Стиральная машина очищена")

    override fun programAction(action: String) = println("Программа стирки: $action")
    override fun execute() = println("Стирка начата")

    override fun powerOn() = println("Стиральная машина включена")
    override fun powerOff() = println("Стиральная машина выключена")
}

// 3. SmartLamp ------------------------------------------------------
class MySmartLamp : SmartLamp() {
    override fun emitLight() = println("Лампа излучает свет")
    override fun completeLiteEmission() = println("Лампа выключила свет")

    override fun powerOn() = println("Умная лампа включена")
    override fun powerOff() = println("Умная лампа выключена")

    override fun programAction(action: String) = println("Запрограммировано действие лампы: $action")
    override fun execute() = println("Лампа выполняет программу")
}

// 4. DigitalClock ---------------------------------------------------
class MyDigitalClock : DigitalClock() {
    override fun setTimer(time: Int) = println("Таймер часов: $time секунд")
    override fun powerOn() = println("Цифровые часы включены")
    override fun powerOff() = println("Цифровые часы выключены")
}

// 5. RobotVacuum ----------------------------------------------------
class MyRobotVacuum : RobotVacuum() {
    override fun move(direction: String, distance: Int) = println("Робот-пылесос движется $direction на $distance метров")

    override fun clean() = println("Робот-пылесос начал уборку")

    override fun programAction(action: String) = println("Робот-пылесос запрограммирован: $action")
    override fun execute() = println("Робот-пылесос выполняет программу")

    override fun getChargeLevel(): Double = 75.0
    override fun recharge() = println("Робот-пылесос заряжается")

    override fun powerOn() = println("Робот-пылесос включён")
    override fun powerOff() = println("Робот-пылесос выключен")
}

// 6. MechanicalClock ------------------------------------------------
class MyMechanicalClock : MechanicalClock() {
    override fun performMechanicalAction() = println("Механические часы заводятся и идут")
}

// 7. Flashlight -----------------------------------------------------
class MyFlashlight : Flashlight() {
    override fun emitLight() = println("Фонарик излучает свет")
    override fun completeLiteEmission() = println("Фонарик отключил свет")

    override fun getCapacity(): Double = 50.0
    override fun replaceBattery() = println("Батареи заменены")

    override fun powerOn() = println("Фонарик включён")
    override fun powerOff() = println("Фонарик выключен")
}

// 8. CoffeeMachine --------------------------------------------------
class MyCoffeeMachine : CoffeeMachine() {
    override val capacity: Int = 2000

    override fun fillWater(amount: Int) = println("Кофемашина наполнена водой: $amount мл")
    override fun getWater(amount: Int) = println("Кофемашина использует воду: $amount мл")

    override val maxTemperature: Int = 100
    override fun setTemperature(temp: Int) = println("Температура нагрева: $temp°C")

    override fun clean() = println("Кофемашина очищена")

    override fun programAction(action: String) = println("Кофемашина запрограммировала действие: $action")
    override fun execute() = println("Кофемашина выполняет программу")

    override fun powerOn() = println("Кофемашина включена")
    override fun powerOff() = println("Кофемашина выключена")
}

// 9. SmartSpeaker ---------------------------------------------------
class MySmartSpeaker : SmartSpeaker() {
    override fun setVolume(volume: Int) = println("Громкость установлена: $volume")
    override fun mute() = println("Колонка выключила звук")
    override fun playSound(stream: InputStream) = println("Колонка проигрывает звук")

    override fun programAction(action: String) = println("Колонка запрограммирована: $action")
    override fun execute() = println("Колонка выполняет программу")

    override fun powerOn() = println("Колонка включена")
    override fun powerOff() = println("Колонка выключена")
}
