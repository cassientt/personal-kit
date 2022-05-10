package jcTest.variables;

/**
 * @author nietingting
 * Created on 2022-05-08
 */
public class FloatDetail {
    public static void main(String[] args) {
//        float num1 = 1.1;  /默认为double 类型，声明float型常量，需要加f或F
        float num2 = 1.1f;


        double num3 = 1.1;
        double num4 = 1.1f;
        System.out.println(num2);  // 1.1
        System.out.println(num3);  // 1.1
        System.out.println(num4); //1.100000023841858

// 十进制形式：必须要有小数点
        double num5 = .1234;
        System.out.println(num5);  //0.1234

        // 科学计数法
        System.out.println(5.12e2);  // 512.0
        System.out.println(5.12E-2); // 0.0512

//8. 通常情况下，☝️使用double类型，会比float更加精确；
        double num9 = 2.1234567854;
        float num10 = 2.1234567854f;
        System.out.println(num9);  //  2.1234567854
        System.out.println(num10);  // 2.1234567

        //使用陷阱：当我们对结果是小数的进行比较要十分小心；
        // 应该以两个数的差值的绝对值，在某精度服务内判断
        double num11 = 2.7;
        double num12 = 8.1 / 3;
        System.out.println(num11);  //2.7
        System.out.println(num12);  //2.6999999999999997
        if(num11 == num12){
            System.out.println("两个数相等");
        }

        if(Math.abs(num11-num12) < 0.01){
            System.out.println("差值非常小，到我的规定精度，可认为相等");
        }
        System.out.println(Math.abs(num11-num12));  //4.440892098500626E-16




    }
}
