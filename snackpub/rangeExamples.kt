package com.snackpub

fun main(args: Array<String>) {
    for (i in 1..4) print(i) // output: 1234
    for(i in 4..1) print(i) // nothing.
//    var i=0;
//    if (i in 1..10){
//        println(i)
//    }

    // step 指定步长
    print("\n")
    for (i in 1..6 step 2) print(i)
    print("\n")
    // 从大到小
    for(i in 6 downTo 1 step 2) print(i)
    print("\n")
    // until 排除结束元素
    for(i in 1 until  10) print(i) // i in [1,10] 排除了10
}