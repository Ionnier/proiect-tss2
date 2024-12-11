package org.example;

public class NumberTester {
    final public static String ERROR_MESSAGE = "Numarul nu este valid";
    final public static String ALLOWED_MESSAGE = "Da";
    final public static String DENIED_MESSAGE = "Nu";

    public static String testSumOfOddDigitsIsSquareNumber(Long numberUnderTest) {
        if (numberUnderTest == null) {
            return ERROR_MESSAGE;
        }

        if (numberUnderTest < 10000L || numberUnderTest > 999999L) {
            return ERROR_MESSAGE;
        }

        long sumOfOddDigits = 0;
        Long numberUnderTestCopy = numberUnderTest;

        do {
            int digit = (int) (numberUnderTestCopy % 10);
            if (digit % 2 == 1) {
                sumOfOddDigits += digit;
            }
        } while ((numberUnderTestCopy /= 10) != 0);

        double sqrt = Math.sqrt(sumOfOddDigits);

        if (Math.floor(sqrt) != sqrt) {
            return DENIED_MESSAGE;
        }

        return ALLOWED_MESSAGE;

    }
}
