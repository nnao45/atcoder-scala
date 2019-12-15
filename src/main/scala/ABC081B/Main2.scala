package ABC081B

// https://atcoder.jp/contests/abs/tasks/abc081_b

import scala.io.StdIn._

object Main2 extends App {
  def calc(input: List[Long], result: Int): Int = {
    var reInput = List[Long]()
    input.foreach( i =>
      i % 2 match {
        case 0 => {
          val r =  i / 2
          reInput ::= r
        }
        case _ => return result
      }
    )
    val s = result + 1
    calc(reInput, s)
  }
  val arg = readInt
  val inputRaw = readLine
  val input = inputRaw.split(" ").map(_.toLong).toList
  println(calc(input, 0))
}
