package ax4hr.hackerrank.fp.recursion

import ax4hr.hackerrank.testUtils.HackerRankTestSuite
import org.scalatest.Matchers._

class TheSumsOfPowersSuite extends HackerRankTestSuite {

  test ("Min seq>Test 0") {
    val res = TheSumsOfPowers.Solution.getMinSeq(11024,3)
    res should equal(14)
  }

  test ("Min seq>Test 2") {
    val res = TheSumsOfPowers.Solution.getMinSeq(11025,3)
    res should equal(14)
  }

  test ("Min seq>Test 3") {
    val res = TheSumsOfPowers.Solution.getMinSeq(11026,3)
    res should equal(15)
  }

  test ("Min seq>29007 5 < 7") {
    val res = TheSumsOfPowers.Solution.getMinSeq(29007,5)
    res should equal(7)
  }

  test ("Min seq>29008 5 = 7") {
    val res = TheSumsOfPowers.Solution.getMinSeq(29008,5)
    res should equal(7)
  }

  test ("Min seq> 29009 5 > 7") {
    val res = TheSumsOfPowers.Solution.getMinSeq(29009,5)
    res should equal(8)
  }

  test ("Min seq>Test 5") {
    val res = TheSumsOfPowers.Solution.getMinSeq(1,2)
    res should equal(1)
  }

  test("Get ways> 100 2") {
    val res = TheSumsOfPowers.Solution.getWays(100,2)
    res.length should equal(3)
  }

  test("Get ways> 10 2") {
    val res = TheSumsOfPowers.Solution.getWays(10,2)
    res.length should equal(1)
  }

  test("Get ways> 100 3") {
    val res = TheSumsOfPowers.Solution.getWays(100,3)
    res.length should equal(1)
  }

  test("Get ways> 800 2") {
    val n = 2
    val X = 800
    val res = TheSumsOfPowers.Solution.getWays(X,n)
    res.length should equal(561)
  }

  test ("Problem>Sample 0") {
    val out = TheSumsOfPowers.Solution.numberOfWays(10, 2)
    out should equal(1)
  }

  test ("Problem>Sample 1") {
    val out = TheSumsOfPowers.Solution.numberOfWays(100, 2)
    out should equal(3)
  }

  test ("Problem>Sample 2") {
    val out = TheSumsOfPowers.Solution.numberOfWays(100, 3)
    out should equal(1)
  }

  test ("Problem>Sample 3") {
    val out = TheSumsOfPowers.Solution.numberOfWays(800, 2)
    out should equal(561)
  }

}
