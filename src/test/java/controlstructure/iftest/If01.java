package controlstructure.iftest;
import java.util.Scanner;
/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class If01 {
    public static void main(String[] args) {
        //
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        if(age>18){
            System.out.println("你成年了，要对自己的行为负责");
        }
        System.out.println("程序继续");

    }

}
