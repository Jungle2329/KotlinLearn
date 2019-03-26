package test


/**
 * Created by Jungle on 2019/2/28 0028.
 * @desc 内部类总结
 */
class OuterClazz {
    private val name = "zhangyi"

    // 1.kotlin中的不带有inner关键字的内部类叫嵌套类，用法和java中的静态内部类相同，
    // 外部可以使用OuterClazz.StaticInnerClazz().getName() 调用

    class StaticInnerClazz {
        fun getName(): String {
            return "123"
        }
    }
    // 2.konlin中带有inner关键字的内部类就相当于java中的内部类，默认带有外部类的引用，可以直接调用外部类的数据
    // ps.私有数据也可以哦，但是持有外部类引用就要小心内存泄漏，内部类的生命周期不能长于外部类

    open inner class InnerClazz {
        fun getName(): String {
            return name
        }
    }

    // 多个抽象方法的匿名内部类
    val listener = object : MyListener {

        override fun a() {
        }

        override fun b() {
        }

    }

    // 使用kotlin的匿名内部类
    val listener1 = object : MySingleListener {
        override fun a(e: String) {
        }
    }

    // 对于Java创建的单个抽象方法的类，可以直接使用lambda表达式创建匿名内部类
    val listener2 = MyJavaListener {
        it.toString()
    }

    interface MyListener {
        fun a()
        fun b()
    }

    interface MySingleListener {
        fun a(e: String)
    }
}