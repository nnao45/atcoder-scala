package ABC088B

import scala.io.StdIn.readLine

// https://atcoder.jp/contests/abs/tasks/abc088_b

/*
* N 枚のカードがあります. i 枚目のカードには, ai という数が書かれています.Alice と Bob は, これらのカードを使ってゲームを行います.
* ゲームでは, Alice と Bob が交互に 1 枚ずつカードを取っていきます. Alice が先にカードを取ります.
* 2 人がすべてのカードを取ったときゲームは終了し, 取ったカードの数の合計がその人の得点になります.
* 2 人とも自分の得点を最大化するように最適な戦略を取った時, Alice は Bob より何点多く取るか求めてください.
 */

object Main extends App {
  def drawBoth(aliceCounter: Int, bobCounter: Int, inputList: List[Int]): (Int, Int, List[Int]) = {
      val (aliceCard, aliceRemovedList) = if (inputList.nonEmpty) (inputList.head, inputList.tail) else return (aliceCounter, bobCounter, inputList)
      val aliceNextCounter = aliceCounter + aliceCard
      val (bobCard, bobRemovedList) = if (aliceRemovedList.nonEmpty) (aliceRemovedList.head, aliceRemovedList.tail) else return (aliceNextCounter, bobCounter, aliceRemovedList)
      val bobNextCounter =  bobCounter + bobCard
      drawBoth(aliceNextCounter, bobNextCounter , bobRemovedList)
  }

  val inputN = readLine.toInt
  val inputList = readLine.split(" ").map(_.toInt).toList.sorted.reverse
  val result = drawBoth(0, 0, inputList)
  println(result._1 - result._2)
}
