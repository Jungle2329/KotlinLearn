package test

/**
 * Created by Jungle on 2019/2/19 0019.
 * @desc TODO
 */


fun main(args: Array<String>) {
    fun char2Int(char: Char): Int {
        if (char !in '0'..'9')
            throw IllegalArgumentException()
        return char.toInt() - '0'.toInt()
    }


    val f = "\tfdf\t"
    // 原始字符串，中间不支持转义字符\
    // 使用 | 配合trimMargin("?")方法去除前导空格
    val a = """
        ?\f\d\t
        |df $f
        |123
        """.trimMargin("?")

    val d = TestClazz.getInstance()
    d.value = 3
    println(d.a)
    d.b()
    d.c()

    val data = DataClazz("zhangyi", 26)
    data.score = "123"
    val (c1, _, c3) = data
    println("c1->$c1 c3->$c3")

    fun exe(e: SealedClazz) = when (e) {
        is SealedClazz.Add -> println("1")
        is SealedClazz.Substract -> println("1")
        is SealedClazz.Multiply -> println("1")
        is SealedClazz.Divide -> println("1")
    }

    exe(SealedClazz.Add(1))
    println("----------------------------------")

    // 使用enumValues<T>()可以获取枚举成员
    for (et in enumValues<EnumTest>()) {
        println(et.apply(3, 4))
    }
    println(enumValueOf<EnumTest>("PLUS"))

}
