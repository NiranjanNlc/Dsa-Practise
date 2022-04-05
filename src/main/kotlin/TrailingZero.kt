object TrailingZero
{
    fun findTrailingZero(n : Int): Int {
        var count = 0
        var n1 = n
        while (n1> 0 )
        {
            count = count + n1/5
            n1=n1/5
        }
        return count
    }
}