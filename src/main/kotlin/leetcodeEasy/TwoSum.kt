package leetcodeEasy

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var x  = mutableListOf<Int>()
        for( i in 0 .. nums.size -1 )
        {
            for( j in i+1 .. nums.size -1 )
            {
                if(nums[i]+nums[j]==target)
                {
                    x.add(i)
                    x.add(j)
                    return x.toIntArray()
                }
            }
        }
        return x.toIntArray()
    }
}