package methodtest;

/**
 * @author nietingting
 * Created on 2022-06-12
 */
public class Method01 {
    // 编写一个main方法
    public static void main(String[] args) {
        // 方法使用
        // 方法写好之后不去使用（调用），不会输出
        // 先创建对象，然后调用即可
        Person p1 = new Person();
        p1.speak();// 对象名.方法名
        p1.ca01();
        p1.ca02(5);
        // 把getSum返回的值，赋值给returnRes
        int returnRes = p1.getSum(5,7);
        System.out.println("getSum返回的值="+returnRes);

    }

}

class Person{
    String name;
    int age;


    // 方法（成员方法）

    public void speak(){
        System.out.println("我是一个好人");
    }

    public void ca01(){
        int res =0;
        for (int i =1; i<=100;i++){
            res +=i;

        }
        System.out.println("cal01计算结果="+res);
    }

// 添加cal02的成员方法添加形参
    public void ca02(int n){
        int res =0;
        for (int i =1; i<=n ;i++){
            res +=i;

        }
        System.out.println("cal02计算结果="+res);
    }

    // 添加getSum的成员方法,计算两个数的和
    // public:表示方法是公开的
    // int:表示方法执行后，返回一个int
    public int getSum(int m1,int m2){
        int res =m1 +m2;
        return res;

    }





}

