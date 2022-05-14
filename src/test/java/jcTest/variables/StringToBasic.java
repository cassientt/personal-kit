package jcTest.variables;

/**
 * @author nietingting
 * Created on 2022-05-13
 */
public class StringToBasic {
    public static void main(String[] args) {
        // 基本数据类型->string
        int n1 = 100;
        float f1 = 1.1f;
        double d1= 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + "  " + s2 + "   "+ s3 + "  "+ s3 );

        // String 类型转基本数据类型
        // 语法：通过基本类型的包装类调用parseXX方法即可
        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3= Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 =Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(s5);

        System.out.println("==========");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(b);

        // 怎么把字符串转换为char：含义是指把字符串的第一个字符得到
        System.out.println(s5.charAt(0));




    }
}
