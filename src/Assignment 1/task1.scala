import scala.annotation.tailrec

object task1 {

  def prime( a:List[Int], saved: Array[Int] = Array()): Unit  = {
    val n=a.length
//    println(n)
//    val num = a(0)
    if (n == 0){
      map_(0,arr = saved.sorted )
    }
    else if (a(0) > 1 && !(2 until a(0)).exists(x => a(0) % x == 0)) {
      prime(a.slice(1,n), saved :+ a.head)
    }
    else prime(a.slice(1,n), saved)
  }
  @tailrec
  def map_(index : Int, arr : Array[Int], m: Map[Int,Int]= Map()): Map[Int,Int]={
//    println(arr.mkString(", "))
    var m1 = m


    m1 += (index -> arr(index))
//      println(m1)
    if (index+1 < arr.length){
    map_(index+1, arr,m1)}
    else{
      print(m1)
      m1
    }

  }
def main(args : Array[String]): Unit = {
//  val a = List(1,2,3,4,5,6,7)
  val rand = new scala.util.Random
  val a = List.fill(15)(rand.between(50, 500))
  prime(a)
}

//}
}
