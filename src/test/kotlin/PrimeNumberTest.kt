import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrimeNumberTest {

    @Test
    fun checkPrimeNumber() {
        assert(PrimeNumber.checkPrimeNumber(0), { false })
        assert(PrimeNumber.checkPrimeNumber(1), { false })
        assert(PrimeNumber.checkPrimeNumber(5), { true })
        assert(PrimeNumber.checkPrimeNumber(9), { false })
        assert(PrimeNumber.checkPrimeNumber(29), { true })
    }
}