package ABC083B

import scala.io.StdIn.readLine

// https://atcoder.jp/contests/abs/tasks/abc083_b

// 1以上N 以下の整数のうち、10 進法での各桁の和がA 以上B 以下であるものの総和を求めてください。

object Main extends App {
  def separateNum(input: String): List[Int] =
    input.toCharArray.map(_.toString.toInt).toList

  def createIntList(input: Int, result: List[Int]): List[Int] =
    if (input > 0) createIntList(input - 1, result :+ input) else result

  val inputRaw = readLine
  val input = inputRaw.split(" ")
  val inputN = input(0)
  val inputNList = createIntList(inputN.toInt, List())
  val inputA = input(1).toInt
  val inputB = input(2).toInt
  var counter = 0

  inputNList.foreach(n => {
    val sum = separateNum(n.toString).sum
    if (sum >= inputA && sum <= inputB) counter += n
  })

  println(counter)
}
