fun main() {

    val n = 10

    var first = 0
    var second = 1

    println(first)
    println(second)

    for(i in 3..n){

        val next = first + second
        println(next)

        first = second
        second = next

    }

}
