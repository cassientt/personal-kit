package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class LogicOperator {
    public static void main(String[] args) {
        //&& 与& 案例演示 两个条件都真才真
        int age = 50;
        if (age > 20 && age < 30) {
            System.out.println("ok100");
        }

        if (age > 20 & age < 30) {
            System.out.println("ok1001");
        }


        // 区别：第一个为false
        int a =4;
        int b =9;
        // && 短路与，如果第一个为false，则第二个条件将不在判断，最终结果为false，效率高；

        if (a<1&&++b<50){
            System.out.println("ok300");

        }
        System.out.println("a= "+a +"b="+b); //a= 4b=9

   // && 逻辑与不管第一个条件是什么，第二个都会执行，效率低

        int c =4;
        int d =9;

        if (c<1&++d<50){
            System.out.println("ok400");

        }
        System.out.println("c= "+c +"d="+d); //c= 4d=10
    }
}
