package controlstructure.fortest;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class ForExercise {
    /*
    打印1-100之间所有9的倍数，统计个数及总和
     */
    public static void main(String[] args) {
        // 化繁为简：把复杂需求拆解，逐步完成
        // 先死后活：先固定，后灵活

        /*
        化繁为简
        1.输出1-100的值；
        2.在输出的过程中，进行过滤，i%9==0
        3.统计个数；int count =0;count ++;
        4.总和int sum = 0;sum +=i;

        先死后活
        1. 为了适应更好的需求；把范围的开始结束作为变量
        2.还可以更近一步，9的倍数也做为变量
         */

        int count = 0;
        int sum = 0;
        int start = 10;
        int end = 200;
        int t = 9;


        for (int i = start; i <= end; i++) {
            if (i % t == 0) {
                System.out.println("i=" + i);
                count++;
                sum += i;

            }

        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);

    }
}
