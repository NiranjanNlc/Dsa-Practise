package leetcodeEasy

class RansomeNote {


    fun canConstructRansomeNoteFromMagazine(ransomNote: String, magazine: String): Boolean {
          val hashMap = HashMap<Char,Int>()
          var i = 0
        ransomNote.forEach {
            if (hashMap.containsKey(it)) hashMap.put(it, hashMap.get(it)!!.plus(1))
            else hashMap.put(it,1)
        }
        magazine.forEach {
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