package test

/**
 * Created by Jungle on 2019/2/28 0028.
 * @desc 密封类
 */
sealed class SealedClazz {

    class Add(val value: Int) : SealedClazz()

    class Substract(val value: Int) : SealedClazz()

    class Multiply(val value: Int) : SealedClazz()

    class Divide(val value: Int) : SealedClazz()

}