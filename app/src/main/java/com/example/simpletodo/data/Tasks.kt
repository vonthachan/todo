package com.example.simpletodo.data

class Tasks {
    private val taskList = mutableListOf<Task>()

    fun add(task: String){
        taskList.add(Task(task, false))
    }

    fun get(): List<Task> = taskList
}