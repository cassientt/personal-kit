package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class AirthemeticOperatorExercise02 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println("i=" + i);
        System.out.println("i2=" + i2);
        i = --i2;
        System.out.println("i=" + i);
        System.out.println("i2=" + i2);
        /*
        i=10
        i2=20
        i=19
        i2=19

         */


    }


}
