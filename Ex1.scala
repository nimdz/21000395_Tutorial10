object TemperatureConverter {
  def calculateAverage(temp: List[Double]): Double = {
    val fahrenheitTemp = temp.map(celsius => (celsius * 9/5) + 32)
    val totalFahrenheit = fahrenheitTemp.reduce((temp1, temp2) => temp1 + temp2)
    val averageFahrenheit = totalFahrenheit / temp.length
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    println("Enter temperatures separated by spaces:")
    val input = scala.io.StdIn.readLine()
    val temperatures = input.split(" ").map(_.toDouble).toList

    val averageFahrenheit = calculateAverage(temperatures)
    println(f"Average Fahrenheit temperature: $averageFahrenheit%.2f")
  }
}
