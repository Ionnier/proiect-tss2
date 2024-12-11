package org.example;

import org.junit.Assert;
import org.junit.Test;

public class BoundaryAnalysisTestsCase {

    @Test
    public void test1() {
        Assert.assertEquals(
                NumberTester.ALLOWED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(10000L)
        );
    }

    @Test
    public void test2() {
        Assert.assertEquals(
                NumberTester.DENIED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(999999L)
        );
    }

    @Test
    public void test3() {
        Assert.assertEquals(
                NumberTester.DENIED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(10001L)
        );
    }

    @Test
    public void test4() {
        Assert.assertEquals(
                NumberTester.DENIED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(999998L)
        );
    }

    @Test
    public void test5() {
        Assert.assertEquals(
                NumberTester.ERROR_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(999L)
        );
    }

    @Test
    public void test6() {
        Assert.assertEquals(
                NumberTester.ERROR_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(0L)
        );
    }

    @Test
    public void test7() {
        Assert.assertEquals(
                NumberTester.ERROR_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(1000000L)
        );
    }

    @Test
    public void test8() {
        Assert.assertEquals(
                NumberTester.ERROR_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(1234567L)
        );
    }

    @Test
    public void test9() {
        Assert.assertEquals(
                NumberTester.ALLOWED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(100000L)
        );
    }

    @Test
    public void test10() {
        Assert.assertEquals(
                NumberTester.ALLOWED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(30001L)
        );
    }

    @Test
    public void test11() {
        Assert.assertEquals(
                NumberTester.ALLOWED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(101110L)
        );
    }
}
