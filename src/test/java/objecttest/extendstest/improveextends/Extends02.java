package objecttest.extendstest.improveextends;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-06-23
 */
public class Extends02 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小明2";
        pupil.age=6;
        pupil.score=78;
        pupil.testing();
        pupil.showInfo();

        System.out.println("");
        Graduate graduate = new Graduate();
        graduate.age=23;
        graduate.name="大明2";
        graduate.score=100;
        graduate.testing();
        graduate.showInfo();


    }


}
