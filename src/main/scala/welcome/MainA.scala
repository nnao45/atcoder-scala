package welcome

import scala.io.StdIn._

object MainA extends App {
  var input1 = readInt
  var input2 = readLine.split(" ")
  var input3 = readLine

  var sum = input1 + input2(0).toInt + input2(1).toInt
  println(s"$sum $input3")
}
