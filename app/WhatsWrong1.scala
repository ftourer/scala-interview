package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String
  }

  case object Supporter extends Interface {

    override val city = "Paris"
    override val support = s"Ici c'est $city !"

  }

  Supporter.city //What does this print ? It print Paris
  Supporter.support //What does this print and why ? How to fix it ? It print " Ici c'est null !"
  // we must have the declaration of supporter in the interface and its definition in the object Supporter
  // as for the city as i modified in the code


}
