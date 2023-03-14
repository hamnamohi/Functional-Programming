package Assignment2
import scala.math.sqrt
object ex3 {
  def euclidean(lst: List[Int]) = {
    val sum = lst.map(x => x * x).sum
    val e = sqrt(sum)
    e
  }

  def main(args: Array[String]) = {
    val vector = List(3, 4, 5)
    println(euclidean(vector))
  }
}
