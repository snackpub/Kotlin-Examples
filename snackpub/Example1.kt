package com.snackpub

fun test() {}
// 函数定义使用关键字fun,参数格式为：参数:类型
fun sum(a: Int, b: Int): Int { // Int 参数，返回值Int
    return a + b
}

// 表达式作为函数体，返回类型自动推断。
fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int): Int = a + b // public 方法必须明确写出返回类型.

// 无返回值的函数（类似Java中的void):
fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

// 如果返回的类型是 Unit类型，则可以省略（对于public方法也是这样）
public fun printSum2(a: Int, b: Int): Unit {
    print(a + b)
}


fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
}

fun main(args: Array<String>) {
    vars(1, 2, 3, 4, 5) // output: 12345
    // lambda 匿名函数
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2)) // output: 3
}

class Example1 {

}