package abstracttest;

/**
 * @author nietingting
 * Created on 2022-07-24
 */
public class AbstractExcerse01 {
    public static void main(String[] args) {
        Mannger jack = new Mannger("jack",99,5000);
        jack.setBonus(9000);
        jack.work();

        CommonEmployee tom = new CommonEmployee("tom", 888, 20000);
        tom.work();


    }
}
