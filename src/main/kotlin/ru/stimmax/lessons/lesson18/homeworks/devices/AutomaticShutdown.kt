package ru.stimmax.lessons.lesson18.homeworks.devices

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}