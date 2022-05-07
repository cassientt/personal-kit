package com.ntt.junit4Tools.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author nietingting
 * Created on 2022-05-07
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({
        /**
         * 此处类的配置顺序会影响执行顺序
         */
        JunitTest1.class,
        JunitTest2.class
})
public class JunitSuiteTest {
}
