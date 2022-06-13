package objecttest;

/**
 * @author nietingting
 * Created on 2022-06-12
 */
public class Object3 {
    public static void main(String[] args) {
        Person  p1 = new Person();
        p1.age =10;
        p1.name = "xiaoming";
        Person p2 = p1;
        System.out.println(p2.age); // 10

    }
}

class Person{
    String name ;
    int age;

}
