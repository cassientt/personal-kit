package com.ntt.junit4Tools;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author nietingting
 * Created on 2022-05-07
 */


public class TimeoutTest {

    @Test(timeout = 10000)
//    限定该测试case在指定的时间内完成
    public void testCase1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(500);
        System.out.println("in timeout exception");
    }
}
