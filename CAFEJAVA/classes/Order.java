package CAFEJAVA.classes;

import java.util.ArrayList;

public class Order {

    //MEMBER VARIABLES 
    private String name;
    private boolean ready;
    private ArrayList<Item> items; 

    //CONSTRUCTOR
    public Order () {
        this.name = "Guest";
        items = new ArrayList<Item>();
    }

    public Order (String name) {
        this.name = name;
        items = new ArrayList<Item>();
        
    }

    //GETTERS & SETTERS
    public String getOrderName() {
        return name;
    }

    public ArrayList<Item> getItemList() {
        return items;
    }

    public void addItem (Item oi) {
        items.add(oi);
    }

    public boolean setReady(boolean value) {
        this.ready = value;
        return ready;
    }
   
    public void getStatusMessage() {
        if (ready == true) {
            System.out.printf("\n %s, your order is ready!", name);
        }
        else {
            System.out.printf("\n %s, thank you for waiting. Your order will be ready shortly.", name);
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for(int i = 0; i < items.size(); i++) {
        Item oi = items.get(i);
        total += oi.getItemPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("\n Customer Name: %s", name);
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            Item oi = items.get(i);
            total += oi.getItemPrice();
            System.out.printf("\n %s - $%s0",oi.getItemName(), oi.getItemPrice());

            }
        System.out.printf("\n Total: $%s0 \n", total);
    } 






 
}