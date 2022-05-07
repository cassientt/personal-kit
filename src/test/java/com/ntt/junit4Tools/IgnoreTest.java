package com.ntt.junit4Tools;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-05-07
 */
public class IgnoreTest {
    @Test
    @Ignore
    public void ignoreTest(){
        System.out.println("IgnoreTest:此条case将会被忽略执行");



    }

}
