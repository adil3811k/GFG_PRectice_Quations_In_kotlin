package OneToTen

fun main() {
    // Celsius to fahrenheit
    println(CelsiusToFerenheit(2.0f))
}
private fun CelsiusToFerenheit(celsius:Float):Float{
    return (celsius *9/5)+32
}