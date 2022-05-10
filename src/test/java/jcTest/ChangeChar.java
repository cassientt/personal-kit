package jcTest;
// 转义字符的使用
/**
 * @author nietingting
 * Created on 2022-05-08
 * @version 1.0
 */
    // 上述是文档注释，一遍用于类和方法

public class ChangeChar { // 行尾风格，当然也存在次行尾风格
    public static void main(String[] args) {
//        \t:一个制表位，实现对齐功能
        System.out.println("北京\t天津\t上海\t");
        //        \n:换行
        System.out.println("北京\n天津\n上海\t");

        //        \
        System.out.println("北京\\天津\\\\上海");

        //        "
        System.out.println("老韩说：\"要好好学习java，有前途\"");

        //        '
        System.out.println("老韩说：\'要好好学习java，有前途\'");

        System.out.println("老韩说2：'要好好学习java，有前途'");
        //       \r:回车
        System.out.println("要好好学习java\r\n有前途");


    }

}
