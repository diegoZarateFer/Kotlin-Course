fun main() {
    var a: Byte = 127 // Takes 1 byte of memory (-127, 127)
    a++
    a++
    println(a)

    var b: Short = 127 // -32000 ... 32000
    b++
    b++
    println(b)

    val c: Int = 127 // 4 bytes
    println(c)

    val d: Long = 32_000 // 8 bytes
    println(d)
}