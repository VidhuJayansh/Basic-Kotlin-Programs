fun main() {

    var a = 10
    var b = 20

    println("Before Swapping")
    println("a = $a")
    println("b = $b")

    // Using third variable
    val temp = a
    a = b
    b = temp

    println("After Swapping")
    println("a = $a")
    println("b = $b")

}
