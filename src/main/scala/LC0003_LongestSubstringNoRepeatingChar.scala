import scala.collection.mutable

object LC0003_LongestSubstringNoRepeatingChar {
  def lengthOfLongestSubstring(s: String): Int = {
    var start = -1
    var res = 0
    val lastSeen = new mutable.HashMap[Char, Int]
    for (i <- 0 until s.length) {
      var ch = s.charAt(i)
      start = math.max(start, lastSeen.getOrElse(ch, -1))
      res = math.max(res, i - start)
      lastSeen(ch) = i
    }
    res
  }
}
