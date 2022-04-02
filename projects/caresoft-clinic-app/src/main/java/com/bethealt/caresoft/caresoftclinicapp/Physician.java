package com.bethealt.caresoft.caresoftclinicapp;
import java.util.ArrayList;
import java.util.Date;

    //... imports class definition...
public class Physician extends User implements HIPAACompliantUser {
    
    // Inside class:
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    public Physician (Integer id) {
        super(id);
        this.patientNotes = new ArrayList<String>();
    }
    
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
        if (pin < 1000 || pin > 9999) {
            return false;
        }
        else {
            this.pin = pin;
            return true;
        }
    }

    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (confirmedAuthID != id) {
            return false;
        }
        return true;
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(String notes) {
        this.patientNotes.add(notes);
    }

}
