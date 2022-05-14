package controlstructure;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class IfExercise01 {
    public static void main(String[] args) {
        // 两个double并赋值；
        //判断第一个大于10.0,第二个小于20.0，打印两个数之和
        double d1 = 33.5;
        double d2 = 3.5;
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("两个数和=" + (d1 + d2));
        }


        // 两个int，判断两者的和；
        // 能被3又能被5整除，打印信息；
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("和能被3又能被5整除");
        } else {
            System.out.println("和不能被3又能被5整除");

        }


        // 判断一个年份是否为闰年，符合下面两者之一；
        //闰年：1）年份可以被4整除，但不能被100整除 -> year%4==0&&year%100!=0
        // ；2）能被400整除 -> year%400==0
//        3. 上面1和2是或的关系
        int year =2020;
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year +"是闰年");
        }else{
            System.out.println(year +"不是闰年");
        }


    }
}
