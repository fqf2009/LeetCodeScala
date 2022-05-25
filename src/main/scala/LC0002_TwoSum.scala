import scala.collection.mutable

object LC0002_TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val seen = new mutable.HashMap[Int, Int].empty
    nums.zipWithIndex.foreach { case (v, i) =>
      if (seen contains (target - v)) {
        return Array(seen(target - v), i)
      } else {
        seen(v) = i
      }
    }
    Array[Int]()
  }
}
