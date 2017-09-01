package hackerrank.algorithms.warmup

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, InputStream, PrintStream}

import org.scalatest.FunSuite

/**
  * Created by sergeya on 1/09/2017.
  */
class SimpleArraySumSuite extends FunSuite {
  test("OK") {
    val inp =
      """
        |5
        |1
        |2
        |3
        |4
        |5
      """.stripMargin

    val is: InputStream = new ByteArrayInputStream(inp.getBytes())
    val outContent = new ByteArrayOutputStream()
    val os: PrintStream = new PrintStream(outContent)

    val systemIn = System.in

    try {
      System.setIn(is)
      Console.withOut(os) {
        SimpleArraySum.main(Array())
      }
      val res = outContent.toString.split("""\r\n|\n|\r|""")
      assert(res(0) == "15")
    }
    finally {
      System.setIn(systemIn)
    }
  }
}
