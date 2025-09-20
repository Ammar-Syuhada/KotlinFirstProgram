fun main(args: Array<String>) {
    //Character occurenve in a sentence anaysis
    // the string that we want to analyze
    var s = "A Programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    // Counters initialization
    var vowelCount = 0
    var consonantCount = 0

    // definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxyz"

    // main loop
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }

    println("Vowels: $vowelCount")
    println("Consonant: $consonantCount")
    println("Other character: ${s.length - (vowelCount + consonantCount)}")
}