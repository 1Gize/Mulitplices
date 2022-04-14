import scala.collection.mutable.ListBuffer

object Multiplicies {

  def calcSumOfMultipices(upperBound: Int)= {
    val multi = new ListBuffer[Int]
    var x = 1
    while (x < upperBound) {
      if (x % 3 == 0 || x % 5 == 0) {
        multi += x
        //println(s"Adding $x to the list")
      } else {
        //println(s"$x is not multiplicies of 3 or 5")
      }
      x += 1
    }
    multi.toList.sum
  }
}
