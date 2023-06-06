package com.Rasyid.kotlinInfinite.week2.kotlinFunctions
/*
    Created by Rasyid Ramadhani [20104099] - 12/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val color = "yellow"
    val lightOn = turnOnLights(color)
    print(lightOn)
}
fun turnOnLights(color:String): String {
    return "$color light is on"
}
