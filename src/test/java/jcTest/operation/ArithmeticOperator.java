package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-13
 */
// 算术运算的使用
public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10/4);//2
        System.out.println(10.0/4);//2.5

        double d = 10/4;
        System.out.println(d); //2.0

        // % 取模
        // %的本质，a %b = a-a/b*b
        System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(10%-3);//1
        System.out.println(-10%-3);//-1

        /*
        ++ 作为表达式使用,--的使用规则也是一样的
        前++：先自增再赋值
        后++；先赋值后自增


         */

        int j = 8;
//        int k = ++j;//等价 j = j + 1；k=j；  k=9  j=9

        int k = j++;//等价k=j, j = j + 1,k=8   j=9;
        System.out.println("k=" + k +"   "+ "j=" + j);


    }
}
