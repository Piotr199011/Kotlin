fun main(){
var b=pobierzNastepnaLiczbeParzysta(5)
 //   println(b)

  //  println(czyPrzestepny(2000))
wyswietlLiczby(5,10)
}

fun pobierzNastepnaLiczbeParzysta(a:Int): Int { return if(a%4==0) a+2 else a+1
}
fun czyPrzestepny(a:Int):Boolean{return if (((a%400==0))||((a%4==0)&&(a%100!=0)))
    true else false
}
fun wyswietlLiczby(start:Int=1,koniec:Int){
    for (i in start..koniec)
        print("$i " )
}

