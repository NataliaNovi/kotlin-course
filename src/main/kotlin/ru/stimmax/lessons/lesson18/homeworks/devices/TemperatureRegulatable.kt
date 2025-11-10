package ru.stimmax.lessons.lesson18.homeworks.devices

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}