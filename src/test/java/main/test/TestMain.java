package main.test;

/**
 * @author nietingting
 * Created on 2022-07-04
 */
public class TestMain {
    // 静态属性
    private static String name = "cassie";
    private  int anInt = 100;


    // 静态方法
    public static void hi(){
        System.out.println("maintest的hi方法");
    }

    public  void cry(){
        System.out.println("cry方法");
    }

    public static void main(String[] args) {
        // 可以直接访问静态的属性和方法
        System.out.println("name="+name);
        hi();

        // 非静态的不能直接使用，

//        System.out.println("n="+ anInt); //Non-static field 'anInt' cannot be referenced from a static context
//        cry();

        // 非要使用，需要实例化

        TestMain testMain = new TestMain();
        System.out.println(testMain.anInt);
        testMain.cry();



    }

}

