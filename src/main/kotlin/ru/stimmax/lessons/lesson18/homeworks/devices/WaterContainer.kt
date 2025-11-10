package ru.stimmax.lessons.lesson18.homeworks.devices

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}