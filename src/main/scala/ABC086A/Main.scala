package ABC086A

// https://atcoder.jp/contests/abs/tasks/abc086_a

import scala.io.StdIn._

object Main extends App {
  def checkEven2Print(input: Int)  = {
    input % 2 match {
      case 0 => println("Even")
      case _ => println("Odd")
    }
  }

  val inputRaw = readLine
  val input = inputRaw.split(" ")

  checkEven2Print(input(0).toInt*input(1).toInt)
}