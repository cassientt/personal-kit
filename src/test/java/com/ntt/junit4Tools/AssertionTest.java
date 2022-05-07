package com.ntt.junit4Tools;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author nietingting
 * Created on 2022-05-07
 */


public class AssertionTest {

    @Test
    public void test() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;
        String obj6 = null;

        int var1 = 1;
        int var2 = 2;

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        Assert.assertEquals(null,obj1, obj2);

        Assert.assertSame(obj3, obj4);
        Assert.assertNotSame(obj2, obj4);

        Assert.assertNotNull(obj1);
        Assert.assertNull(obj5);

        Assert.assertTrue(var1 < var2);
        Assert.assertFalse(var1 > var2);

        Assert.assertArrayEquals(array1, array2);

    }
}
/*
1. 当预期expected：前，与actual实际不一致时，会报断言不成功；
2.点击内部代码可跳转到出问题的地方；
3.Assert.后是根据对象类型（字符串、整型，大小，数组等的比较）
 */