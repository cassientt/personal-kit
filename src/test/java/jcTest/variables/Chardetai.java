package jcTest.variables;

/**
 * @author nietingting
 * Created on 2022-05-08
 */
public class Chardetai {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = 97; //97表示的字符
        char c4 = '韩';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println((int)c4);
        System.out.println('a' + 10); //107
        char c5 = 'b' + 1;  //99   通过ASCII（字符编码表）表找到b对应的数值
        System.out.println((int)c5); //99
        System.out.println(c5); //c


    }
}
