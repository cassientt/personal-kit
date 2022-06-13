package objecttest;

/**
 * @author nietingting
 * Created on 2022-06-12
 */
public class Object4 {
    public static void main(String[] args) {
        Person2 a = new Person2();
        a.age = 10;
        a.name = "xiaoh";
        Person2 b;
        b = a;
        System.out.println(b.name);
        b.age =200;
        b = null;
        System.out.println(a.age);
        System.out.println(b.age);
        //Exception in thread "main" java.lang.NullPointerException

    }
}
class Person2{
    String name;
    int age;

}