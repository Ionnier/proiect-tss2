package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GraphCauseEffectTestCases {

    @Test
    public void test1() {
        Assert.assertEquals(
                NumberTester.ERROR_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(1L)
        );
    }

    @Test
    public void test2() {
        Assert.assertEquals(
                NumberTester.ALLOWED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(10002L)
        );
    }

    @Test
    public void test3() {
        Assert.assertEquals(
                NumberTester.DENIED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(10001L)
        );
    }

}