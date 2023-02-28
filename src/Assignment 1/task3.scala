object task3 {
  def t3(lst1 : Array[Int], lst2 : Array[Int]) = {
    val n = lst1.length
    val arr: Array[Int] = new Array[Int](n)
    for (i <- 0 until n){
      val value = lst1(i) + lst2(i)
      arr(i) = value
    }
    println(arr.mkString(", "))
  }

  def main(args: Array[String]) = {
    val a = Array(1,2,3,4,5)
    val b = Array(5,6,7,8,9)
    t3(a,b)
  }
}
