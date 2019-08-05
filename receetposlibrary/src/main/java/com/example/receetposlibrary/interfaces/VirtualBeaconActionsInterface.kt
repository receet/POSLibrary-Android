package com.example.receetposlibrary.interfaces

interface VirtualBeaconActionsInterface {
    fun virtualBeaconManagerDidEncounterError(title:String, message:String)
    fun virtualBeaconManagerDidStartAdvertising()
}