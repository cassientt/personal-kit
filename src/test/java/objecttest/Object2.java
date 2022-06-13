package objecttest;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-06-12
 */
public class Object2 {
    public static void main(String[] args) {
        // 创建车的对象
        // c1 是对象名（对象引用）
        // new Car()创建的对象空间（数据）才是真正的对象
        Car c1= new Car();
        // 对象的属性默认值，遵守数组规则：
        // int（0），short（0），byte（0），long（0L），float（0.0F），double（0.0），char（\u0000），boolean（false），String（null），Object（null）
        System.out.println("\n当前这个车的信息");
        System.out.println("name="+ c1.name + " price = "+ c1.price
        + " color = "+ c1.color + " master="+ c1.master);
        // name=null price = 0.0 color = null master=null


    }
}

class Car{
    String name; // 属性，成员变量，字段：field
    double price;
    String color;
    String[] master; // 属性可以是基本数据类型，也可以是引用类型（对象，数组）
}