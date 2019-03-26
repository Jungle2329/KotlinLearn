package test

/**
 * Created by Jungle on 2019/2/25 0025.
 * @desc Kotlin数据类
 *
 * 数据类自动声明 componentN() 函数，所以这里可以用解构声明。
 *
 * 解构函数自动调用componentN() 可以达成 val(a, b, c) = DataClazz("zhangyi", 28)
 * 自己创建component函数
 * operator fun component3(): String {
 *      return "123"
 *  }
 */
data class DataClazz(var name: String, val age: Int) {
    var score: String = "99"

    operator fun component3(): String {
        return "123"
    }

}