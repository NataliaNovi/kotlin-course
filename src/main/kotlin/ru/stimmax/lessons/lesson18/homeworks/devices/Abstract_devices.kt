package ru.stimmax.lessons.lesson18.homeworks.devices


// 1. Абстрактные классы устройств

abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable, Cleanable, Programmable
abstract class WashingMachine : Powerable, WaterConnection, Drainable, Programmable, Timable, TemperatureRegulatable, Cleanable
abstract class SmartLamp : Powerable, LightEmitting, Programmable
abstract class DigitalClock : Powerable, Timable
abstract class RobotVacuum : Powerable, Movable, Cleanable, Programmable, Rechargeable
abstract class MechanicalClock : Mechanical
abstract class Flashlight : Powerable, LightEmitting, BatteryOperated
abstract class CoffeeMachine : Powerable, WaterContainer, TemperatureRegulatable, Programmable, Cleanable
abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable
