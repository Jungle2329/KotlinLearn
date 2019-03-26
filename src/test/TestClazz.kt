package test

/**
 * Created by Jungle on 2019/2/20 0020.
 * @desc TODO
 */

class TestClazz private constructor(val name: String) : InterfaceDemo {

    override var a: String = ""

    override fun b() {
        println("b")
    }

    lateinit var data: String

    var value = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    init {
        println("init->$name")
    }

    companion object {
        fun getInstance(): TestClazz {
            return TestClazz("zhangyi")
        }
    }


}
