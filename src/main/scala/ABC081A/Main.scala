package ABC081A


// https://atcoder.jp/contests/abs/tasks/abc081_a

/*
* すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。
* 各マスには 0 か 1  が書かれており、マス i には si が書かれています。
* すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
*
* s1, s2, s3 は 0 or 1
*/

import scala.io.StdIn._

object Main extends App {
  val inputRaw = readLine
  var result = 0
  val inputArray = inputRaw.toCharArray.map(char => result += char.toString.toInt)
  println(result)
}
