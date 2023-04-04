package com.Rasyid.kotlinInfinite.week1.kotlinFundamental
/*
    Created by Rasyid Ramadhani [20104099] - 03/04/2023
    Telkom Institute of Technology Purwokerto
    SIB#4 Infinite Learning_Morning_Android Mobile Dev
*/
fun main() {
    val company = "Infinite Learning"
//  print("We are studying in " + $company)
    print("We are studying in $company")

    val score = 80
    print("Results: ${ if(score >= 80) "You win!" else "Please try again!" }")
}
