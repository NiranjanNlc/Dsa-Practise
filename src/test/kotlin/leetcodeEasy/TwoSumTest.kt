package leetcodeEasy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TwoSumTest {

    @Test
    fun twoSum() {
        var real = TwoSum().twoSum(listOf(2,7,11,15).toIntArray(),9)
        var expected = listOf(0,1).toIntArray()
        println("${real.contentToString()} equals ${expected.contentToString()} ")
        assert(real.contentToString().equals(expected.contentToString()))
    }
}