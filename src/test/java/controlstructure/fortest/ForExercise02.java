package controlstructure.fortest;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class ForExercise02 {
    public static void main(String[] args) {
        /*
        完成下述表达式：
        0+5=5
        1+4=5
        2+3=5
        3+2=5
        4+1=5
        5+0=5

        化繁为简

        1,先输出0-5；
        2，分析规律
        先死后活
         */

        int n =10;
        for (int i=0;i<=n;i++){
            System.out.println(i+"+"+(n-i)+"="+n);
        }
    }
}
