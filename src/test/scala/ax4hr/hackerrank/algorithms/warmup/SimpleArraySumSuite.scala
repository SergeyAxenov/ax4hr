package ax4hr.hackerrank.algorithms.warmup

import ax4hr.hackerrank.testUtils.HackerRankTestSuite
import org.scalatest._
import Matchers._

class SimpleArraySumSuite extends HackerRankTestSuite {

  test("Problem") {
    val out = SimpleArraySum.Solution.simpleArraySum(5, Array(1, 2, 3, 4, 5))
     out should equal (15)
  }

  test("Sample") {

    val inp =
      """
        |5
        |1
        |2
        |3
        |4
        |5
      """.stripMargin

    val expectedOut =
      """15
        |""".stripMargin

      val out = readConsoleOut {
        withConsoleInput(inp) {
          SimpleArraySum.Solution.main(Array())
        }
      }

      out should equal (expectedOut)
  }
}
