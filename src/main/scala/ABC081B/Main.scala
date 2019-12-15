package ABC081B

// https://atcoder.jp/contests/abs/tasks/abc081_b

import scala.io.StdIn._

object Main extends App {
  def calc(input: Array[Long], result: Int): Int = {
    input.foreach( i =>
      if (i % 2 != 0) return result
    )
    val reInput = input.map(r => r / 2)
    val s = result + 1
    calc(reInput, s)
  }
  val arg = readInt
  val inputRaw = readLine
  val input = inputRaw.split(" ").map(_.toLong)
  println(calc(input, 0))
}
