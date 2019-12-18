package ABC087B

import scala.io.StdIn.readLine

// https://atcoder.jp/contests/abs/tasks/abc087_b

/*
* あなたは、500 円玉を A 枚、100 円玉を B 枚、50 円玉を C 枚持っています。 これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りありますか。
* 同じ種類の硬貨どうしは区別できません。2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
*/

object Max {
  case object A
  case object B
  case object C
}

object Main extends App {
  def createCounterList(input: Int, result: List[Int]): List[Int] =
    if (input >= 0) createCounterList(input - 1, result :+ input) else result

  val inputA = readLine.toInt
  val inputB = readLine.toInt
  val inputC = readLine.toInt
  val inputX = readLine.toInt

  val x = inputX
  val listA = createCounterList(inputA, List())
  val listB = createCounterList(inputB, List())
  val listC = createCounterList(inputC, List())
  var counter = 0

  listA.foreach(inputA => {
    val subA = x - inputA * 500
    if (subA != 0) {
      listB.foreach(inputB => {
        val subB = subA - inputB * 100
        if (subB != 0){
          listC.foreach(inputC => {
            if ((subB - inputC * 50) == 0) counter += 1
          })
        } else {
          counter += 1
        }
      })
  } else {
      counter += 1
  }})

  println(counter)
}
