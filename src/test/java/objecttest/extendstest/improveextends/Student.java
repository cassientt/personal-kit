package objecttest.extendstest.improveextends;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-06-23
 */
public class Student {
    public String name;
    public int age;
    public double score;


    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("学生名= "+name+"年龄= "+age+"得分= "+score);
    }


}
