package com.ntt.junit4Tools;

import org.junit.*;

/**
 * @author nietingting <nietingting@kuaishou.com>
 * Created on 2022-05-07
 */
public class StandardTest {


    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class：对应类下所有方法执行之前执行一次");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("in after class：对应类下所有方法执行之后执行一次");
    }

    @Before
    public void before() {
        System.out.println("in before：此类下每个方法执行之前都会执行一遍");
    }

    @After
    public void after() {
        System.out.println("in after：此类下每个方法执行之后都会执行一遍");
    }

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }

}
/*
beforeClass()，afterClass()：对应所有方法使用场景会比较多，切灵活：测试前准备数据，结束之后清理；

before()，after()：每个方法执行前均会准备和清理，特殊的场景或细分场景可能会使用到
 */