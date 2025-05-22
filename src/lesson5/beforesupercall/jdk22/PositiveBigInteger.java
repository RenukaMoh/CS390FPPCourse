package lesson5.beforesupercall.jdk22;

import java.math.BigInteger;

public class PositiveBigInteger extends BigInteger {
    public PositiveBigInteger(long value) {
        super(verifyPositive(value));
    }

    private static String verifyPositive(long value) {
        if (value <= 0)
            throw new IllegalArgumentException("non-positive value");
        return String.valueOf(value);
    }
}
