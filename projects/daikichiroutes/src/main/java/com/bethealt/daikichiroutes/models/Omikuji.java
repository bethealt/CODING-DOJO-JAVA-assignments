package com.bethealt.daikichiroutes.models;

public class Omikuji {
    
    // MEMBER VARIABLES
    private Integer random;
    private String city;
    private String name;
    private String hobby;
    private String living;
    private String nice;
    
    //CONSTRUCTOR
    public Omikuji(
        Integer random, String city, String name,
        String hobby, String living, String nice) {
            this.random = random;
            this.city = city;
            this.name = name;
            this.hobby = hobby;
            this.living = living;
            this.nice = nice;
        }
   
    //GETTERS & SETTERS
    public Integer getRandom() {
        return this.random;
    }

    public Integer setRandom(Integer random) {
        this.random = random;
        return this.random;
    }

    public String getCity() {
        return this.city;
    }

    public String setCity(String city) {
        this.city = city;
        return this.city;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getHobby() {
        return this.hobby;
    }

    public String setHobby(String hobby) {
        this.hobby = hobby;
        return this.hobby;
    }

    public String getLiving() {
        return this.living;
    }

    public String setLiving(String living) {
        this.living = living;
        return this.living;
    }

    public String getNice() {
        return this.nice;
    }

    public String setNice(String nice) {
        this.nice = nice;
        return this.nice;
    }

}
