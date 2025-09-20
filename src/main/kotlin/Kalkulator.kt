fun main(args: Array<String>) {
    //Simple Calculator
    println("Welcome to Calculator")
    println("Enter The First Number:")
    val a = readLine()!!.toDouble()
    println("Enter The Second Number:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product : ${product}")
    println("Quotient : ${quotient}")
    println("Thank You For Using Calculator")
}