
fun main(args: Array<String>) {



println(dnarna("qGGCtg0t","iGGcwf"))

//   String var questOne = "cat"
//    var resultOne = ""
//    questOne?.forEach {
//        resultOne = it + resultOne
//    }
//    if (questOne?.toUpperCase() == resultOne.toUpperCase()) {
//        println("$questOne is a palindrome")
//    } else {
//        println("$questOne is not a palindrome")
//    }
//
//    var num = 1001
//    var resultTwo = ""
//
//    num?.toString().forEach {
//        resultTwo = it + resultTwo
//    }
//    if (num?.toString() == resultTwo) {
//        println("$num is a palindrome")
//    } else {
//        println("$num is not a palindrome")
//    }
//
//    for (i in 1..30) {
//        var isPrime = true
//        for (j in 2 until i) {
//            if (i % j == 0) {
//                isPrime = false
//            }
//        }
//        if (isPrime == true) {
//            println("$i is a prime")
//        }
//    }
//    exercise("Am I am and I am not")
}

//fun exercise(sent: String) {
//    sent.split(" ").forEach {
//       var counter = 0
//        for (i in sent.split(" ")) {
//            if (it.toLowerCase() == i.toLowerCase()) {
//                counter++
//            }
//        }
//        println("The word \"$it\" is found $counter times")
//    }
//}

fun dnarna (string1 : String, string2: String) : Int{
    var counter = 0
    if(string1.length == string2.length) {
        for (i in 0 until string1.length) {
            if (string1.toLowerCase()[i] != string2.toLowerCase()[i]) {
                counter++
            }
        }
    }else {
        println("Wrong input")
    }
    return counter
    }



