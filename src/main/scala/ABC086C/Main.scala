package ABC086C

// https://atcoder.jp/contests/abs/tasks/arc089_a

object Main extends App {
  import scala.io.StdIn._

  val inputN = readInt
  val check = List.fill(inputN)({
    val inputStatement = readLine.split(" ").map(_.toInt)
    (inputStatement(0), inputStatement(1), inputStatement(2))
  })
    .forall(tuple => ((tuple._2 + tuple._3) - tuple._1) % 2 == 0 && (tuple._2 + tuple._3) <= tuple._1)
  println(if (check) "Yes" else "No")
}
