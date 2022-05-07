package com.ntt.junit4Tools;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @author nietingting
 * Created on 2022-05-07
 */
public class HelloWorldTest {
    @Test
    public  void firstTest() {
        assertEquals(2,1+1);


    }
}

/*
<scope>test</scope>
坑：当在main目录下使用依赖，标注了此使用范围，会解析不到该依赖；
1.继续在main目录下使用，取得scope；
2.把代码路径迁移到test目录下
 */