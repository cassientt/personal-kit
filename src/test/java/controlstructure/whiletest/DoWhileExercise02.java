package controlstructure.whiletest;
import java.util.Scanner;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class DoWhileExercise02 {
    public static void main(String[] args) {
        // 如果pr不给钱，则tt将一直使用五连鞭，直到pr说好；
       Scanner myScanner = new Scanner(System.in);
       char answer = ' ';
       do {
           System.out.println("使用五连鞭");
           System.out.println("tt问给钱嘛？y/n：");
           answer= myScanner.next().charAt(0);
           System.out.println("pr回答"+answer);


       }while (answer!='y');
        System.out.println("好，不打你了");



    }
}
