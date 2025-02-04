package com.intutive.dailypulse


actual class Platform(){
    actual val osName: String
        get() = ""
    actual val osVersion: String
        get() = ""
    actual val deviceName: String
        get() =""
    actual val density: Int
        get() = 0
    actual fun logSystemInfo() {
//        NsLog.log("($osName $osVersion $deviceName $density)")
    }
}
