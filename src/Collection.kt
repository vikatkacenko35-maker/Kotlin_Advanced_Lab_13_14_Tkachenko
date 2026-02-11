//val rockPlanets = arrayOf<String>("Mercury","Venus","Earth","Mars")
//val gasPlanets = arrayOf<String>("Jupiter","Saturn","Uranus","Neptune")
//val solarSystem = rockPlanets + gasPlanets
//val newSolarSystem = arrayOf(
//    "Mercury","Venus","Earth","Mars", "Jupiter","Saturn","Uranus","Neptune"
//)
fun main(){
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))
    //println(solarSystem[2])
    //rintln(solarSystem.get(3))
    //println(solarSystem.indexOf("Pluto"))
    for (planet in solarSystem){
        println(planet)
    }
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"] )
    //solarSystem.add("Pluto")
//    solarSystem.add(3, "Theia")
//    solarSystem[3] = "Future Moon"
//    //solarSystem.removeAt(9)
//    println(solarSystem.contains("Pluto"))
//    println("Future Moon" in solarSystem)
//    solarSystem.remove("Pluto")
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[3])
}