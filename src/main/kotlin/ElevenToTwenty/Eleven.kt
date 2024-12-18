package ElevenToTwenty

fun main() {
    // Average number to array
    println(Average(intArrayOf(1,2,3,4,5,6,7,8,9,10)))
}

private fun Average(array:IntArray):Int{
    var total = 0
    for (i in array){
        total +=i
    }
    return total/array.size
}