package Assignment2

object ex4 {
  def l11_2() = {
    val uList = List(1, 2, 3, 4, 5)
    val uList_Twice = uList.map(_ * 2)
    println(s"List element doubled = $uList_Twice")

    def f(x: Int) = if (x > 2) x * x else None

    val uList_Squared = uList.map(f(_))
    println(s"List elements squared selectively = $uList_Squared")
  }
  def l11_3()={
    val uList : List[Int] = List(1,2,3,4,5)
    def g(v:Int) = List(v-1 , v , v+1)
    val uList_Extended = uList.map(g(_))
    println(s" Extended list using map - $uList_Extended")
    val uList_Extended_flatmap = uList.flatMap(g(_))
    println(s"Extended list using flatMap - $uList_Extended_flatmap")

  }
  def l11_4()={
    val ulist = List(1, 2, 3, 4, 5)
    def f(x: Int): Option[Int] = if (x > 2) Some(x) else None
    val ulist_selective = ulist.map(f(_))
    println(ulist_selective)
    val ulist_selective_flatmap = ulist.flatMap(f(_))
    println(ulist_selective_flatmap)
  }
  def l11_5() = {
    val umap= Map('a'-> 2, 'b' -> 4,'c' -> 6)
    val umap_mapvalues = umap.view.mapValues(_*2).toMap
    println(umap_mapvalues)
    def h(k:Int, v:Int) = Some(k -> (v*2))
    val umap_map = umap.map{
      case (k,v) => h(k,v)
    }
    println(umap_map)
    val umap_flatmap = umap.flatMap{
      case(k,v) => h(k,v)
    }
    println(umap_flatmap)
  }

  def main(args: Array[String]) = {
    l11_2()
    l11_3()
    l11_4()
    l11_5()
  }


}
