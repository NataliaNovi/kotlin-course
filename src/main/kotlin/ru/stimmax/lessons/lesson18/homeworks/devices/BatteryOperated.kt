package ru.stimmax.lessons.lesson18.homeworks.devices

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}