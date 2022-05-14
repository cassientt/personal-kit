package jcTest.operation;

/**
 * @author nietingting
 * Created on 2022-05-14
 */
public class LogicalTest {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 5;
//        if (x++ ==6 & ++y==6){
//            x= 11;
//        }
//        System.out.println("x="+x+",y="+y); //x=6,y=6



//        int x = 5;
//        int y = 5;
//        if (x++ ==6 && ++y==6){
//            x= 11;
//        }
//        System.out.println("x="+x+",y="+y); //x=6,y=5


//        int x = 5;
//        int y = 5;
//        if (x++ ==6 | ++y==6){
//            x= 11;
//        }
//        System.out.println("x="+x+",y="+y); //x=11,y=5


        int x = 5;
        int y = 5;
        if (x++ ==6 || ++y==6){
            x= 11;
        }
        System.out.println("x="+x+",y="+y); //x=11,y=6



    }
}
