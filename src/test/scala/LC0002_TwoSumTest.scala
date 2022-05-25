import org.scalatest.BeforeAndAfterEach
import org.scalatest.funsuite.AnyFunSuite

class LC0002_TwoSumTest extends AnyFunSuite with BeforeAndAfterEach {

  // override def beforeEach() {
  // }

  test("testTwoSum1") {
    assert(Array(0, 1) === LC0002_TwoSum.twoSum(Array(2, 7, 11, 15), 9))
  }

  test("testTwoSum2") {
    assert(Array(3, 4) === LC0002_TwoSum.twoSum(Array(2, 7, 11, 15, 23), 38))
  }

  test("testTwoSum3") {
    assert(Array(0, 1) === LC0002_TwoSum.twoSum(Array(3, 3), 6))
  }
}
