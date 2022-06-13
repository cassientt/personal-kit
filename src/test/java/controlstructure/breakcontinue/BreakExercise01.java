package controlstructure.breakcontinue;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class BreakExercise01 {
    public static void main(String[] args) {
        // 1-100内的数求和，当和大于20时的当前数
        int sum = 0;
        int n = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("当前和>20，当前i=" + i);
                n = i;
                break;
            }


        }
        System.out.println("当前=" + n);

    }
}
