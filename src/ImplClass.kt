/**
 * Created by Jungle on 2018/8/16 0016.
 * @desc TODO
 */
class ImplClass : BaseClass {

    override var fly = 120

    constructor(name: String) : super(name) {
        fly++
        println("Impl: constructor = $name fly = $fly")
    }

    constructor(name: String, age: Int) : super(name, age) {
        println(name + age)
    }

    constructor(name: String, age: Int, score: Int) : super(name, age, score) {
        println(name + age + score)
    }

    override fun end() {
        super.end()
    }

}