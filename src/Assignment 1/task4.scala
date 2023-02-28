import scala.annotation.tailrec
//import scala.util.Random
object task4 {
  @tailrec
  def even_num(a: Array[Int], count: Int = 0): Int = {
    val n = a.length
    if (n == 0) {
      count}
    else if (a(0) % 2 == 0) {
      even_num(a.slice(1,n), count + 1)}
    else even_num(a.slice(1,n), count)
  }
  def even_num_hof(a: Array[Int]) ={
    val even= a.count(x => x%2 == 0)
    even
  }
def main(args : Array[String])={
//  val a = Array(1,2,3,4,5,6)
  val a = Array.fill(100)(util.Random.nextInt(100))
  println(even_num(a))
  println(even_num_hof(a))
}
}
