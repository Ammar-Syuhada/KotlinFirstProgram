fun main(args: Array<String>) {
    // split() and joinToString()
    // Morse code decoder
    // the String which we want to decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")

    // the String with the decoded message
    var message = ""

    // array deginitions
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

    // splitting the string into Morse characters
    val characters = s.split(" ")

    // iterating over mouse characters
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        // character was found
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}