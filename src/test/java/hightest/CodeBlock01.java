package hightest;

/**
 * @author nietingting
 * Created on 2022-07-23
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        /*
        1.进行类的加载
            先加载父类A2，再加载子类B2
            父类静态属性和静态代码块、
            子类静态属性和静态代码块
        2. 创建对象
            父类 普通代码块 和 普通初始化
            父类 构造器
            子类 普通代码块 和 普通初始化
            子类 构造器

            getValue01
            A2 的第一个静态代码块
            getValue03
            B2 的第一个静态代码块
            A2 的第一个普通代码块
            getValue02
            A2的构造器
            getValue04
            B2 的第一个普通代码块
            B2的无参构造器

         */


//        new B2();
        //
        new C();

    }
}

class A2 {
    private static int n1 = getValue01();

    static {
        System.out.println("A2 的第一个静态代码块");
    }

    {
        System.out.println("A2 的第一个普通代码块");
    }

    public int n3 = getValue02();

    public static int getValue01() {
        System.out.println("getValue01");
        return 10;
    }

    public static int getValue02() {
        System.out.println("getValue02");
        return 10;
    }

    public A2() {
        // super()
        // 普通代码块和属性
        System.out.println("A2的构造器");

    }

}


class B2 extends A2 {
    private static int n3 = getValue03();

    static {
        System.out.println("B2 的第一个静态代码块");
    }

    public int n5 = getValue04();

    {
        System.out.println("B2 的第一个普通代码块");
    }


    public static int getValue03() {
        System.out.println("getValue03");
        return 10;
    }

    public static int getValue04() {
        System.out.println("getValue04");
        return 10;
    }

    public B2() {
        // super()
        // 普通代码块和属性
        System.out.println("B2的无参构造器");


    }

}


class C{
    //静态代码块 只能调用 静态成员。普通代码块 能调用 任意成员。
    private int nn1 = 100;
    private static  int nn2 = 200;

    private void m1(){

    }

    private static void m2(){

    }

    static {
        System.out.println(nn2);
//        静态代码块 只能调用 静态成员
//        System.out.println(nn1);
        m2();
//        m1();

    }

   {
       //普通代码块 能调用 任意成员
        System.out.println(nn2);
        System.out.println(nn1);

        m2();
        m1();

    }






}