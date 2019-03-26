package test

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

/**
 * Created by Jungle on 2019/3/1 0001.
 * @desc //枚举类中实现接口
 */
enum class EnumTest : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int) = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int) = t * u
    };

    override fun applyAsInt(left: Int, right: Int) = apply(left, right)


}