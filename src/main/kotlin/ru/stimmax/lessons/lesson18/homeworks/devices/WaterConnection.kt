package ru.stimmax.lessons.lesson18.homeworks.devices

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}