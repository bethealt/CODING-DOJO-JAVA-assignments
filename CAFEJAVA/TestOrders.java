package CAFEJAVA;
import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        
        class MenuItem  {
            public String item;
            public double price;
        }

        // Menu Items
        MenuItem MenuItem1 = new MenuItem();
        MenuItem1.item = "drip coffee";
        MenuItem1.price = 1.5;

        MenuItem MenuItem2 = new MenuItem();
        MenuItem2.item = "cappucino";
        MenuItem2.price = 2.5;

        MenuItem MenuItem3 = new MenuItem();
        MenuItem3.item = "latte";
        MenuItem3.price = 3.0;

        MenuItem MenuItem4 = new MenuItem();
        MenuItem4.item = "mocha";
        MenuItem4.price = 3.5;

        class Order {
            public String name;
            public double total;
            public boolean ready;
            public ArrayList<Object> items = new ArrayList<Object>();
        }

        // Order Variables
        Order order1 = new Order();
        order1.name = "Cindihuri";
        order1.total = MenuItem2.price + MenuItem3.price;
        order1.ready = true;
        order1.items.add(MenuItem2.item);
        order1.items.add(MenuItem3.item);

        Order order2 = new Order();
        order2.name = "Sam";
        order2.total = MenuItem4.price + MenuItem1.price + (2*MenuItem3.price);
        order2.ready = true;
        order2.items.add(MenuItem4.item);
        order2.items.add(MenuItem1.item);
        order2.items.add(MenuItem3.item);
        order2.items.add(MenuItem3.item);

        Order order3 = new Order();
        order3.name = "Jimmy";
        order3.total = MenuItem2.price + MenuItem3.price + MenuItem4.price;
        order3.ready = true;
        order3.items.add(MenuItem2.item);
        order3.items.add(MenuItem3.item);
        order3.items.add(MenuItem4.item);

        Order order4 = new Order();
        order4.name = "Noah";
        order4.total = MenuItem3.price + MenuItem4.price;
        order4.ready = true;
        order4.items.add(MenuItem3.item);
        order4.items.add(MenuItem4.item);

        // Application Simulation
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = ", your total is $";
        
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Total: %s\n", order1.ready);
        System.out.printf("Items: %s\n", order1.items);

        if (order1.ready == true) {
            System.out.println("\n" + order1.name + readyMessage);
            System.out.println(order1.name + displayTotalMessage + order1.total + ".");
            System.out.printf("Items: %s\n", order1.items);
        }
        else {
            System.out.println("\n" + order1.name + pendingMessage + "\n");
        }

        if (order2.ready == true) {
            System.out.println("\n" + order2.name + readyMessage);
            System.out.println(order2.name + displayTotalMessage + order2.total + ".");
            System.out.printf("Items: %s\n", order2.items);
        }
        else {
            System.out.println("\n" + order2.name + pendingMessage + "\n");
        }
        
        if (order3.ready == true) {
            System.out.println("\n" + order3.name + readyMessage);
            System.out.println(order3.name + displayTotalMessage + order3.total + ".");
            System.out.printf("Items: %s\n", order3.items);
        }
        else {
            System.out.println("\n" + order3.name + pendingMessage + "\n");
        }

        if (order4.ready == true) {
            System.out.println("\n" + order4.name + readyMessage);
            System.out.println(order4.name + displayTotalMessage + order4.total + ".");
            System.out.printf("Items: %s\n", order4.items);
        }
        else {
            System.out.println("\n" + order4.name + pendingMessage + "\n");
        }

    }
}