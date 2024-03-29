package CAFEJAVA;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", your total is $";
        
        // Menu variables (add yours below)
        //double mochaPrice = 3.5;
        double dripCoffeePrice = 1.5;
        double lattePrice = 2.5;
        double cappucinoPrice = 2.5;

        //Double MochaPrice = 3.5;
        //Double DripCoffeePrice = 1.5;
        //Double LattePrice = 2.5;
        //Double CappucinoPrice = 2.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder2 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);

        if (isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage);
            System.out.println(customer4 + displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(customer2 + displayTotalMessage + (2*lattePrice));
        if (isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeePrice));



    }
}
