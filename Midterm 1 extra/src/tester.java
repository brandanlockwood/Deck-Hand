import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class tester {


  
  public static void main(String[] args) {
    //test to see if all card our created in Card class
    ArrayList<Card> deck = new ArrayList<Card>();
    Card pick=null;
    for (int i=0;i<52;i++)
    {
      pick= new Card(i);
      deck.add(pick);
    }
    for(Card c : deck)
      System.out.println(c.getCard()+" "+c.getSuit());
    //test the shuffle class to see any cards our back in their original location
    System.out.println();
    Deck deckS = new Deck();
    int j=0;
    System.out.println(deckS.getDeck());
    Card c2;
    for(int i=0; i<52; i++)//checks the stack of cards to see if any match original position
    {
      c2=deckS.getDeck().pop();
      
      if(c2.getNum()==i) 
      {
        
        j++;
      }
      
    }
    
    System.out.println("numbers that match original location "+j);
    
    
    System.out.println();
    
    //test of the Hand class prints and sorts
    Hand hand = new Hand();
    Hand hand2 = new Hand();
    
    hand.printH();
    hand.sort();
    System.out.println();
    hand.printH();
    
    System.out.println();
    hand2.printH();
    hand2.sort();
    System.out.println();
    hand2.printH();
    System.out.println();
   
    
    
    
    
    
    
  }
}

