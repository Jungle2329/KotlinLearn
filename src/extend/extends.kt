package extend

import test.TestClazz

/**
 * Created by Jungle on 2019/2/22 0022.
 * @desc TODO
 */

// 扩展函数
fun <T> MutableList<T>.ee(d: Int): T {
    return this[d]
}

// 扩展函数具有名称遮蔽的特性，方法名和参数类型相同的扩展函数，会被原有函数覆盖，即扩展函数失效
fun <T> MutableList<T>.add(element: T): Int {
    throw Exception("Error")
    return 1
}

// 利用扩展函数扩展Any的toString方法
fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}

// 扩展属性
val <T>List<T>.lastIndex: Int
    get() = 1

//扩展伴生对象
fun TestClazz.Companion.getSize(): Int {
    return 1
}