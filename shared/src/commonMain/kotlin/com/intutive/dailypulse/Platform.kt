package com.intutive.dailypulse

expect class Platform {
    val osName: String
    val osVersion: String
    val deviceName: String
    val density: Int

    fun logSystemInfo()

}