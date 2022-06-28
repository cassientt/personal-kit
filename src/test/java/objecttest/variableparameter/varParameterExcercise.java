package objecttest.variableparameter;

/**
 * @author nietingting
 * Created on 2022-06-19
 */
public class varParameterExcercise {
    public static void main(String[] args) {

        HspMethod hm = new HspMethod();
        String re= hm.showScore("xmming",89.0,55,67.3);
        System.out.println(re);

    }
}
/*
求对应某个同学，多门成绩的总和

1. 方法名字showScore，类型string
2. 形参 （string ，可变类型参数）
 */

class HspMethod{
    public String showScore(String name ,double...scores){

        double totaolscore =0;

        for (int i = 0; i< scores.length;i++){ // ArrayIndexOutOfBoundsException
            totaolscore += scores[i];

        }
        return name + "有" +scores.length +"门课的总成绩"+totaolscore;



    }
}
