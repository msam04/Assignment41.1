package Assignment41_T1

object T1 {
  
  def print_len(str: String) {
    print(str.length())
  }
  

  def main(args: Array[String]) {
    val greek_words: List[String] = List("alpha", "omega", "gamma", "zeta", "beta")
    println(greek_words.count(_.length() == 4))
    val len_words: List[Int] = greek_words.map(_.length())
    println(len_words)
    println(greek_words.count(_.startsWith("a")))
    println(greek_words.count(_.contains("m")))
      
    
  }
  
}