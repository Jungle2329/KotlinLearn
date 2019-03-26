package test;

import java.util.ArrayList;

/**
 * Created by Jungle on 2019/2/28 0028.
 *
 * @desc Java中泛型的研究
 */

public class JavaFanxing {

    class Animal {
        public void jump() {

        }

        public void eat() {

        }


    }

    class Cat extends Animal {
    }

    class Dog extends Animal {

    }

    class OrangeCat extends Cat {
    }

    /**
     * 其实泛型就是在（编译）期间检查并规定了这个类中元素的类型 ，这里关键是编译期间，在运行期间会被擦除
     * 泛型通配符无法真正意义上设置不同的类型，而是规定了这些类型中共有的数据
     * PECS 原则 Producter-Extends Comsumer-Super
     * <? extands T> 规定上边界，只能取用T及T父类的数据
     * <? super E>   规定下边界，只能存入E及E子类的数据，只能取用Object的数据
     * <p>
     * 根据PECS原则
     * ? extends T 表示的是，该类中的元素都是T或者T的子类，这里隐含的一层意思是，都是T的子类，那么他们就都有T的方法，所以可以安全调用
     * 所有T中的方法和字段，但同时带来的问题是不能存入数据，因为泛型本身是编译期间作用的，运行期间会被擦除，在运行的时候编译器无法
     * 真正确保其中类型都是规定的类型，所以便限制了传入，导致规定了上边界后无法存入数据
     * <p>
     * ? super E 表示的是，该类消费你传入的数据，但是这里只能明确知道要消费规定的这个下边界的数据，所以
     * 传入的数据必须包含有这个下边界的所有方法和字段，也就是这个下边界E和下边界E的子类
     * 其实这样就代表了该类中的数据唯一确定的是Object，因为Object是所有类的父类，导致只能取到Object中的数据，其他数据一概无法取出
     * <p>
     * 在学习kotlin的时候也有泛型通配符带来的问题，kotlin中使用in out来解决
     */
    public void test() {
        // PECS 原则 Producter-Extends Comsumer-Super
        ArrayList<? extends Animal> list1 = new ArrayList<>();
//        list.add(new Animal()); error
//        list.add(new Cat()); error
        list1.get(1).eat();
        list1.get(1).jump();

        ArrayList<? super Cat> list2 = new ArrayList<>();
        list2.add(new OrangeCat());
        list2.add(new Cat());
    }


}
