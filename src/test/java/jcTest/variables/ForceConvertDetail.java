package jcTest.variables;

/**
 * @author nietingting
 * Created on 2022-05-13
 */
public class ForceConvertDetail {
    public static void main(String[] args) {
        /*
        1. 当进行数据的大小从 大->小,就需要使用到强制转换；
        2. 强转符号只针对于最近的操作数有效，往往使用小括号提升优先级
        3. char 类型可以保存int 的常量值，但不能保存int的变量值，需要强转；
        4. byte和short 类型在进行运算时，当作int类型处理

         */

//        int x = (int)10*3.5 + 6*1.5; //Incompatible types. Found: 'double', required: 'int'
        int x = (int)(10*3.5 + 6*1.5);
        System.out.println(x);

        char c1 = 100;
        int m = 100;
//        char c2 = m; 错误
        char c3 = (char)m;
        System.out.println(c3); //d



    }
}
