package OneToTen

fun main() {
    // Calculate 10! (factorial for 10)
    println("10 factorial is ${factorial(10)}")
}

private fun factorial(number:Int):Int{
    if (number==0 || number==1) return 1
    return number * factorial(number-1)
}