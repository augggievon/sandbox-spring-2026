package org.example.sandbox.stackoverflow;

public class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.plus(1);
    }

    private int plus(int n) {

        System.out.println(n);
        return plus(n+1);
    }
}
