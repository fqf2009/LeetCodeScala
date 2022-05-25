import org.scalatest.funsuite.AnyFunSuite

class LC0003_LongestSubstringNoRepeatingCharTest extends AnyFunSuite {
  test("testLengthOfLongestSubstring1") {
    assertResult(3)(LC0003_LongestSubstringNoRepeatingChar.lengthOfLongestSubstring("abcabcbb"))
  }

  test("testLengthOfLongestSubstring2") {
    assertResult(1)(LC0003_LongestSubstringNoRepeatingChar.lengthOfLongestSubstring("bbbbb"))
  }

  test("testLengthOfLongestSubstring3") {
    assertResult(3)(LC0003_LongestSubstringNoRepeatingChar.lengthOfLongestSubstring("pwwkew"))
  }

  test("testLengthOfLongestSubstring4") {
    assertResult(1)(LC0003_LongestSubstringNoRepeatingChar.lengthOfLongestSubstring(" "))
  }
}
