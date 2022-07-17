object Main extends App{
    def FahToCelsius(a:Double):Double= (5.0/9.0)*(a - 32.0)

    def CelToFahrenheit(a:Double):Double = (a * 9.0 / 5.0) + 32.0

    println(FahToCelsius(17));
    println(CelToFahrenheit(-17.77777777777778));
}