package jcTest.variables;

/**
 * @author nietingting
 * Created on 2022-05-13
 */
public class StringToBasicDetail {
    // 将String类型转换为基本数据类型时，要确保String类型能够转成有效的数据
    // 比如我们可以把"123"转成整数，但不能把"hello"转成一个整数
//    2.如果格式不正确会抛出异常，程序终止
    public static void main(String[] args) {
        String str = "123";
        int n1 = Integer.parseInt(str);
        System.out.println(n1);


        String str2 = "hello";
        int n2 = Integer.parseInt(str2);  //NumberFormatException
        // IDE、编译均不会异常，执行的时候异常
        System.out.println(n2);

    }

}
