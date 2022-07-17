package leetcodeEasy

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {

        for ( i in m .. m+n-1 )
        {
            nums1[i] = nums2[i-m]
            println(nums1.contentToString())
        }
         nums1.sort()
        return nums1
    }

}