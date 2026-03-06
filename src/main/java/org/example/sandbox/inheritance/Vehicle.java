package org.example.sandbox.inheritance;

<<<<<<< HEAD
public abstract class Vehicle implements Conveyance {
=======
public abstract class Vehicle implements conveyence{

>>>>>>> origin/master

    protected static int counter;
    protected int loadCapacity;

<<<<<<< HEAD
    public Vehicle() {
=======
    public Vehicle(){
>>>>>>> origin/master
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
<<<<<<< HEAD

    public abstract void load();

    public void unload() {
        System.out.println("Unloading vehicle stuff.");
=======
    public abstract void load();

    public void drives(){
        System.out.println("driving");
>>>>>>> origin/master
    }
}
