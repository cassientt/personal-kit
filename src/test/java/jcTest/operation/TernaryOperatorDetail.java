package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        // 表达式1和表达式2要为可以赋给接受不了变量的类型（或可以自动转换）
        int a = 3;
        int b = 3;
        int c = a > b ? 1 : 3;
//        int d = a > b ? 1.1 : 3; //Incompatible types. Found: 'double', required: 'int'
        int d = a > b ? (int)1.1 : 3;
        double m = a > b ? 1.5 : 3;
        System.out.println(c);
        System.out.println(d);
        System.out.println(m);

        // 类似于if..else
    }
}
