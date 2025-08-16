package zajecia8.zad3

object Matematyka {
    fun dodawanie(pierwsza:Double, druga:Double): Double=pierwsza+druga

    fun odejmowanie(pierwsza:Double, druga:Double): Double=pierwsza-druga

    fun dzielenie(pierwsza:Double, druga:Double): Double {
        if(druga==0.0){
            println("Nie wolno dzielić przez 0")
            return Double.MIN_VALUE
        }
        return pierwsza/druga
    }
    fun mnozenie(pierwsza:Double, druga:Double): Double=pierwsza*druga
}


fun main() {
var matematyka:Double=Matematyka.dzielenie(6.0,5.0)
    println(matematyka)
    var matematyka1:Double=Matematyka.dodawanie(6.0,5.0)
    println(matematyka1)
    var matematyka2:Double=Matematyka.odejmowanie(6.0,5.0)
    println(matematyka2)
    var matematyka3:Double=Matematyka.mnozenie(6.0,5.0)
    println(matematyka3)
}