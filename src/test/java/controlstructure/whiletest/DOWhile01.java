package controlstructure.whiletest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class DOWhile01 {
    public static void main(String[] args) {
        int i =1;
        do {
            System.out.println("hello"+i);
            i++;
        }while (i<=10);
        System.out.println("退出"+i);

    }
}
