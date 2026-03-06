package org.example.sandbox.inheritance;

public class car extends Vehicle{

    public car(){
            counter++;
}

    @Override
    public void load() {
        System.out.println("loading ");
    }

    @Override
    public void transport() {

        System.out.println("transporting car stuff");
    }

    @Override
    public void drives(){
        System.out.println("drving again");
    }
}
