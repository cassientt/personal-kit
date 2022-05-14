package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class TernaryOperator {
    public static void main(String[] args) {
    /*
    三元运算符:
    条件表达式？表达式1：表达式2；
    运算规则：
    1）如果条件表达式为true，运算后的结果是表达式1
    1）如果条件表达式为flase，运算后的结果是表达式2
    口径：一真大师

     */
        int a = 100;
        int b = 99;
        int result = a > b ? a++ : b--;
        System.out.println(result);//100
        int result2 = a > b ? ++a : b--;
        System.out.println(result2);

    }
}
