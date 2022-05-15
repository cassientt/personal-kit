package controlstructure.whiletest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class DoWhileExercise01 {
    public static void main(String[] args) {
        // 1-200能被5整除不能被3整除的个数
        int i =1;
        do{
            if (i%5==0&&i%3!=0){
                System.out.println("i="+i);

            }
            i++;

        }while (i<=200);

    }
}
