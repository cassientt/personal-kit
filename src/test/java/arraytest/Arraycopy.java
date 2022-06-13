package arraytest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class Arraycopy {
    public static void main(String[] args) {
        // 数据空间独立
        int[] arr1 ={10,20,30};
        //开避新空间,大小和arr1一样
        int arr2[]=new int[arr1.length];
        //遍历arr1，把每个元素拷贝到对应位置
        for (int i =0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        // 输出arr1
        System.out.println(" 输出arr1-----");
        for (int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        // 输出arr2
        System.out.println(" 输出arr2-----");
        for (int i =0;i<arr1.length;i++){
            System.out.println(arr2[i]);
        }


    }
}
