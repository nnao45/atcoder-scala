package ABC085B

// https://atcoder.jp/contests/abs/tasks/abc085_b

/*
 *
 * X 段重ねの鏡餅 (X≥1) とは、X 枚の円形の餅を縦に積み重ねたものであって、
 * どの餅もその真下の餅より直径が小さい（一番下の餅を除く）もののことです。
 * 例えば、直径 10、8、6 センチメートルの餅をこの順に下から積み重ねると 3 段重ねの鏡餅になり、
 * 餅を一枚だけ置くと 1 段重ねの鏡餅になります。
 *
 * ダックスフンドのルンルンは N 枚の円形の餅を持っていて、
 * そのうち i 枚目の餅の直径は di センチメートルです。これらの餅のうち一部または全部を使って鏡餅を作るとき、最大で何段重ねの鏡餅を作ることができるでしょうか。
*/

import scala.io.StdIn._

object Main extends App {
  def readAndInsert(counter: Int, limit: Int, inputList: List[Int]): List[Int] =
    if (limit >= counter) readAndInsert(counter + 1, limit, inputList :+ readInt) else inputList

  val inputN = readLine.toInt
  val inputList = readAndInsert(1, inputN, List())
  println(inputList.groupBy(identity).size)
}
