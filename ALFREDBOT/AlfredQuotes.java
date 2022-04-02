package ALFREDBOT;

import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guestGreeting = String.format("Welcome, %s. It's lovely to see you.", name);
        return guestGreeting;
    }

	// NINJA BONUS -- overloading the guessGreeting method
    public String guestGreeting(String name, String dayperiod) {
            String guestGreeting = String.format("Good %s, %s. It's lovely to see you.", dayperiod, name);
            return guestGreeting;
    }
    
    //SENSEI VERSION -- woverloading the guessGreeting method with no parameters, using a Date object to determine the day period. 

    

    public String dateAnnouncement() {
        Date currentDate = new Date();
        String dateAnnouncement = currentDate.toString();
        return "It's currently "+ dateAnnouncement;
    } 

    public String respondBeforeAlexis(String conversation) {
        int alx = conversation.indexOf("Alexis");
        int alf = conversation.indexOf("Alfred");
        if (alx >= 0) {
            return "Of course, my queen, as you command.  Alexis is not required.";
        }
        else if (alf >=0) {
            return "Naturally, my queen. I am at your service.";
        }
        else {
            return "As I am no longer required, I shall retire. Goodbye.";
        }
    }

}

