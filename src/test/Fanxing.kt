package test

/**
 * Created by Jungle on 2019/2/28 0028.
 * @desc TODO
 */
fun main(array: Array<String>) {
    val d = Box(1)
    val f = JavaFanxing()
    f.test()
}

class Box<T>(t: T) {
    val value = t
}