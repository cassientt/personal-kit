package objecttest.variableparameter;

/**
 * @author nietingting
 * Created on 2022-06-19
 */

/*
在 Java 编程中，主要的变量就是 属性（成员变量）和 局部变量。
我们说的 局部变量 一般是指在成员方法中定义的变量。
作用域的分类
全局变量：也就是 属性，作用域为整个类体
局部变量：除了属性外的其他变量。作用域为定义它的代码块中
局部变量 只能被本类的对应方法中调用
 */
public class varScopeDetail {
    public static void main(String[] args) {
        /*
属性 的生命周期较长。其伴随对象的创建而创建，伴随对象的销毁而销毁。
局部变量 生命周期较短。其伴随代码块的执行而创建，伴随代码块的结束而销毁。
         */
        Person p = new Person();
        p.say(); //  say() name =tom

        T t1 = new T();
        t1.test();  //Jack   第一种跨类服务属性的方式

        t1.test2(p);//Jack   第2种跨类服务属性的方式

    }
}


class  T {
    public void test(){
        //全局变量/属性 可以被本类使用，也可以被其他类（通过对象）使用。
        Person p1 = new Person();
        System.out.println(p1.name);
    }

    public void test2(Person pe){
        System.out.println(pe.name);

    }
}


class Person{
    String name  = "Jack";
//    public  String clor  = "green";   //全局变量/属性 可以加 修饰符
//    String weigth ; //全局变量（属性）可以不赋值直接使用，那个场合有默认值。局部变量必须赋值使用


    public  void say(){
//        String name ;//Variable 'name' might not have been initialized
//        public String name ="tom";Modifier 'public' not allowed here //局部变量 不能加 修饰符
        String name ="tom";

        //在同一作用域中，两个局部变量不能重名
//        String name = "Tom"; //Variable 'name' is already defined in the scope

        //属性 和 局部变量 可以重名，访问时遵循就近原则
        System.out.println("say() name =" +name);  //say() name =tom
    }
}