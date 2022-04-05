import java.math.BigDecimal

fun main(args: Array<String>) {
    println("Hello World!")
    var n = 38836
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${Factorial.findFactorial(BigDecimal(51))}")
    println(" Trailing zeo : ${TrailingZero.findTrailingZero(51)}")
    println("jskddddddddddd     ")
    println("$n is plaindrome : ${PlaindromeNumber.chekPlainDromeNumber(n)}")
    n=0
    println(" $n is prime : ${PrimeNumber.checkPrimeNumber(n)}")
    n=5
    println(" $n is prime : ${PrimeNumber.checkPrimeNumber(n)}")
    n=9
    println(" $n is prime : ${PrimeNumber.checkPrimeNumber(n)}")
    n=17
    println(" $n is prime : ${PrimeNumber.checkPrimeNumber(n)}")
    n=10
    println(" $n is prime : ${PrimeNumber.checkPrimeNumber(n)}")
    n=230000000
    println(" $n is prime : ${PrimeNumber.checkPrimeNumber(n)}")
}