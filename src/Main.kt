//enum class ColourOfCard {
//    BLACK,
//    RED
//}
//
//enum class TypeOfCard {
//    HEARTS,
//    SPADES,
//    DIAMONDS,
//    CLUBS
//}
//
//data class Cards(val typeOfCard: TypeOfCard, val colourOfCard: ColourOfCard)

data class Words(val word: String, var counter: Int)

fun main(args: Array<String>) {


//    val deckOfCards = mutableListOf<Cards>()
//    val playerHand = mutableListOf<Cards>()
//    deckOfCards.add(Cards(TypeOfCard.HEARTS, ColourOfCard.RED))
//    deckOfCards.add(Cards(TypeOfCard.HEARTS, ColourOfCard.BLACK))
//    deckOfCards.add(Cards(TypeOfCard.DIAMONDS, ColourOfCard.RED))
//    deckOfCards.add(Cards(TypeOfCard.DIAMONDS, ColourOfCard.BLACK))
//    deckOfCards.add(Cards(TypeOfCard.SPADES, ColourOfCard.RED))
//    deckOfCards.add(Cards(TypeOfCard.SPADES, ColourOfCard.BLACK))
//    deckOfCards.add(Cards(TypeOfCard.CLUBS, ColourOfCard.RED))
//    deckOfCards.add(Cards(TypeOfCard.CLUBS, ColourOfCard.BLACK))
//    playerHand.add(draw(deckOfCards))
//    deckOfCards.remove(draw(deckOfCards))

//println(dnarna("qGGCtgt","iGGcwf"))

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
    paragraphWordCounting("Am I am and I am not")
}

fun paragraphWordCounting(paragraph: String) {
    val wordList = mutableListOf<Words>()

    paragraph.split(" ").forEach { w ->
        val word = w.toLowerCase()
        var alpha = true
        wordList.forEach {
            if (word == it.word) {
                it.counter++
                alpha = false
            }
        }
        if (alpha){
            wordList.add(Words(word,1))
        }
    }
    wordList?.forEach {
        println("${it.word} : ${it.counter}")
    }
}

fun exercise(sent: String) {

    sent.split(" ").map { it.toLowerCase() }.distinct().forEach {
        var counter = 0
        for (i in sent.split(" ")) {
            if (it.toLowerCase() == i.toLowerCase()) {
                counter++
            }
        }
        println("The word \"$it\" is found $counter times")
    }
}
//fun draw(lista: List<Cards>): Cards {
//    return lista[0]
//}

//fun dnarna (string1 : String, string2: String) : Int{
//    var counter = 0
//    if(string1.length == string2.length) {
//        for (i in 0 until string1.length) {
//            if (string1.toLowerCase()[i] != string2.toLowerCase()[i]) {
//                counter++
//            }
//        }
//    }else {
//        println("Wrong input")
//    }
//    return counter
//    }



