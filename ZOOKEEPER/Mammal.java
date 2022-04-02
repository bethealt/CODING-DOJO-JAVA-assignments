package ZOOKEEPER;

public class Mammal {
    private int energyLevel;

    public Mammal () {
        this.energyLevel = 100;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int setEnergyLevel(int units) {
        this.energyLevel += units;
        return this.energyLevel;
    }

    public int displayEnergy() {
        System.out.printf("\nEnergy Level: %s", this.energyLevel);
        return this.energyLevel;
    }
    
}

