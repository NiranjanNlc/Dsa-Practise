import java.math.BigDecimal

object Factorial {


    fun findFactorial (n : BigDecimal): BigDecimal
    {
        return if (n== BigDecimal(1) ) {
            n
        }
        else
        {
            val preceding = n.minus(BigDecimal(1))
            n.times(findFactorial(preceding))
        }
    }
}