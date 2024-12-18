package ElevenToTwenty

fun main() {
    // Maximum number of array
    println(maxElement(intArrayOf(1,3,4,2,1,56,8,7,5,3,2,24,)))
}

private fun maxElement(intArray: IntArray):Int{
    var maxElement = intArray[0]
    for (i in intArray){
        if (maxElement<i){
            maxElement = i
        }
    }
    return maxElement
}
