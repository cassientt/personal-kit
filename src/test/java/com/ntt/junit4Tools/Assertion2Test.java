package com.ntt.junit4Tools;

import org.hamcrest.core.CombinableMatcher;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
//asserthat 断言会使用到对应的依赖
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;

/**
 * @author nietingting
 * Created on 2022-05-07
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Assertion2Test {

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        System.out.println("trial".getBytes());
        System.out.println("trial".getBytes());
// [B@368102c8
//[B@6996db8
//        获取的结果不一致，为什么断言列表没有出错？

        assertArrayEquals("failure - byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", "text", "text");
    }

    @Test
    public void testAssertFalse() {
        assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull("should not be null", new Object());
        System.out.println(new Object());
        System.out.println(new Object());
//        java.lang.Object@51521cc1
    }

    @Test
    public void testAssertNotSame() {
        assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(768);
        System.out.println(Integer.valueOf(768));
        System.out.println(Integer.valueOf(768));
//        768
//        768
        assertSame("should be same", aNumber, aNumber);
    }

    // JUnit Matchers assertThat
    @Test
    public void testAssertThatBothContainsString() {
        assertThat("albumen", both(containsString("a")).and(containsString("b")));
    }
    //    断言对应字符串中有包含"a"，"b"

    @Test
    public void testAssertThatHasItems() {
        assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
    }

//    断言对应列表中含有对应的元素

    @Test
    public void testAssertThatEveryItemContainsString() {
        assertThat(Arrays.asList(new String[]{"fun", "ban", "net"}), everyItem(containsString("n")));
    }
    //    断言对应列表中含有对应的元素中包含某个字符串
    // Core Hamcrest Matchers with assertThat
    @Test
    public void testAssertThatHamcrestCoreMatchers() {
        assertThat("good", allOf(equalTo("good"), startsWith("good")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.<Integer>either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));
    }

    @Test
    public void testAssertTrue() {
        assertTrue("failure - should be true", true);
    }
}


