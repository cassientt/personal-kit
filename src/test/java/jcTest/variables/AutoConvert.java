package jcTest.variables;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-05-12
 */
public class AutoConvert {
    public static void main(String[] args) {
        // 自动类型转换(精度小的可自动转换为大的)
        int num = 'a'; // ok char->int
        double d1= 80;// ok int ->double
        System.out.println(num); //97
        System.out.println(d1); //80.0
    }
}


/*
char->int->long->float->double
byte->short->int->long->float->double




1.Java基本数据类型占用的字节数：
 数值型：6
     整数:4  字节、短整型、整型、长整型（l和L）
               ┌───┐
       byte:    │    1个字节
               └───┘
               ┌───┬───┐
         short │   │   │     2个字节
               └───┴───┘
               ┌───┬───┬───┬───┐
           int │   │   │   │   │           4个字节
               └───┴───┴───┴───┘
               ┌───┬───┬───┬───┬───┬───┬───┬───┐
          long │   │   │   │   │   │   │   │   │                 8个字节
               └───┴───┴───┴───┴───┴───┴───┴───┘


 浮点数：:2
                   ┌───┬───┬───┬───┐
             float │   │   │   │   │
                   └───┴───┴───┴───┘
                   ┌───┬───┬───┬───┬───┬───┬───┬───┐
            double │   │   │   │   │   │   │   │   │：8个字节
                   └───┴───┴───┴───┴───┴───┴───┴───┘

字符型：''
       ┌───┬───┐
  char │   │   │
       └───┴───┘


  布尔型：（boolean）  存true， false



 2. 引用数据类型：
  类（class）,String
  接口（interface）
  数组[]



 */
