fun main(args: Array<String>) {
    //split() and joinToString()
    //morse code decoder
    // the string which we want to decade
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message : $s")
    //the string with decoded message
    var message = ""

    //array definitions
    val alphabetChars = "abcdefghijklmnopqrstuvwyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    //splitting the string into Morse character
    val characters = s.split(" ")
// iterating over Morse characters
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
// character was found
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}
