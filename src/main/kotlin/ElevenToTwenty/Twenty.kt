package ElevenToTwenty

fun main() {
    //Rotate an array to the left 1 position
    println(rotateArray(intArrayOf(1,2,3,4,5,6)))
}
private fun rotateArray(array:IntArray): ArrayList<Int> {
    val newArray= arrayListOf<Int>()
    array.forEach { newArray.add(it) }
    val firstElement = array[0]
    newArray.removeAt(0)
    newArray.add(firstElement)
    return newArray
}