package com.bethealt.abstractart;

public class Sculpture extends Art {
    
    private String material;

    //CONSTRUCTOR
    public Sculpture (String title, String artist, String description, String material) {
        super(title, artist, description);
        this.material = material;
        //Marble, Bronze, Porcelain, Fabric
    }

    //GETTERS & SETTERS
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void viewArt() {
        System.out.printf("\nTitle: %s", getTitle());
        System.out.printf("\nArtist: %s", getArtist());
        System.out.printf("\nDescription: %s", getDescription());
        System.out.printf("\nMaterial: %s", getMaterial());
    }
}
