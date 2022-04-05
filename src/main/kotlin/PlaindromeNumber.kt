object PlaindromeNumber
{

    fun chekPlainDromeNumber(n :Int): Boolean
    {
        var s = 0
        var n1 = n
        while (n1 >0 )
        {
            s = s*10+n1%10
            n1=n1/10
           println(s)
        }
    if (n==s) return  true
    return false
    }
}