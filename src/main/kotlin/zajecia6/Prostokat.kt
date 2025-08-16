package zajecia6

class Prostokat(var a:Int,var b:Int) {
    fun obliczPole(){
        println(a*b)
    }
}
class Pogoda(var miasto: String,var temperatura:Double){
var wiatr:Int?=null
    constructor(miasto: String, temperatura:Double,wiatr:Int):this(miasto, temperatura){
        this.wiatr=wiatr
        println("$miasto "+ "$temperatura\u00B0C "+"$wiatr km/h")
    }
}
class Czlowiek(){
    var wiek: Int=0
    set(value) {
        if (value >35) field=value-5
    else if (value<18) field=18
        else field=value
    }
}
fun main(){
    var prostokat=Prostokat(5,7)
    prostokat.obliczPole()

    var pogoda=Pogoda("Zamosc",30.0,66)
var czlowiek=Czlowiek()
    czlowiek.wiek=15
    println("wiek: "+czlowiek.wiek)
}