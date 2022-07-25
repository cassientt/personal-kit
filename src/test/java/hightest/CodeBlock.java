package hightest;

/**
 * @author nietingting
 * Created on 2022-07-23
 */
public class CodeBlock {
    public static void main(String[] args) {
        new BBB();
        /*

        A的普通代码块
        A的构造器被调用
        B的普通代码块
        B 的构造器被调用
         */

    }

}

class AAA{
    {
        System.out.println("A的普通代码块");
    }

    public AAA(){
        // 1. super()
        // 调用本类普通代码块
        System.out.println(("A的构造器被调用"));
    }

}

class BBB extends AAA{
    {
        System.out.println("B的普通代码块");
    }

    public BBB(){
        System.out.println(("B 的构造器被调用"));
    }

}
