package com.snackpub

fun nullChecks() {
    var age: String? = null // 类型后面加?表示可为空
//    val ages = age!!.toInt() // 字段后加!!，像java一样抛出空指针异常.
//    val ages1 = age?.toInt() // 不做处理返回null
    val ages2 = age?.toInt() ?: -1 // age为空返回-1
    print(ages2)
}

fun parseInt(string: String): Int? {
    return string?.toInt()
}

// NULL检查机制
fun main(args: Array<String>) {
    //nullChecks()
    if (args.size < 2) {
        print("Two integers expected")
        return
    }
    val x = parseInt(args[0])
    val y = parseInt(args[1])
    if (x != null && y != null) {
        print(x * y)
    }
}
