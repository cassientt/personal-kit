package objecttest.constructor;

/**
 * @author nietingting
 * Created on 2022-06-19
 */
public class ConstrunctorDetail01 {
    public static void main(String[] args) {
        Person2 p= new Person2("xiaohong",28);
        Person2 p2= new Person2("xiaomi");


    }
}

class Person2{
    String name;
    int age;

    /*
构造器本质也是方法。所以，可以 构造器重载（Overload：Java 中允许同一类中，多个同名方法的存在，但要求 形参列表 不一致）。

构造器名 和 类名 相同

构造器无返回值
     */
// 第一个构造器
    public Person2(String pname, int page) {
       name = pname;
       age = page;
    }
    // 第二个构造器
    public Person2(String pname) {
        name = pname;

    }
}

