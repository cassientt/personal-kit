package objecttest;

/**
 * @author nietingting
 * Created on 2022-06-12
 */
public class Objest1 {
    public static void main(String[] args) {
        // 单独变量解决->不利于数据的管理（把一只猫的信息拆解了）
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        String cat2name = "小花";
        int cat2Age = 100;
        String cat2Color = "花色";

    /*
    数组 ->数据类型体现不出来
    只能通过下标获取信息，造成名字和内容的对应关系
    效率低
    引入oop，现有的技术不能完美的解决新需求
     */



        String [] cat1 = {"小白","3","白色"};
        String [] cat2 = {"小花","3","花色"};

        // 使用OOP 面向对象解决
        // 实例化一只猫[创建一只猫对象]
        Cat cat3 = new Cat();
        cat3.name= "小黑";
        cat3.age = 233;
        cat3.color= "黑色";
        // 怎么访问对象的属性？
        System.out.println("第3只猫的信息"+ cat3.name + " " +cat3.age +" " + cat3.color) ;




    }


}


// 使用面向对象来解决
// 定义一个猫类Cat->自定义的数据类型
class Cat{
    // 属性
    String name;
    int age;
    String color;


}