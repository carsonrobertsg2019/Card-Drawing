
/**
 * The data structure that represents the deck is:
 * A list of String array objects, such that the String array contains two elements:
 * A string representing the value of the card ("Ace", "2", "5", "King", etc), and the suit of the card ("Heart", "Spade", etc)
 * The 0th element of the string array corresponds to the value of the card, and the 1st element of the string array corresponds to the suit
 *
 * @author (Carson Roberts)
 * @version (3/21/22)
 */
import java.util.ArrayList;
import java.util.Random;
public class deckOfCards
{
    ArrayList<String[]> deck;
    
    public deckOfCards()
    {
        deck = defineDeck();
    }
    
    public ArrayList<String[]> getDeck()
    {
        return deck;
    }
    
    public void drawCard()
    {
        Random rand = new Random();
        int upperbound;
        int intRand;
        
        upperbound = deck.size(); 
        intRand = rand.nextInt(upperbound);
        String[] card = deck.get(intRand);
        System.out.println("The " + card[0] + " of " + card[1] + "s was drawn.");
        deck.remove(intRand);
    }
    
    public ArrayList<String[]> defineDeck()
    {
        //initialization of data structures
        ArrayList<String[]> finalList = new ArrayList<String[]>();
        String[] valueAndSuit;
        
        //Ace, 2 through 10, Jack, Queen, King
        //Club, Diamond, Heart, Spade
        //52 additions to finalList
        for(int i = 1; i <= 13; i++)
        {
            if(i == 1) //case: ace
            {
                valueAndSuit = new String[]{"Ace","Club"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Ace","Diamond"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Ace","Heart"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Ace","Spade"};
                finalList.add(valueAndSuit);
            }
            else if(i == 11) //case: Jack
            {
                valueAndSuit = new String[]{"Jack","Club"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Jack","Diamond"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Jack","Heart"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Jack","Spade"};
                finalList.add(valueAndSuit);
            }
            else if(i == 12) //case: Queen
            {
                valueAndSuit = new String[]{"Queen","Club"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Queen","Diamond"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Queen","Heart"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"Queen","Spade"};
                finalList.add(valueAndSuit);
            }
            else if(i == 13) //case: King
            {
                valueAndSuit = new String[]{"King","Club"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"King","Diamond"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"King","Heart"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{"King","Spade"};
                finalList.add(valueAndSuit);
            }
            else //case: 2 through 10, value of i corresponds to value of card
            {
                String numToAdd_String = Integer.toString(i);
                valueAndSuit = new String[]{numToAdd_String,"Club"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{numToAdd_String,"Diamond"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{numToAdd_String,"Heart"};
                finalList.add(valueAndSuit);
                valueAndSuit = new String[]{numToAdd_String,"Spade"};
                finalList.add(valueAndSuit);
            }
        }
        return finalList;
    }
}