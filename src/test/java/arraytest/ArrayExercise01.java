package arraytest;

/**
 * @author nietingting
 * Created on 2022-05-15
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        /*
        1.char 类型的26个元素数组，方别放'A'-'Z'，使用forxh全部打印
        2.提示：'A'+1='B'
        3.
        4.
         */
        char[] chars = new char[26];
        for (int i=0;i<chars.length;i++){
            // chars是 char[]
            //char[i]是char
            chars[i]=(char) ('A'+i);//'A'+1 是int，需要强制转换

        }
        System.out.println("=======");
        for (int i=0;i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }

    }
}
