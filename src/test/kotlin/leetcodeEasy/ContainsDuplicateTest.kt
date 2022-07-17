package leetcodeEasy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ContainsDuplicateTest {

    @Test
    fun containsDuplicate()
    {
        assert(ContainsDuplicate().containsDuplicate(listOf(1,2,3,1).toIntArray()), { false })
    }

}