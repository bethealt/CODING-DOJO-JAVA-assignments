package CAFEJAVA;

import java.util.ArrayList;

public class TestCafe {
    /* The main method is the launch point for a Java application */
    public static void main(String[] args) {

    // code to create a new instance of CafeUtil to access all of its methods
    CafeUtil appTest = new CafeUtil();

    /* ============ App Test Cases ============= */
    
    System.out.println("\n----- Streak Goal Test -----");
    System.out.printf("Purchases needed by week 10: %s \n", appTest.getStreakGoal());
    System.out.printf("Purchases needed by week 15: %s \n", appTest.getStreakGoal(15));
    
    System.out.println("\n----- Order Total Test -----");
    double[] lineItems = {3.5, 1.5, 4.0, 4.5};
    System.out.printf("Order total: %s \n", appTest.getOrderTotal(lineItems));

    System.out.println("\n----- Display Menu Test -----");
    ArrayList<String> menu = new ArrayList<String>();
    menu.add("drip coffee");
    menu.add("cappucino");
    menu.add("latte");
    menu.add("mocha");
    appTest.displayMenu(menu);

    System.out.println("\n----- Updated Menu Test -----");
    ArrayList<String> updatedMenu = new ArrayList<String>();
    updatedMenu.add("drip coffee");
    updatedMenu.add("cappucino");
    updatedMenu.add("latte");
    updatedMenu.add("mocha");

    ArrayList<Double> priceList = new ArrayList<Double>();
    priceList.add(1.5);
    priceList.add(3.5);
    priceList.add(4.0);
    priceList.add(4.5);
    appTest.displayMenu(updatedMenu, priceList);

    System.out.println("\n----- Add Customer Test -----");
    ArrayList<String> queue = new ArrayList<String>();
    // --- Test 4 Time --- //
    for (int i = 0; i < 4; i++) {
        appTest.addCustomer(queue);
        System.out.println();
        }
    System.out.println(queue);

    System.out.println("\n----- Updated Customer Test -----");
    ArrayList<String> customerList = new ArrayList<String>();
    appTest.addCustomers(customerList);
    System.out.println();
    System.out.println(customerList);
    
    System.out.println("\n----- Price Chart Test -----");
    appTest.printPriceChart("Super Fly Sneakers", 75.00, 5);
    appTest.printDiscountedChart("\nLuxurious Driving Loafers", 150.00, 5);

    }
}
