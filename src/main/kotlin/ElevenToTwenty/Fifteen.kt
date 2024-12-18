package ElevenToTwenty

fun main() {
    // print n number of fabinacci
    println(fabinacci(5))
}
private fun fabinacci(number:Int):Int{
    if (number<=1) return 0
    return fabinacci(number-1)+ fabinacci(number-2)
}