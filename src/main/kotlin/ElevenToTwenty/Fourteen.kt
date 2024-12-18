package ElevenToTwenty

fun main() {
    // find 10 fascinacci numbers without recursion
    println(Fabinacci(10))
}

private fun Fabinacci(number:Int):Int{
    var total = 0
    var answer = 1
    var privius = 0
    for (i in 0..<number){
        val newvarialbe = privius+answer
        privius = answer
        answer = newvarialbe
        total +=answer
        println(newvarialbe)
    }
    return total
}