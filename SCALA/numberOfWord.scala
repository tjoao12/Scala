object Practice extends App {

  def numberOfWords(words:String){

    var amount=0
    var word= "Joao"
    var wordCounter = words.split(" ")

    for (x<- 0 to wordCounter.length-1) {

      if (wordCounter(x) == word) {
        amount += 1
      }
    }
    print("The amount of " + word + "(s) is " + amount)
  }
  numberOfWords("Joao Joao is Joao")
}
