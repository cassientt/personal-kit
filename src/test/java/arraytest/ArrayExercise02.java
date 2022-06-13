package arraytest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class ArrayExercise02 {
    public static void main(String[] args) {
        // 求数组中最大的数
        int[] arr= {55,23,56,98,100};
        int max =arr[0];
        int maxIndex =0;
        for(int i= 1;i< arr.length;i++){
            if (max<arr[i]){
                max= arr[i];
                maxIndex=i;

            }
        }
        System.out.println("最大值="+max+"，序号="+maxIndex);
    }
}
