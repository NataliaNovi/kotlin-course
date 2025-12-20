package ru.stimmax.lessons.lesson29.homeworks

import java.io.File
//Задание 1
//
//Создай дата класс сотрудника компании Employee, содержащий:
//
//-имя
//-статус трудоустройства (булево)
//-дата рождения (строка)
//-должность CharacterTypes
//-список подчинённых с типом Employee
//enum class CharacterTypes {
//   CTO,
//   UX_UI,
//   CRM, // Customer Relationship Manager
//   FRONTEND_DEV,
//   TEAM_LEAD,
//   BACKEND_DEV,
//   PM,
//   SYSADMIN,
//   QA
//}
data class Employee(
    val name: String,
    val isEmployed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM,
    FRONTEND_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

