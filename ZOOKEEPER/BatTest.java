package ZOOKEEPER;

public class BatTest {
    
    public static void main(String[] args) {

        System.out.println("\n===== BAT TEST ====="); 

        Bat Archie = new Bat();

        Archie.attackTown();
        Archie.attackTown();
        Archie.attackTown(); 

        Archie.eatHumans();
        Archie.eatHumans();
        
        Archie.fly();
        Archie.fly();

        Archie.displayEnergy();

    }
}
