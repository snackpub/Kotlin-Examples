package snackpub

import java.lang.IllegalArgumentException

// Kotlin 基本数据类型
// Kotlin 基本数值类型：Byte(8bits)、Short(16bits)、Int(32bits)、Long(64bits)、Float(32bits)、Double(64bits)等.
// 不同java的是，字符不属于数值类型，是一个独立的数据类型.
val oneMillion = 1_000_000
val creditCardNumber = 123_456_789_4L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

// 比较两个数字
// Kotlin中，三个等号===比较的是对象的地址，==比较两个值的大小.
fun main() {
    println("--------------compare---------------")
    val a: Int = 1000 // 改成100结果就不对了?原来128之前对象地址一样.
    println("$a === $a = " + (a === a)) // true
    // 经过了装箱，创建了2个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("$boxedA == $anotherBoxedA = " + (boxedA == anotherBoxedA)) // true
    println("$boxedA === $anotherBoxedA = " + (boxedA === anotherBoxedA)) // a=10000=>false,当 a=100时，比较对象的地址为 true?? 原来128之前对象地址一样.
    println("--------------type casted---------------")
    typecast()
    println("--------------bit operate---------------")
    bitOperate()

    println("----------char-----------")
    println(check('8'))

    println("----------boolean-----------")
    println(boolean())
}

fun typecast() {
    val b: Byte = 1 // OK,静态值是静态检测的
    // val i:Int = b // can't compile
    val i: Int = b.toInt() // OK
    println("byte up casting int:$i")
    val i2: Byte = i.toByte() // use toByte()
    println("int dw casting byte:$i2")
    val shortExample: Short = i.toShort()
    println("int dw casting short:$shortExample")
    val longExample: Long = i.toLong()
    println("int up casting Long:$longExample")
    val floatExample: Float = i.toFloat()
    println("int casting float:$floatExample")
    val doubleExample: Double = i.toDouble()
    println("int up casting double:$doubleExample")
    val charExample = i.toChar()
    println("int casting char:$charExample")

    // 根据上下文推断出自动类型转换
    val l = 1L + 3 // Long + Int => Long

}

// 对于Int和Long类型，有一系列操作符可以使用.
fun bitOperate() {
    val ten = 10
    println("$ten shl(1) = " + ten.shl(1)) // java's <<
    println("$ten shr(1) = " + ten.shr(1)) // java's >>
    println("$ten ushr(1) = " + ten.ushr(1)) // java's >>>
    println("$ten and(1) = " + ten.and(1)) // 与
    println("$ten or(1) = " + ten.or(1)) // 或
    println("$ten xor(1) = " + ten.xor(1)) // 异或
    println("$ten inv() = " + ten.inv()) //反向
}

fun check(c: Char):Int {
    // if(c == 1){ // ...} // error,类型不兼容
    val a:Char = 'a'
    val d: Char = '\t'
    val e: Char = '\n'
    val r: Char = '\r'
    val f: Char = '\''
    val g: Char = '\"'
    val h: Char = '\\'
    val i: Char = '\$'
    val j: Char = '\uFF00'

    if(c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显示转换数字
}

fun boolean() {
    val a:Boolean = true
    val b:Boolean = false

    val str1:String? = "dof"
    val str2:String? = "dog"
    println("$str1 === $str2 = " + (str1 === str2))
    println("$str1 == $str2 = " + (str1 == str2))
}