package leetcodeEasy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstUniqueCharacterTest {

    @Test
    fun firstUniqChar() {
        var real = FirstUniqueCharacter().firstUniqChar("leetcode")
        println(real)
        var expected = 0
        assert(real.equals(expected))

    }
}