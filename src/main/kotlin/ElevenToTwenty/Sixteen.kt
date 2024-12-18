package ElevenToTwenty

// taught

fun main() {
    // Check number is prime
    println(isPrime(12))// false
    println(isPrime(11))// true
    println(isPrime(1))// false
    println(isPrime(13))// true

}
 fun isPrime(num: Int):Boolean {
    if (num <= 1) {
        return false
    } else {
        for (i in 2..<num) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }
}