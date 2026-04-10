package org.example.sandbox.factorial;

import java.math.BigInteger;

public class factorial {

    public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("factorial 0f(" + i + ") = " + factorial(i));
        }
    }
    private static BigInteger factorial(int i) {
        if (i == 0) {
            return BigInteger.ONE;
        }
        return factorial(i-1).multiply(BigInteger.valueOf(i));
    }
}
