package ax4hr.hackerrank.fp.recursion

object TheSumsOfPowers {

  object Solution {

    def getMinSeq(X: Int, N: Int, sum: Int = 1, i: Int = 1): Int =
      if (sum >= X) i else getMinSeq(X, N, sum + math.pow(i+1, N).toInt, i+1)

    def getWays(X: Int, N: Int, seq: List[Int] = Nil, ways: List[List[Int]] = Nil): List[List[Int]] = {
      val maxN = math.pow(X, 1.0/N).toInt
      val minN = getMinSeq(X, N)
      if (minN > maxN) {
        Nil
      } else {

        val newWays = (maxN to minN by -1).toList.filter(!seq.contains(_)).flatMap(i => {
          val rest = (X - math.pow(i, N)).toInt
          if (rest == 0) {
            List ((seq :+ i).sorted)
          } else {
            getWays(rest, N, seq :+ i, ways).filter(p => !p.isEmpty)
          }
        })

        (ways ::: newWays).distinct
      }
    }

    def numberOfWays(X: Int, N: Int): Int = {
      getWays(X, N).length
    }

    def main(args: Array[String]) {
      println(numberOfWays(readInt(), readInt()))
    }
  }
}
