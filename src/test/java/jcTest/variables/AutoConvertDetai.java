package jcTest.variables;

/**
 * @author nietingting
 * Created on 2022-05-12
 */
public class AutoConvertDetai {
    public static void main(String[] args) {
        //1. 多种类型的数据混合运算时，系统会先自动将所有的数据转换为容量最大的那种数据类型；
        int n1 = 10;  //ok
//        float d1= n1 + 1.1;  //  结果类型为double：  Incompatible types. Found: 'double', required: 'float'
        double d1= n1 + 1.1; //ok
        float d2= n1 + 1.1f; //ok 结果类型为float
//         d2= n1 + 1.1; //Cannot resolve symbol 'd2'  (无法解析变量，建议先创建，创建要有类型和区域)



//        2. 当把容量最大的数据类型转换为容量小的数据类型时，会报错，反之就会进行自动类型转换；
//        int n2 =1.1; // 错误 double->int    Incompatible types. Found: 'double', required: 'int'

//        3. （byte、short）和char之间不会相互自动转换；
        // 当把具体数值赋给byte时，1先判断是否在取值范围，是就可以
        byte b1 = 10;   //ok -128-127
        int n2 = 1;
//        byte b2 = n2;//如果是变量赋值判断类型。Incompatible types. Found: 'int', required: 'byte'
//        char c1= b1; //不可以

//        4. byte、short、char他们三者可以计算，在进行计算的时候需要首先转换为int类型

        byte b2 = 1;
        short s1 =1;
//        short s2 =b2 +s1; 错误b2 +s1->int，int->short是高转低会丢失
        int s2 =b2 +s1;
//        byte b4= b1+b2;错误bb1+b2->int
//        5. Boolean 不参与运算；
        boolean pass = true;
//        int num12 = pass; Incompatible types. Found: 'boolean', required: 'int'
//        6. 自动提升原则：表达式结果的类型自动提升为操作数中最大的类型；
        byte b5 =1;
        short s3 = 100;
        int num14 = 1;
        double num15 =1.1;
        double num500= b5+s3+num14+num15;
//        float num50= b5+s3+num14+num15; Incompatible types. Found: 'double', required: 'float'



    }
}
