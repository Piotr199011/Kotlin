fun main() {


    val tab = mutableListOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)
    var ileParzystych = 0
    for (tabl in tab.iterator()) {
        if (tabl % 2 == 0) {
            ileParzystych++
        }
    }
    println(ileParzystych)


    for (i in 100 downTo 1 step 3){
        println(i)
    }
    bubbleSort(tab)
    println("Posortowana lista: $tab")
}
fun bubbleSort(list: MutableList<Int>) {
    val n = list.size
    var swapped: Boolean
    for (i in 0 until n - 1) {
        swapped = false
        for (j in 0 until n - i - 1) {
            if (list[j] > list[j + 1]) {
                // Zamiana elementów
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
                swapped = true
            }
        }
        // Jeśli w wewnętrznej pętli nie nastąpiła żadna zamiana, lista jest posortowana
        if (!swapped) break
    }
}