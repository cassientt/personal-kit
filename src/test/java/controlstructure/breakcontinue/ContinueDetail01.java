package controlstructure.breakcontinue;

/**
 * @author nietingting
 * Created on 2022-05-15
 */


public class ContinueDetail01 {
    public static void main(String[] args) {
        label1:
        for (int j = 0; j < 2; j++) {
            label2:
            for (int i = 0; i < 10; i++) {
                if (i==2){

//                    continue  ; //等价continue label2;
                    continue label1;


                }

                System.out.println("i=" + i );



            }

        }

    }

}