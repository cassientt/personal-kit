package controlstructure.whiletest;

import java.util.Scanner;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class MultiplyFor01 {
    public static void main(String[] args) {
        /*
        1.统计3个办成绩的情况；每个板5人；
        2.求各班的平均分和所有班级的平均分【成绩键盘输入】
        3.统计三个班及格人数，每个班5名同学

        思路分析：
        化繁为简：
        1:一个班
        1）计算一个班，5个同学成绩
        2）用户输入成绩
        3）得到该班平均分
        2：3个班
        1）统计3个班
        2）累积所有人成绩
        3：统计及格人数
        1）定义变量int passnum==0;当学生成绩大于60，passnum++
        可以优化：效率，可读性、结构

         */

        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;
        int passnum = 0;
        int classnum = 2;
        int stunum = 3;
        for (int i = 1; i <= classnum; i++) {// 班级
            double sum = 0;
            for (int j = 1; j <= stunum; j++) { //学生
                System.out.println("请数出第" + i + "个班的" + j + "个学生成绩");
                double score = myScanner.nextDouble();
                // 当学生成绩大于60，passnum++
                if (score >= 60) {
                    passnum++;
                }
                sum += score;
                System.out.println("成绩为" + score);
            }
            System.out.println("sum=" + sum + "平均分=" + (sum / stunum));
            totalScore += sum;
        }
        System.out.println("三个班总分=" + totalScore + "平均分="
                + (totalScore / (stunum * classnum)));
        System.out.println("及格人数=" + passnum);


    }
}
