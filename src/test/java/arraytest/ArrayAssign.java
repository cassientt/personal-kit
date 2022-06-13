package arraytest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class ArrayAssign {
    public static void main(String[] args) {
        // 基本数据类型赋值；值拷贝
        // n2的变化不会影响n1

        int n1= 80;
        int n2= n1;
        n2= 30;
        System.out.println("n1="+n1);//80
        System.out.println("n2="+n2);//30

        // 数组在默认情况下是引用传递，赋的值是地址，赋值的方式为引用赋值
        int[] arr1={1,2,3};
        int[] arr2=arr1;
        arr2[0]=10;

        System.out.println("打印arr1");
        for (int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }


    }
}
