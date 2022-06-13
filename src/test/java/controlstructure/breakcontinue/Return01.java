package controlstructure.breakcontinue;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class Return01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i==3){
                System.out.println("练习"+i);
//                return;
//                break;
                continue;
            }
            System.out.println("Hello world"+i);

        }
        System.out.println("go on....");
    }
}