package io;
import java.util.Scanner;


/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class Input {
    public static void main(String[] args) {
        //Scanner类，文本扫描器
        // 创建scanner 类的对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        // 当程序执行到next方法时，会等待用户输入～
        String name = myScanner.next();

        System.out.println("请输入年龄");
        int age = myScanner.nextInt();

        System.out.println("请输入薪水");
        double salary = myScanner.nextDouble();
        System.out.println("人的信息如下");
        System.out.println("名字="+name
        +"，年龄="+age+"，薪水="+salary);

    }
}
