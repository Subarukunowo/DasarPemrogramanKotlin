fun main(args: Array<String>) {
    val a : Int = 10000
    println("a apakah identik dengan a atau a=== a : " + (a===a))
    val boxedA: Int? = a
    val anotherBoxedA : Int? =a
    println("boxedA apakah identik dengan anotherboxedA atau boxedA===anotherboxedA : " +(boxedA===anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherboxedA atau boxedA==anotherboxedA : " +(boxedA==anotherBoxedA))
}