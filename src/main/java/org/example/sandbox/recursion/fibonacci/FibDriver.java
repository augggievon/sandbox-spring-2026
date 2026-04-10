package org.example.sandbox.recursion.fibonacci;

import java.math.BigInteger;

public class FibDriver {

    public static void main(String[] args) {
        FibNumbers fn = new FibNumbers();


        for (int i = 0; i <= 1000000000; i++) {
            BigInteger fib = fn.fib(i);
            System.out.println("fib(" + i + ") = " + fib);
        }
    }
}
