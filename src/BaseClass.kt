/**
 * Created by Jungle on 2018/8/16 0016.
 * @desc TODO
 */
open class BaseClass {

    open val fly: Int = 100
    open val x: Int get() = 1

    constructor(name: String) {
        println("super'constructor = $name fly = $fly")
    }

    constructor(name: String, age: Int) {
        println("name = $name age = $age")
    }

    constructor(name: String, age: Int, score: Int) {
        println("name = $name age = $age score = $score")
    }

    init {
        println("super'init")
    }

    open fun end() {
        println("end")
    }


}