package ZOOKEEPER;

public class Gorilla extends Mammal {
    
    public void throwSomething() {
        setEnergyLevel(-5);
        System.out.println("\n Watch out! The gorilla is throwing things...!");
    }

    public void eatBananas() {
        setEnergyLevel(10);
        System.out.println("\n The gorilla is happy now that they have a full belly.");
    }

    public void climb() {
        setEnergyLevel(-10);
        System.out.println("\nThe gorilla has climbed a tree and is currently rooting about in its branches.");
    }

}

