object ex3 {
  def e3(item: Option[String]) = {
    if (item != None){
    println(item, "is out of stock!")}
    else{
      println("Please try again")
    }
  }
def main (args: Array[String]) = {
  e3(Some("switch"))
  e3(None)
}}
