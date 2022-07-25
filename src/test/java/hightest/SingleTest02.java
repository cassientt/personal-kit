package hightest;

/**
 * @author nietingting
 * Created on 2022-07-23
 */

/*
构造器私有化

定义一个静态属性对象

提供一个静态的公共方法，可以返回对象。如果静态对象为空，则创建对象


 */
public class SingleTest02 {
    public static void main(String[] args) {
        System.out.println(GF.n1);

        GF instance = GF.getInstance();
        System.out.println(instance);


    }

}

class GF {
    private String name;
    public static int n1 =100;
    private static GF gf;

    private GF(String name) {
        System.out.println("构造器调用");
        this.name = name;
    }

    public static GF getInstance(){
        if(gf == null){
            gf = new GF("cassie");
        }
        return gf;
    }
}

