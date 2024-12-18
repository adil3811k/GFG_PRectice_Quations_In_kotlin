package ElevenToTwenty

fun main() {
    // First "nPrimes" prime numbers greater than "startAt"
    println(greaterPrimeNumber(5,19))
}

private fun greaterPrimeNumber(nPrime:Int, startedAt:Int):List<Int>{
    val list = mutableListOf<Int>()
    var num = startedAt+1
    while (list.size < nPrime){
        if (isPrime(num)){
            list.add(num)
        }
        num++
    }
    return list
}