fun main() {
////    val imie:String?="Ola"
////    if(imie==null){
////print("Jezeni ma jedno ciastko,on/ona ma drugie")
////
////    }else{
////        print("Jezeni ma jedno ciastko, $imie ma drugie")
////    }
//    val tekst: String = """M@t0łek r@z zwiedz@ł z00
//I w0ł@ł c0 chwil@: "0-0!"
//"J@k@ brzydk@ p@pug@!"
//"Żyr@f@ jest z@ dług@!"
//"Sł0ń z@ wys0ki!"
//"A p0 c0 k0mu te f0ki?"
//"Zebr@ m@ f@rb0w@ne żebr@!"
//"Tygrys
//Chętnie by mnie stąd wygryzł!"
//"N@, @ z@jrzyjmy p0d d@szek:
//Żółw - tuś, br@tku, tuś!"
//"A t0? Pt@szek.
//Niezły pt@szek -
//Struś!"
//Wreszcie zbliż@ się d0 wielbłąd@,
//Uw@żnie mu się przygląd@
//I p0wi@d@ wsk@zując n@ nieg0 przez kr@ty:
//"0wszem, niezły. Niczeg0! Szk0d@ tylk0, że g@rb@ty!"""".trimIndent()
//
////    var wierszCharrArray = tekst.toCharArray()
////    for (i in wierszCharrArray.indices) {
////        if (wierszCharrArray[i] == '0') {
////            wierszCharrArray[i] == 'o'
////        }
////        if (wierszCharrArray[i] == '@') {
////            wierszCharrArray[i] == 'a'
////
////        }
////
////    }
////    println(wierszCharrArray)
//
//    tekst.replace('0','o').replace('@','a')
//    println(tekst)

    var informacja:String="Tekst został ocenzurowany."
    var tekstDoCenzury:String="""Kupił dziadek jajko w sklepie
I po brzuchu już się klepie
Naszykował szklankę z cukrem
Kogel mogel sobie utrę
 
Naglę co to, awantura
Dziura w jajku w jajku dziura
A w tej dziurze kurcze blade
Kurcze blade wrzasnął dziadek
 
Kurcze blade kurcze blade
I ze ściany porwał szpadę
Leci kurcze blade z trwogi
Za kurczęciem dziadek srogi
 
Złapał dziadek kurcze blade
Zrobię z ciebie marmoladę
Marmolada lepsza z jabłka
Powiedziała trzeźwo babka
 
Lepiej upiec kurcze blade
W piekarniku na obiadek
Jak wsadzili je do pieca
To dopiero była heca
 
Bo uciekło z pieca dziurką
I zostało tylko piórko
Piórko blade piórko blade
Które zjadł na obiad dziadek""".trimIndent()
    val tekstOcenzurowany=tekstDoCenzury.replace("kurcze","******")
    println("$tekstOcenzurowany\n\n\n$informacja")
}