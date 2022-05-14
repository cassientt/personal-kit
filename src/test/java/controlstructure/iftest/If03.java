package controlstructure;
import java.util.Scanner;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class If03 {
    public static void main(String[] args) {
        /*
        输入cassie的芝麻信用分；
        如果：
        1）信用分100，输出信用极好；
        2）信用分（80，99]时，输出信用优秀；
        3）信用分[60,80]时，输出信用一般；
        4）其它输出：不及格
        5）从键盘输入cassie信用分，并加以判断

         */
        Scanner myScanner = new Scanner(System.in);
        //接收输入
        System.out.println("请输入信用分");
        int grade = myScanner.nextInt();

        // 先对输入的范围1-100验证，否则提示输入错误
        // 如果输入不是整数呢，异常处理

        // 双分支里面有多分支

     if(grade>=1&&grade<=100){
            if (grade==100){
                System.out.println("信用极好");
            }else if(grade>80&&grade<=99){
                System.out.println("信用优秀");
            }else if(grade>=60&&grade<=80){
                System.out.println("信用一般；");
            }else {
                System.out.println("不及格");
            }
        }else {
            System.out.println("信用分在1-100，请重新输入");
        }



    }
}
