package leetcodeEasy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IsAnagramTest {

    @Test
    fun isAnagram() {
        assert(IsAnagram().isAnagram("anagram","nagaram"))
        assert(!IsAnagram().isAnagram("car","rat"))
        assert(!IsAnagram().isAnagram("aa","a"))
        assert(!IsAnagram().isAnagram("a","ab"))
    }
}