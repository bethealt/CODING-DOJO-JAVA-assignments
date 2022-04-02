package ZOOKEEPER;

public class GorillaTest {
    
    public static void main(String[]  args) {

        System.out.println("\n===== GORILLA TEST ====="); 

        Gorilla Robbie = new Gorilla();

        System.out.println("\n----- Throw Something Test -----");
        Robbie.throwSomething();
        Robbie.throwSomething();
        Robbie.throwSomething();

        System.out.println("\n----- East Bananas Test -----");
        Robbie.eatBananas();
        Robbie.eatBananas();

        System.out.println("\n----- Climb Test -----");
        Robbie.climb();

        System.out.println("\n----- Display Test -----");
        Robbie.displayEnergy();
    }
}
