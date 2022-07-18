package leetcodeEasy

class IsAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        val hashMap = HashMap<Char,Int>()
        var i = 0
       s.forEach {
            if (hashMap.containsKey(it)) hashMap.put(it, hashMap.get(it)!!.plus(1))
            else hashMap.put(it,1)
        }
       t.forEach {
           if(hashMap.isNullOrEmpty()) return false
           if ( hashMap.contains(it))
            {
                hashMap.put(it, hashMap.get(it)!!.minus(1))
            }
            if (hashMap.get(it)==0) hashMap.remove(it)
        }
        if(hashMap.isNullOrEmpty()) return true
        return false
    }

}