package OneToTen

fun main() {
    // Sum of odd number 10 to 39
    println(Sum())
}
private fun Sum():Int{
    var total = 0
    for (i in 10..30){
        if(i%2!=0){
            total += i
        }
    }
    return total
}