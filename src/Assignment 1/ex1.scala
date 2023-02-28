object ex1 {
//  version1
  def e1() = {
//    version1
    val a: Array[String] = Array("Hamna", "Mohiuddin")
    println(a.mkString(", "))

    //  version 2
    val a1: Array[String] = new Array[String](2)
    a1(0) = "Hamna"
    a1(1) = "Mohiuddin"
    println(a1.mkString(", "))

    ////  version 3
    val a2 = new Array[String](2)
    a2.update(0, "Hamna")
    a2.update(1, "Mohiuddin")
    println(a2.mkString(", "))

// version 4
    var a3: Array[String] = Array[String]()
    a3 = a3 :+ "Hamna"
    a3 = a3 :+ "Mohiuddin"
    println(a3.mkString(", "))
  }
  def main(args : Array[String]) = {
    e1()
  }
}
