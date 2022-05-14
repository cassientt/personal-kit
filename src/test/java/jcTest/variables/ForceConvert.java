package jcTest.variables;

/**
 * @author nietingting
 * Created on 2022-05-13
 */
public class ForceConvert {
    public static void main(String[] args) {
        // 自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。
        // 使用时要加上强制转换符（），但可能造成精度降低或溢出，格外要注意。
        int i = (int) 1.9;
        System.out.println(i);

        int j = 2000;
        byte b1 = (byte)j;// -48
        System.out.println(b1);
    }
}
