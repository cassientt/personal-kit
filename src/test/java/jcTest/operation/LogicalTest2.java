package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class LogicalTest2 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 46;
        if ((z++ == 46) && (y = true)) z++;
        if ((x = false) || (++z == 49)) z++;
        System.out.println("z=" + z);
    }
}
