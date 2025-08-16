fun main() {
//    var liczba: Int = 100
//    liczba = -5
//    println(liczba)
//
//    var a:Double?=12.54
//    var b:Double?=33.77
//
//    var temp:Double?
//    temp=a
//    a=b
//    b=temp
//    println("a="+a?.toInt()+ "b="+b?.toInt())
//    val x = false
//    val y = true
//    val z = false
//    val wynik = !(x and y) or z
//    println(wynik)

    val a: Int = 10
    val b: Int=6
    var c: Int=4


//    if (a>b&&a>c){
//        println("Liczba a jest najwieksza a=" + a)
//    }else if (b>a&&b>c){
//        println("Liczba b jest najwieksza b= " +b)
//    }else "Liczba c jest najwieksza c= "+c


    val wynik:Int =10
  //  println((a+b==wynik)||(a+c==wynik)||(b+c==wynik))

   var miesiac= when(c){
        1->"styczen"
        2-> "luty"
        3-> "marzec"
        4-> "kwiecień"
        5-> "maj"
        6-> "czerwiec"
        7-> "lipiec"
        8-> "sierpień"
        9-> "wrzesień"
        10-> "pazdziernik"
        11-> "listopad"
        12-> "grudzien"
       else -> {"Nie ma takiego bumeru"}
   }
    var poraRoku=when(c){
        in 3..5-> "wiosna"
        in 6 ..8-> "lato"
        in 9..11-> "jesien"
        1,2,12-> "zima"
        else -> {"Nie ma takiego bumeru"}
    }
println(miesiac+" to "+poraRoku)
}