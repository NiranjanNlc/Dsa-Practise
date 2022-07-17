package leetcodeEasy

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {

        println( nums.toSet())
        return (nums.size != nums.toSet().size)

    }
}