package controlstructure.fortest;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class ForDetail {
    public static void main(String[] args) {
        int i = 1; // 循环变量初始化
        for (; i <= 8; ) {
            System.out.println("你好" + i);
            i++;
        }
        System.out.println(i);


        // 补充
//        for (;;){// 表示无限循环，死循环  control+c退出
//            System.out.println("ok--");
//        }

    }
}
