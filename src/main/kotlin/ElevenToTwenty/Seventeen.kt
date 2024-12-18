package ElevenToTwenty

// taught

fun main() {
    // sum of digit of a number
    println(sumOfDigit(123))
}

private fun sumOfDigit(num:Int):Int{
    var number = num
    var sum = 0

    while (number>0){
        val  digit = number%10
        sum += digit
        number /= 10
    }
    return sum
}