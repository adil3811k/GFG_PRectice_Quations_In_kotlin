package OneToTen

fun main() {
    // Print all multiplication table 1 to 100
    for (i in 1..10){
        for (j in 1..10){
            println("$i X $j = ${i*j}")
        }
    }
}