package java_test;

/**
 * Created by Jungle on 2019/3/12 0012.
 *
 * @desc TODO
 */

class BaseTest {
    public static void main(String[] args) {
        String a = "123";
        String b = a;
        b = b + "1";
        System.out.println(a == b);
    }
}
