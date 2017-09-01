package ax4hr.hackerrank.testUtils

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, InputStream, PrintStream}

import org.scalatest.FunSuite

abstract class HackerRankTestSuite extends FunSuite {

  def withConsoleInput(in: String)(code: => Any) = {
    val systemIn = System.in
    try {
      val is: InputStream = new ByteArrayInputStream(in.getBytes())
      System.setIn(is)
      code
    } finally {
      System.setIn(systemIn)
    }
  }

  def readConsoleOut(code: => Any): String = {
    val outContent = new ByteArrayOutputStream()
    val os: PrintStream = new PrintStream(outContent)
    try {
      Console.withOut(os) {
        code
      }
      outContent.toString
    }
    finally {
      os.close()
    }
  }
}
