package controlstructure.breakcontinue;
import java.util.Scanner;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class BreakExercise02 {
    // 登录验证，3次机会，如果名字为"pr"，密码"666"，提示登录成功；
    // 否则提示还有几次机会，使用for+break完成
    /*
        String name ="林黛玉";
        System.out.println(name.equals("林黛玉"));//true
        System.out.println("贾宝玉".equals(name));//false【推荐，避免空指针】
     */


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance=3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入名字");
            name = myScanner.next();
            System.out.println("请输入密码");
            passwd = myScanner.next();
            if ("pr".equals(name) && "666".equals(passwd)) {
                System.out.println("登录成功");
                break;
            }
            chance --;
            System.out.println("你还有"+chance+"机会");

        }





    }
}
