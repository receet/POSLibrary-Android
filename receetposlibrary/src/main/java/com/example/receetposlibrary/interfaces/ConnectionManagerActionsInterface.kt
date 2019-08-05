package com.example.receetposlibrary.interfaces

interface ConnectionManagerActionsInterface {
    fun orderDeliveredSuccessfully(orderID:Int,receiptID:Int)
    fun orderNotDelivered()
    fun receiptDelivered()
    fun webSocketDidConnect()
    fun webSocketDidDisconnect()
    fun connectionManagerDidEncounterError(title:String, message:String)
    fun webSocketDidAuthorize()
    fun webSocketAuthorizeFailed()
    fun posDidTimeOut()
    fun webSocketDidTimeOut()
}