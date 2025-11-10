package ru.stimmax.lessons.lesson18.homeworks.devices

import java.io.InputStream

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}