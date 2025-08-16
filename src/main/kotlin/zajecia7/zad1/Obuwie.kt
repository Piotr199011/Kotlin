package zajecia7

open class Obuwie (var rozmiar:Int,var cena:Int){
   open fun wyswietlDane(){
        println("$rozmiar $cena")
    }
}
class Klapki(rozmiar:Int,cena: Int):Obuwie(rozmiar, cena){
    var kolor:String?=null
    constructor(rozmiar:Int,cena: Int,kolor:String):this(rozmiar, cena){
        this.kolor=kolor
    }
    override fun wyswietlDane(){
        println("$rozmiar $cena $kolor")
    }
}
class Pantofle(rozmiar:Int,cena: Int):Obuwie(rozmiar, cena)
fun main(){
    var klapki=Klapki(45,30,"Zielony")
    klapki.wyswietlDane()
    var pantofle=Pantofle(30,45)
pantofle.wyswietlDane()
}