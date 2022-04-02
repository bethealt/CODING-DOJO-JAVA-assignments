package com.bethealt.caresoft.caresoftclinicapp;
import java.util.ArrayList;
import java.util.Date;

//... imports class definition...
public class AdminUser extends User implements HIPAACompliantAdmin {

    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser (Integer id, String role) {
        super(id);
        this.role = role;
        this.securityIncidents = new ArrayList<String>();
    }

    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
        if (pin < 100000 || pin > 99999999) {
            return false;
        }
        else {
            this.pin = pin;
            return true;
        }
    }

    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (confirmedAuthID != id) {
            authIncident();
            return false;
        }
        return true;
    }

    // TO DO: Implement HIPAACompliantAdmin!
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }
    
    // DEFAULT IMPLEMENTED METHODS
    // Used to print security incidents. 
    public void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    // QA Test, PASS/FAIL of reports against QA expected results
    public boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }

    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return securityIncidents;
    }

    public void setSecurityIncidents(String incident) {
        this.securityIncidents.add(incident);
    }
}
