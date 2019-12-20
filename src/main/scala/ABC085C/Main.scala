package ABC085C

// https://atcoder.jp/contests/abs/tasks/abc085_c

/* 日本でよく使われる紙幣は、10000 円札、5000 円札、1000 円札です。以下、「お札」とはこれらのみを指します。
 * 青橋くんが言うには、彼が祖父から受け取ったお年玉袋にはお札が N 枚入っていて、合計で Y 円だったそうですが、嘘かもしれません。
 * このような状況がありうるか判定し、ありうる場合はお年玉袋の中身の候補を一つ見つけてください。
 * なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。
 *
 */

import scala.io.StdIn._

object Main extends App {
  def createIntList(input: Int, result: List[Int]): List[Int] =
    if (input >= 0) createIntList(input - 1, result :+ input) else result

  def printResult(a: Int, b: Int, c: Int) = {
    println(s"$a, $b, $c")
    System.exit(0)
  }

  val input = readLine.split(" ")
  val inputN = input(0).toInt
  val inputY = input(1).toInt

  val maxTenK = inputY / 10000
  val maxFiveK = inputY / 5000
  val maxOneK =  inputY / 1000

  val TenKList = createIntList(maxTenK, List())
  val FiveKList = createIntList(maxFiveK, List())
  val OneKList = createIntList(maxOneK, List())

    TenKList.foreach(t => {
      val subTenK = inputY - t * 10000
      if (subTenK == 0 && t == inputN) {
        printResult(t, 0, 0)

      } else {
        FiveKList.foreach(f => {
          val subFiveK = inputY - t * 10000 - f * 5000
          if (subFiveK == 0 && (t + f) == inputN) {
            printResult(t, f, 0)
          } else {
            OneKList.foreach(o => {
              val subOneK = inputY - t * 10000 - f * 5000 - o * 1000
              if (subOneK == 0 && (t + f + o) == inputN) printResult(t, f, o)
            })
          }
        })
      }
    })

  printResult(-1, -1, -1)
}
