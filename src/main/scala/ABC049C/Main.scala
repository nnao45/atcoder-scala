package ABC049C

// https://atcoder.jp/contests/abs/tasks/arc065_a

/*
 * 英小文字からなる文字列 S が与えられます。
 * Tが空文字列である状態から始め、以下の操作を好きな回数繰り返すことで S=T とすることができるか判定してください。
 * T の末尾に dream dreamer erase eraser のいずれかを追加する。
 */

import scala.io.StdIn.readLine

object Main extends App {
  def check(input: String): Boolean = {
    var output = ""
    if (input.endsWith("dream") || input.endsWith("erase")) {
      output = input.slice(0, input.length - 5)
    } else if  (input.endsWith("eraser")) {
      output = input.slice(0, input.length - 6)
    } else if  (input.endsWith("dreamer")){
      output = input.slice(0, input.length - 7)
    } else {
      return false
    }
    if (output.length == 0) true else if (output.length < 5) false else check(output)
  }

  val inputS = readLine
  if (check(inputS)) println("YES") else println("NO")
}
