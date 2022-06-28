package objecttest.extendstest;

/**
 * @author nietingting
 * Created on 2022-06-23
 */
public class Graduate {
    public String name;
    public int age;
    public double score;


    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println("大学生"+name+"正在考数学～");
    }

    public void showInfo(){
        System.out.println("学生名="+name+"年龄="+age+"得分="+score);
    }
}
