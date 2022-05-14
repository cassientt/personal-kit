package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        boolean flag = a > b;
        System.out.println("flag=" + flag);

    }
    /*
    1. 关系运算符的结果都是boolean型；
    2. 关系运算符组成的表达式，我们称为关系表达式。a > b
    3. 运算符"=="不能误写成"="
     */

}
