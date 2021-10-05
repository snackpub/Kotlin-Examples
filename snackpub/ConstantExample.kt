package com.snackpub

// 可变变量定义：关键字 var; var <标识符> : <类型> = <初始值>

// 不可变变量定义：关键字 val; val <标识符> : <类型> = <初始值>，只能赋值一次的变量(类似于java中的final修饰的变量)
val a: Int = 1
val b = 1; // 系统字段推断为Int类型
val c: Int = 0
// c = 1


var x = 5
// x += 1

fun main(args: Array<String>) {
    x += 1
    print(x)
    // c +=1; // can't compile
}