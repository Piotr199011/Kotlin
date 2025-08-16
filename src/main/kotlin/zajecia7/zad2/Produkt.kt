package zajecia7.zad2

open class Produkt(var vat:Int) {
  open fun wyswietlVat(){
        println("Vat wynosi $vat%")
    }
}
class Zywność(vat: Int=5):Produkt(vat){

}
class PaliwoSilnikowe(vat: Int=23):Produkt(vat){
    override  fun wyswietlVat(){
        println("Vat na paliwo silnikowe wynosi $vat%")
    }
}
class Wegiel(vat: Int=23):Produkt(vat){
var limit:Int?=null
    constructor(vat: Int,limit:Int):this(vat)
    {
        this.limit=limit
    }
    override  fun wyswietlVat(){
        println("Vat na wegiel  wynosi $vat%, a limit zakupu $limit ton")
    }

}
fun main(){
    var wegiel=Wegiel(23,30)
    wegiel.wyswietlVat()
    var paliwoSilnikowe=PaliwoSilnikowe(8)
    paliwoSilnikowe.wyswietlVat()
    var zywność=Zywność(0)
    zywność.wyswietlVat()
}