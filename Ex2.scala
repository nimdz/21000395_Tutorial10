object Ex2 extends App {

  def countLetterOccurences(words:List[String]):Int={

    val wordLength=words.map(_.length)
    val totalletterLength=wordLength.reduce((a,b)=>a+b)
    totalletterLength

  }
  val input =List ("apple", "banana", "cherry", "date")
  val length=countLetterOccurences(input)
  println(s"Total Count of letter occurences: $length")


}
