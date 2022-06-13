package controlstructure.switchtest;
import java.util.Scanner;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class Switch01 {
    public static void main(String[] args) {
        /*
        1，编写程序可以接收字符串，比如：a,b,c,d,e,f,g
        2,a表示星期一，b表示星期二....
        3,根据用户输入显示相应信息，要使用switch语句完成
         */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入一个字符（a-g）：");
        char c1 = myScanner.next().charAt(0);
        // z在Java中，只要有值返回，就是表达式
        switch (c1){
            case 'a':
                System.out.println("今天星期一");
                break;
            case 'b':
                System.out.println("今天星期二");
                break;
            case 'c':
                System.out.println("今天星期三");
                break;
            case 'd':
                System.out.println("今天星期四");
                break;
            case 'e':
                System.out.println("今天星期五");
                break;
            case 'f':
                System.out.println("今天星期六");
                break;
            case 'g':
                System.out.println("今天星期七");
                break;
            default:
                System.out.println("输入错误");
        }
        System.out.println("退出switch，继续执行程序");





    }
}
