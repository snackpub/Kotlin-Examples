package com.snackpub

// 字符串模板


fun main() {
    var name = "dog"
    val s1 = "you are $name?"
    name = "cat"
    val s2 = "${s1.replace("are", "like")}\nNo,I like $name."
    print(s2)

}