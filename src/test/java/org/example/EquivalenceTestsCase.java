package org.example;

import org.junit.Assert;
import org.junit.Test;

public class EquivalenceTestsCase {

    @Test
    public void test1() {
        Assert.assertEquals(
                NumberTester.ALLOWED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(19330L)
        );
    }

    @Test
    public void test2() {
        Assert.assertEquals(
                NumberTester.DENIED_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(19331L)
        );
    }

    @Test
    public void test3() {
        Assert.assertEquals(
                NumberTester.ERROR_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(331L)
        );
    }

    @Test
    public void test4(){
        Assert.assertEquals(
                NumberTester.ERROR_MESSAGE,
                NumberTester.testSumOfOddDigitsIsSquareNumber(1000331L)
        );
    }
}
