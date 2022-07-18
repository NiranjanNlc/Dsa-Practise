package leetcodeEasy

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RansomeNoteTest {

     val obj = RansomeNote()
    @Test
    fun canConstructRansomeNoteFromMagazine() {
        assert(!obj.canConstructRansomeNoteFromMagazine("a","b"))
        assert(!obj.canConstructRansomeNoteFromMagazine("aa","ab"))
        assert(obj.canConstructRansomeNoteFromMagazine("aa","aab"))
    }
}