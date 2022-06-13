package controlstructure.whiletest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class WhileExercise01 {
    public static void main(String[] args) {
        // 1-100之间所有能够被3整除的数

        int i = 1;
        int endnum = 100;
        while (i <= endnum) {
            if (i % 3 == 0) {
                System.out.println("i=" + i);
            }
            i++;
        }
        System.out.println("..................");



        // 40-200之间所有的偶数
        int j = 40;
        while (j <= 200) {
            if (j % 2 == 0) {
                System.out.println("j=" + j);
            }
            j++;
        }




    }
}
