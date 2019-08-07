enum class ColourOfCard {
    BLACK,
    RED
}

enum class TypeOfCard {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

data class Cards (val typeOfCard: TypeOfCard, val colourOfCard: ColourOfCard)






fun main(args: Array<String>) {


    val deckOfCards = mutableListOf<Cards>()
    val playerHand = mutableListOf<Cards>()

    deckOfCards.add(Cards(TypeOfCard.HEARTS, ColourOfCard.RED))
    deckOfCards.add(Cards(TypeOfCard.HEARTS, ColourOfCard.BLACK))
    deckOfCards.add(Cards(TypeOfCard.DIAMONDS, ColourOfCard.RED))
    deckOfCards.add(Cards(TypeOfCard.DIAMONDS, ColourOfCard.BLACK))
    deckOfCards.add(Cards(TypeOfCard.SPADES, ColourOfCard.RED))
    deckOfCards.add(Cards(TypeOfCard.SPADES, ColourOfCard.BLACK))
    deckOfCards.add(Cards(TypeOfCard.CLUBS, ColourOfCard.RED))
    deckOfCards.add(Cards(TypeOfCard.CLUBS, ColourOfCard.BLACK))



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

println(draw(deckOfCards))
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
fun draw (lista : List<Cards>) : Cards{
    return lista.random()
}

