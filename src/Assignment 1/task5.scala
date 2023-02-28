object task5 {
  def buildMap[A, B](data: Seq[A], f: A => B): Map[A, B] = {
    def loop(seq: Seq[A], acc: Map[A, B]): Map[A, B] = {
//      var acc1 = acc
//      println(acc)
//      print(seq)
      val n=seq.length
      if (seq.length==0) {acc}
      else {
//     
        val item = f(seq(0))
//
        loop(seq.tail, acc + (seq(0) -> item))
      }
    }

    loop(data, Map[A, B]())
  }


  def main(args: Array[String]) = {
    val lst = Array(1, 2, 3, 4, 5)

    def func(x: Int): Boolean = x % 2 == 0 // entry is even or not
    val result: Map[Int, Boolean] = buildMap(lst, func)
    println(result)
  }

}
