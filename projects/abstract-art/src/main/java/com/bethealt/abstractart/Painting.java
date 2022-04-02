package com.bethealt.abstractart;

public class Painting extends Art {
    
    private String paintType;

    //CONSTRUCTOR
    public Painting (String title, String artist, String description, String paintType) {
        super(title, artist, description);
        this.paintType = paintType;
        //Oil, Watercolor, Acrylic, Ink
    }

    //GETTERS & SETTERS
    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paint) {
        this.paintType = paint;
    }

    public void viewArt() {
        System.out.printf("\nTitle: %s", getTitle());
        System.out.printf("\nArtist: %s", getArtist());
        System.out.printf("\nDescription: %s", getDescription());
        System.out.printf("\nPaint Type: %s", getPaintType());
    }
}
