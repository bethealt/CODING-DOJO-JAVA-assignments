package CAFEJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
    
    public int getStreakGoal() {
        //a method that sums together every consecutive integer from 1 to 10 and returns the sum equal to 55.
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        return sum;
    }
    
    public int getStreakGoal(int numWeeks) {
        //a method that allows an admin to enter the number of weeks and sums together every consecutive integer and returns the cumulative sum.
        int sum = 0;
        for (int i = 1; i < (numWeeks + 1); i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
    // Given an array of item prices from an order, sum all of the prices in the array and return the total. 
        double sum = 0.0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }   

    public void displayMenu(ArrayList<String> menuItems) {
    //Given an ArrayList of menu items (strings), print out each index and menu item. 
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }   
    
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        else if (menuItems.size() == prices.size()) {
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%s %s -- $%.2f%n", i, menuItems.get(i), prices.get(i));
            }
        }
        return true;
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! \n", userName);
        System.out.printf("There are %s people in front of you. \n", customers.size());
        customers.add(userName);
    }

    public void addCustomers(ArrayList<String> queue) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a customer name:");
        System.out.println("To close the list, enter 'q'.");
        while (scan.hasNext()) {
            String customer = scan.next();
            if (customer.equalsIgnoreCase("q")) {
                System.out.println("The list is now closed.");
                scan.close();
            }
            queue.add(customer);
            System.out.printf("There are currently %s people in queue. \n", queue.size());
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i < (maxQuantity + 1); i++) {
            double total = price * i;
            System.out.printf("%s - $%.2f%n", i, total);
        }
    }

    public void printDiscountedChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i < (maxQuantity + 1); i++) {
            double discount = 5.00*(i - 1);
            double total = (price - discount) * i;
            System.out.printf("%s - $%.2f%n", i, total);
        }
    }

}











