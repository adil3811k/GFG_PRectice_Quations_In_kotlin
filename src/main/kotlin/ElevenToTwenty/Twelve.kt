package ElevenToTwenty

fun main() {
    // positive number of array in (Solution 1)
    println(positiveNumber(intArrayOf(1,2,-3,9, -1)))
}
private fun positiveNumber(array: IntArray):List<Int>{
    return array.filter { it>0 }
}