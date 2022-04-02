package com.bethealt.caresoft.caresoftclinicapp;

public class User {
    
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters

    public int getPIN() {
        return pin;
    }
    
    public void setPIN(int pin) {
        this.pin = pin;
    }

    public int getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }
    
    // Implement a constructor that takes an ID
    public User (Integer id) {
        this.id = id;
    }
        
}