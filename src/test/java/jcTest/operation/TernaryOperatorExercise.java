package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class TernaryOperatorExercise {
    public static void main(String[] args) {
        //三个数取最大
        int n1 = 55;
        int n2 = 53;
        int n3 = 554;

        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("最大数="+max2);

    }
}
