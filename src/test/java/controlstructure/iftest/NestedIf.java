package controlstructure.iftest;
import java.util.Scanner;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class NestedIf {
    public static void main(String[] args) {
        /*
        歌唱比赛：
        初赛成绩大于8.0进入决赛，否则淘汰；
        并且根据性别提示进入男子组或女子组

         */


        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩");
        double score = myScanner.nextDouble();
        if(score>8.0){
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if(gender=='男'){
                System.out.println("请进男子组");
            }else if(gender=='女'){
                System.out.println("请进女子组");
            }else {
                System.out.println("性别错误，不能参加比赛");
            }

        }else {
            System.out.println("Sorry,你被淘汰了");
        }






    }
}
