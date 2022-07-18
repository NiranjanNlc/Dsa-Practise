package leetcodeEasy

class IntersectionTwoArray {

    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        var  case1 = nums1.toList().filter {
            nums2.contains(it)
       }
        var case2 = nums2.toList().filter {
            nums1.contains(it)
        }
        if(case1.equals(case2)) return  case1.toIntArray()
        else if (case1.size > case2.size ) return  case2.toIntArray()
        else return case1.toIntArray()
    }

}