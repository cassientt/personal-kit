package arraytest;
import java.util.Scanner;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class Array02 {
    /*
    1.创建一个空数组
    2. 循环输入
    3. 循环输出
     */
    public static void main(String[] args) {

        // 方法1：
//        double scores[] =new double[5];
        // 方法2
        double scores[]; // 声明数组，不分配空间，这时score是null
        scores = new double[5];//  new 分配空间
        Scanner myScanner= new  Scanner(System.in);

        for (int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"个元素的值");
            scores[i]=myScanner.nextDouble();

        }

        System.out.println("===========");
        for (int i=0;i<scores.length;i++){
            System.out.println("第"+(i+1)+"个元素的值="+scores[i]);
        }

    }
}
