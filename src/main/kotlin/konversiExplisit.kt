fun main(args: Array<String>) {
    //ASCII value
    var c : Char //character
    var i : Int // ordinal (ASCII) value of the character
    //conversion from the text to ASCII value
    c = 'a'
    i = c.toInt()
    println("the caracter $c converted to its value for $i")

    //conversion from an ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII value  of $i was converted to its textual value of $c")
}