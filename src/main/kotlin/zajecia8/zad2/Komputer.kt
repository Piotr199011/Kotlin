package zajecia8.zad2

data class Komputer(var procesor: Double, var pamiec: Int, var dysk: Int)

fun main() {
    val komputer1 = Komputer(3.2, 8, 256)
    val komputer2 = Komputer(4.0, 16, 512)
    val komputer3 = Komputer(3.2, 8, 256)


    print(komputer1)
    println()
    print(komputer1 == komputer2 || komputer1 == komputer3)
}