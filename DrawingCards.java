
/**
 * Utilizes deckOfCards.java to make an unsorted deck from which to draw cards at random
 * 
 * @author (Carson Roberts)
 * @version (3/21/22)
 */

import java.util.ArrayList;
import java.util.Scanner;
public class DrawingCards
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        deckOfCards deckObject = new deckOfCards();
        ArrayList<String[]> deck = deckObject.getDeck();
        
        while(deck.size() > 0)
        {
            if(deck.size() == 52)
            {
                System.out.println("Draw a card? Enter Y for yes.");
            }
            else
            {
                System.out.println("Draw another card? Enter Y for yes.");
            }
            
            String in = scan.next();
            if(in.equals("Y") || in.equals("y"))
            {
                deckObject.drawCard();
            }
            else
            {
                break;
                //if the user does not wish to draw another card, they can enter any string other than "Y"
                //at which point the program ends, and the user is informed how many cards were left in the deck
            }
        }
        System.out.println("There are " + deck.size() + " cards left in the deck. Goodbye :)");
    }
}
