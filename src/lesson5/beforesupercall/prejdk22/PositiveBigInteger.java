package lesson5.beforesupercall.prejdk22;

import java.math.BigInteger;

public class PositiveBigInteger extends BigInteger {
    public PositiveBigInteger(long value) {
        super(String.valueOf(value));          // Potentially unnecessary work
        if (value <= 0)
            throw new IllegalArgumentException("non-positive value");
       // super(String.valueOf(value)); Should be a first line call pre JDK 21
    }
}
