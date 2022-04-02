package CAFEJAVA;

import CAFEJAVA.classes.*;

public class BaristaTest {
    
    public static void main(String[] args) {

    System.out.println("\n===== BARISTA'S CHALLENGE =====");  

    // Menu Items
    Item item1 = new Item("drip coffee", 1.5);
    Item item2 = new Item("cappucino", 2.5);
    Item item3 = new Item("latte", 3.0);
    Item item4 = new Item("mocha", 3.5);

    //Create 2 orders for unspecified guests (without specifying a name);
    Order order1 = new Order();
    Order order2 = new Order();

    //Create 3 orders using the overloaded constructor to give each a name for the order.
    Order order3 = new Order("Cindihuri");
    Order order4 = new Order("Sam");
    Order order5 = new Order("Noah");

    //Add at least 2 items to each of the orders using the addItem method
    
    order1.addItem(item1);
    order1.addItem(item2);

    order2.addItem(item3);
    order2.addItem(item4);

    order3.addItem(item2);
    order3.addItem(item3);
    order3.addItem(item3);

    order4.addItem(item1);
    order4.addItem(item2);
    order4.addItem(item3);
    order4.addItem(item4);

    order5.addItem(item2);
    order5.addItem(item4);
    order5.addItem(item4);

    System.out.println("\n----- Display Test -----");
    //Test the results and the display method by calling the display method on all of your orders
    order1.display();
    order2.display();
    order3.display();
    order4.display();
    order5.display();

    System.out.println("\n----- Status Message Test -----");
    //Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order
    order1.setReady(true);
    order3.setReady(true);
    order4.setReady(true);

    order1.getStatusMessage();
    order2.getStatusMessage();
    order3.getStatusMessage();
    order4.getStatusMessage();
    order5.getStatusMessage();

    System.out.println("\n----- Order Total Test -----");
    System.out.println(order1.getOrderTotal());
    System.out.println(order2.getOrderTotal());
    System.out.println(order3.getOrderTotal());
    System.out.println(order4.getOrderTotal());
    System.out.println(order5.getOrderTotal());

    System.out.println("\n----- Display Test -----");
    order1.display();
    order2.display();
    order3.display();
    order4.display();
    order5.display();
    }
}
