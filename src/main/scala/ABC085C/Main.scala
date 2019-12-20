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
  val input = readLine.split(" ")
  val inputN = input(0).toInt
  val inputY = input(1).toInt

  def calc(): (Int, Int, Int) = {
    for {
      x <- (0 to inputN)
    } yield
      for {
        y <- (0 to (inputN - x))
      } yield if (10000 * x + 5000 * y + 1000 * (inputN - x - y) == inputY) return (x, y, (inputN - x - y))

    (-1, -1, -1)
  }

  val result = calc()
  println(s"${result._1} ${result._2} ${result._3}")
}
