package ZOOKEEPER;

public class Bat extends Mammal {

    public Bat () {
        setEnergyLevel(200);
    }

    public void fly() {
        setEnergyLevel(-50);
        System.out.println("\nSnap! Woosh...! Soar!");
    } 

    public void eatHumans() {
        setEnergyLevel(25);
        System.out.println("\nSo... Well, never mind.");
    }

    public void attackTown() {
        setEnergyLevel(-100);
        System.out.println("\nFire!...Crackling flames are everywhere!");
    }
}
