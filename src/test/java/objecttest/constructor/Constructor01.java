package objecttest.constructor;

/**
 * @author nietingting
 * Created on 2022-06-19
 */
public class Constructor01 {
    public static void main(String[] args) {
        Person P = new Person("Tom", 25);
        System.out.println("P 的信息如下；");
        System.out.println("P 对象的name = " + P.name);
        System.out.println("P 对象的年龄=" + P.age);

        Dog D = new Dog();  //如果程序员没有定义构造器，系统会自动给类生成一个无参构造器（默认构造器）
//        'Dog(java.lang.String)' in 'objecttest.constructor.Dog' cannot be applied to '()'
        Dog D2 = new Dog("xx"); // 一旦定义了自己的构造器，就不能用无参构造器了。除非显式的定义一个无参构造器
//

    }
}

/*

构造器是完成对象的初始化，而不是创建

创建对象时，系统自动调用构造器

 */

class Dog {

    public Dog(String name) {

    }

    Dog() {

    }

}


class Person {
    String name;
    int age = 20;

    public Person(String pName, int pAge) {
        System.out.println("构造器被调用～完成对象的初始化");
        name = pName;
        age = pAge;

    }


}

