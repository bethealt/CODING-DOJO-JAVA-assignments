package CAFEJAVA.classes;
public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    public Item (String name, double price) {
    //  and sets them accordingly
        this.name = name;
        this.price = price;
    }
    
    // GETTERS & SETTERS  - for name and price
    public String getItemName() {
        return name;
    }

    public double getItemPrice() {
        return price;
    }

    public String setItemName(String name) {
        this.name = name;
        return name;
    }
    
    public double setItemPrice(double price) {
        this.price = price;
        return price;
    }
}