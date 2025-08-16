package zajecia8

interface Alkohol {
    fun pij(iloscMl: Int) {
    }

}

abstract class RodzajAlkoholu(val nazwa: String, val procent: Double) : Alkohol {
    var wypitwMl: Int = 0
    open fun opis() {
        println("Kazdy alkochol sam się niech opisze")
    }

    override fun pij(iloscMl: Int) {
        wypitwMl += iloscMl
        println("Wypiłeś $iloscMl ml alkoholu typu $nazwa co ma $procent %. Łącznie wypiłeś $wypitwMl ml.")
    }
}

class Zubrowka : RodzajAlkoholu("Zubrówka", 40.0) {
    override fun opis() {
        println("To jest wódka Żubrówka")
    }
}

class ZoładkowaGorzka : RodzajAlkoholu("ZoładkowaGorzka", 40.0) {
    override fun opis() {
        println("To jest wódka ZoładkowaGorzka")
    }

}

fun main() {
    var zubrowka = Zubrowka()
    zubrowka.opis()
    zubrowka.pij(500)
    zubrowka.pij(600)


    var zoładkowaGorzka = ZoładkowaGorzka()
    zoładkowaGorzka.opis()
    zoładkowaGorzka.pij(500)

   var alkohol= listOf(zubrowka,zoładkowaGorzka)
    val sumMl=alkohol.sumOf { it.wypitwMl }
    println("Łącznie wypito $sumMl ml")

}