package OneToTen

fun main() {
    //  fahrenheit to Celsius
    println(FehrenheitToCelsius(34.0f))
}
private fun FehrenheitToCelsius(frhenheit:Float):Float{
    return (frhenheit-32)*5/9
}