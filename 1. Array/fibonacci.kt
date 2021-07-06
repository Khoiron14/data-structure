fun main() {
    val fibo: Array<Int?> = arrayOfNulls(20)

    fibo[0] = 1
    fibo[1] = 1

    for (i in 2..fibo.size-1) {
        fibo[i] = fibo[i-2]!! + fibo[i-1]!!
    }

    print("${fibo.size} Bilangan fibonacci pertama adalah : \n")
    for (i in 0..fibo.size-1) {
        print("${fibo[i]} ")
    }
}