package leetcodeEasy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IntersectionTwoArrayTest {

    @Test
    fun intersect() {
        var num1 = intArrayOf(1,2,2,1)
        var num2 = intArrayOf(2)
        var expected = intArrayOf(2)
        var real = IntersectionTwoArray().intersect(num1,num2)
        println(real.contentToString())
        assert(real.contentToString().equals(expected.contentToString()))
    }
}