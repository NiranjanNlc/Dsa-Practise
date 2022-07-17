package leetcodeEasy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MergeSortedArrayTest {

    @Test
    fun merge() {
        val real = MergeSortedArray().merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
        assert(real.contentToString().equals(intArrayOf(1,2,2,3,5,6).contentToString()))
    }
}