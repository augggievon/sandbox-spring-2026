package org.example.sandbox.inheritance;

public class truck extends Vehicle {

    public truck(){
        counter++;
    }

    @Override
    public void load(){
        System.out.println("loading");
    }

    @Override
    public void transport() {
        System.out.println("transporting truck stuff");
    }
}
