package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class InverseOpeartor {
    public static void main(String[] args) {
        // ！ 取反
        System.out.println(60 > 20);
        System.out.println(!(60 > 20));
        // a^b:逻辑异或，当a和b不同时，则结果为true，否则为flase
        boolean b = (10>1)^(3<5);
        System.out.println("b="+b);

        boolean c = (10>1)^(3>5);
        System.out.println("c="+c);



    }
}
