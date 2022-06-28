package objecttest.extendstest;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-06-23
 */
public class extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小明";
        pupil.age= 7;
        pupil.testing();
        pupil.showInfo();

        System.out.println("_________________");
        Graduate graduate = new Graduate();
        graduate.name="大明";
        graduate.age=22;
        graduate.testing();
        graduate.showInfo();


    }
}
