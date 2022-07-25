package hightest;

/**
 * @author nietingting
 * Created on 2022-07-23
 */
/*
饿汉式
构造器私有化（防止用户直接 new）

类的内部创建对象

向外暴露一个静态的公共方法

 */

public class SingleTest {
    public static void main(String[] args) {

        GirlFrind instance = GirlFrind.getGf();
        System.out.println(instance);
        GirlFrind instanc2 = GirlFrind.getGf();
        System.out.println(instanc2);


    }
}

class GirlFrind {
    private String name;
    // 类的内部创建对象
    private static GirlFrind gf =  new GirlFrind("cassie");

    // 构造器私有化
    private GirlFrind(String name) {
        this.name = name;
    }
    //向外暴露一个静态的公共方法

    public static GirlFrind getGf(){
        return gf;

    }
}