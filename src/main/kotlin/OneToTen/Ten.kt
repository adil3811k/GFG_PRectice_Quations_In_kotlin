package OneToTen

fun main() {
    // Sum for number of a array
    println(Sum(intArrayOf(1,1,1,1,1)))
}
private fun Sum(array:IntArray):Int{
    var total = 0
    for (i in array){
        total += i
    }
    return total
}