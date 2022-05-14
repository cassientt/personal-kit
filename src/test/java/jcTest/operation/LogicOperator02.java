package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class LogicOperator02 {
    public static void main(String[] args) {


        /*
        1. ||和｜基本规则
        ||：短路或     两个条件只要有一个成立，结果为true，否则为false
        |：逻辑或      只要有一个条件成立，结果为true，否则为false

        2.|| 和|使用区别
        ||：短路或   如果第一个为true，则第二个条件不会判断，最终结果为true，效率高
        |：逻辑或   不管第一个条件是否为true，第二个条件都会判断，效率低；

         */
//        使用
        int age = 50;
        if (age > 20 || age < 30) {
            System.out.println("0k100");

        }
        if (age > 20 | age < 30) {
            System.out.println("0k200");


        }

        // 区别
        int a =4;
        int b =9;

        if (a>1||++b<4){
            System.out.println("ok300");

        }
        System.out.println("a= "+a +"b="+b); //a= 4b=9



        int c =4;
        int d =9;

        if (c>1|++d>4){
            System.out.println("ok400");

        }
        System.out.println("c= "+c +"d="+d); //c= 4d=10


    }
}
