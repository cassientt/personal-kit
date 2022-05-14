package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class AssignOperator {
    public static void main(String[] args) {
        // 赋值运算符
        int n1 =10;
        n1 +=4; // n1= n1+4
        System.out.println(n1);
        n1/=3;//n1= n1/3;4
        System.out.println(n1);

        /*
        赋值运算的特点：
        1）运算顺序从右到左；
        2）赋值运算的左边只能是变量，右边可以是变量、表达式、常量值
        3）复合赋值运算符等价于下面的效果
        n1 +=4; // n1= n1+4
        4）复合赋值运算符会进行类型转换

         */
        byte b = 3;
        b += 2;// 等价 b= (byte)(b+2)
        System.out.println("b="+b);
    }
}
