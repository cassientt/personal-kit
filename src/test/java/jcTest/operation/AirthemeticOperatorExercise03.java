package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class AirthemeticOperatorExercise03 {
    public static void main(String[] args) {
        // 还有59天放假，问："合XX个星期XX天"
        int days = 59;
        int weeks = days / 7;
        int leftDays = days%7;
        System.out.println(days+ "天合："+weeks
                + "星期零"+leftDays+ "天");


        // 华氏温度转换为摄氏温度的公式：5/9*（华氏温度-100），求任何华氏温度对应的摄氏温度
        double huashi = 1234.6;
//        double sheshi = 5/9*(huashi-100);
        double sheshi = 5.0/9*(huashi-100);

        System.out.println("华氏温度"+ huashi+"对应摄氏温度="+sheshi);
    }
}
