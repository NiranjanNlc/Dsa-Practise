object PrimeNumber {

    fun checkPrimeNumber(n : Int ): Boolean {
        if(n<2) return false
        if(n==2) return true
        for (i in 2 .. n -1 )
        {
            if(n%i ==0 ) return false
        }
        return true
    }
    fun countNumberOfPrime(n : Int)
    {
        var c1 = Math.pow(n.toDouble(), 0.5)
        println(c1)
        for( i in 0 ..c1.toInt())
        {
            
        }
    }
}