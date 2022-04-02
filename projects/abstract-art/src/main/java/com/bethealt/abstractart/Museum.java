package com.bethealt.abstractart;
import java.util.ArrayList;

public class Museum {

    private ArrayList<Art> museum = new ArrayList<Art> ();

    public void main(String[] args) {

       Painting painting1 = new Painting(
            "The Harlem Renaissance",
            "Laura Wheeler Waring",
            "1920",
            "Acrylic"
            );
        museum.add(painting1);

        Painting painting2 = new Painting(
            "Untitled River Landscape",
            "Gwendolyn Bennett",
            "1931",
            "Oil"
            );
        museum.add(painting2);

        Painting painting3 = new Painting(
            "Lazy Sunday",
            "Toyin Odutola",
            "2016",
            "Ink"
            );
        museum.add(painting3);
        
        Sculpture sculpture1 = new Sculpture(
            "Lift Every Voice and Sing",
            "Augusta Savage",
            "1939",
            "Bronze"
            );
        museum.add(sculpture1);

        Sculpture sculpture2 = new Sculpture(
            "Renaissance Society Installation",
            "Kara Walker",
            "1997",
            "Paper"
            );
        museum.add(sculpture2);

        System.out.println(museum);
    }
}
