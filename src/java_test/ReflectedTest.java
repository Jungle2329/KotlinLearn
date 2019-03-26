package java_test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Jungle on 2019/3/1 0001.
 *
 * @desc TODO
 */

class ReflectedTest {

    public static void main(String[] args) {
        Reflected f = new Reflected();
        try {
            // 访问公有字段c
            Field mField = Reflected.class.getField("c");
            System.out.println(mField.get(f));
            // 访问私有字段a
            Field mField2 = Reflected.class.getDeclaredField("a");
            mField2.setAccessible(true);
            mField2.set(f, "zhangyi");
            System.out.println(mField2.get(f));
            // 访问自由方法getA
            Method getA = Reflected.class.getDeclaredMethod("getA");
            getA.setAccessible(true);
            System.out.println(getA.invoke(f));

        } catch (NoSuchFieldException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}


class Reflected {
    private String a = "1";
    private int b = 2;
    public String c = "3";

    private String getA() {
        return "4";
    }

    public String getB() {
        return "5";
    }
}
