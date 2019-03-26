
import extend.getSize
import test.TestClazz
import java.io.File

/**
 * Created by Jungle on 2018/8/8 0008.
 *
 * @desc TODO
 */

fun main(args: Array<String>) {
    var nameList = listOf("zhangyi", "fanyuejie", "houshangyong")
    for (x in nameList.indices) {
//        println("$x -- ${a[x]}")
    }
    val item = listOf(1, 2, 3, 4, 5)
    when {
        1 in item -> println("1")
        2 in item -> println("2")
        6 in item -> println("6")
    }
//    println(describe(33333333L))

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .map { it.plus("a") }
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

    // mapOf创建一个不可变的map
    // hashMapOf创建一个可变的map
    val map = hashMapOf("1" to 1, "2" to 2, "3" to 3)
    map["4"] = 13
    // listOf创建一个不可变的list
    // arrayListOf创建一个可变的list
    val list = arrayListOf(1, 2, 3, 4, 5)
    list[1] = 4

    // 可以用_来分割值，增加可读性
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val f = arrayOfNulls<String>(4)
    // 创建
    val array = Array(5, { a -> a * 2 })
    //无装箱开销直接创建该类型的数组
    val aa = intArrayOf(1, 2, 3, 4, 5)
    val ab = byteArrayOf(1, 2, 3, 4, 5)
//    array.forEach { println(it) }

//    for (a in "helloworld") {
//        println(a)
//    }

    var i = "abc"
    println("$i.length = ${i.length}")
    val dfkd = """
        >fjdhjff//fadofk
        >fdhfjd
        >fd${"$"}2121
        >fd
        >fdfd
    """.trimMargin(">")

    println("------------------------------------------------------")
    val a = ImplClass("zhangyi").also { print(it) }
//    val b = BaseClass("zhangyi", 27)
//    val c = BaseClass("zhangyi", 27, 100)
//    b.print()

    println(mutableListOf("1", "3", "5").add("3"))
    println(listOf("1", "3").lastIndex)

    println(TestClazz.getSize())

}


fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "one"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "not a String"
            else -> "unknow"
        }

//扩展函数，直接可以扩展类中的内容
fun String.spaceToCamelCase() {
    print(1)
}

fun Int.setaaa(a: Int) {
    print(a)
}

//创建单例
object Resource {
    fun getInstance() {

    }
}

//if not null
fun ifNotNull() {
    var files = File("text").listFiles()
    //if not null 缩写
    //if not null print files.size，if null print "null"
    println(files?.size)
    //If not null and else 缩写
    //if not null print files.size，if null print "empty"
    println(files?.size ?: "empty")
    // ?: 代表 if null, ?: 后可以执行语句
    println(files ?: print("3232"))

    val list = listOf<String>()
    //firstOrNull 获取第一个元素，可以为Null 如果是null返回empty
    println(list.firstOrNull() ?: "empty")
    //?.let 如果该元素不为null就执行{代码块}
    list.firstOrNull()?.let {
        println("1")
        println("2")
        println("3")
    }
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}

// if表达式可以直接返回一个值，可以取代三目运算
fun testIf() {
    val a = 4
    val b = 2
    val c = 3
    // 会默认返回最后一个变量
    var max = if (a > b) {
        a
        c
    } else {
        b
    }
    print(max)
}

// when 将它的参数与所有的分支条件顺序比较，直到某个分支满足条件。
// when 既可以被当做表达式使用也可以被当做语句使用。
// 如果它被当做表达式符合条件的分支的值就是整个表达式的值，如果当做语句使用， 则忽略个别分支的值。
// （像 if 一样，每一个分支可以是一个代码块，它的值是块中最后的表达式的值。）
// 如果when作为表达式使用则必须有else分支 除非编译器能够检测出所有的可能情况都已经覆盖了
fun testWhen(x: Any): Boolean = when (x) {
    is String -> x.startsWith("w")
    1 -> true
    else -> false
}


fun testFor() {
    for (x in 9 downTo 0 step 2) {
        println(x)
    }
    // 默认的foreach没有索引，需要使用索引需要使用indices属性
    val name = "zhangyi"
    for (x in name.indices) {
        println(name[x])
    }
    // 或者你可以用库函数 withIndex()：
    for ((k, v) in name.withIndex()) {
        println("index = $k value = $v")
    }
}

fun testLabel() {
    loop@
    for (i in 1..5) {
        for (j in 1..5) {
            if (i == 2 && j == 2) {
                continue@loop
            }
            println("i = $i j = $j")
        }
    }
    println("end")
}

fun testLabel2() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        print(it)
    }

    run lit@ {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@lit
            print(it)
        }
    }

    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return
        print(value)
    })
    println("end")
}

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // 接口成员默认就是“open”的

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    // 编译器要求覆盖 f()：
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}
