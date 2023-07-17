package com.devmasterteam.tasks.service.model

class ValidationModel(message: String = "") {

    private var status: Boolean = true
    private var validadtionMessage: String = ""

    init {
        if (message != "") {
            validadtionMessage = message
            status = false
        }
    }

    fun status() = status
    fun message()= validadtionMessage

}