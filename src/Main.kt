fun main(args: Array<String>) {
    var questOne = "cat"
    var resultOne = ""
    questOne?.forEach {
        resultOne = it + resultOne
    }
    if (questOne?.toUpperCase() == resultOne.toUpperCase()) {
        println("$questOne is a palindrome")
    } else {
        println("$questOne is not a palindrome")
    }

    var num = 1001
    var resultTwo = ""

    num?.toString().forEach {
        resultTwo = it + resultTwo
    }
    if (num?.toString() == resultTwo) {
        println("$num is a palindrome")
    } else {
        println("$num is not a palindrome")
    }

    for (i in 1..30) {
        var isPrime = true
        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
            }
        }
        if (isPrime == true) {
            println("$i is a prime")
        }
    }
}

