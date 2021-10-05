package com.snackpub

// is 运算符检测一个表达式是否是某类型的一个实例(类似于java中的instanceof关键字)
fun getStringLength(obj: Any): Int? {
    if (obj is String)
        return obj.length // 做过类型判断，obj会自动转换为String类型
    return null // 这里的obj仍然是Any类型的引用
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String)
        return null
    return obj.length // 这里的obj会自动转换为String
}

fun getStringLength3(obj: Any): Int? {
    if (obj is String && obj.length > 0) // && 运算符的右侧，obj的类型会自动转换为String
        return obj.length
    return null
}
