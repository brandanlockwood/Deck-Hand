import java.util.ArrayList;
import java.util.Collections;

/**
 *Creates a hand of cards 5 max
 */
public class Hand implements Comparable<Hand>
{
  private ArrayList<Card> hand = new ArrayList<Card>();
  private final int numHand =5;
  private Deck deck = new Deck();
  public Hand()
  {
    
    
    Card c1= null;
    
    for(int i=0; i<numHand;i++)
    {
      c1=deck.deal();
      hand.add(c1);
    }
  }
  /**Prints hand
    *param-none
    *return-none
    */
  public void printH()
  {
    
    for (Card b: hand)
      System.out.println(b.getCard()+" "+b.getSuit());
    
  }
  /**Sorts the hand
    *param-none
    *return-none
    */
  public void sort()
  {
    Collections.sort(hand);
  }
  /**Compares two hands
    *param-Hand otherObject
    *return-int
    */
  
  public int compareTo(Hand otherObject) {
    int otherPair=0;
    int pair = 0;
    int suit =0;
    int otherSuit =0;
    int Num=0;
    int kind=0;
    int otherKind=0;
    
    Card card = null;
    int cardN =0;
    int [] otherC = new int [5];
    int [] C = new int[5];
    
    
    Hand other = (Hand) otherObject;
    other.sort();
    for(int i=0; i<numHand;i++)
    {
      card = other.num(i);
      cardN= card.getMyNum();
      otherC[i]=cardN;
    }
    
    sort(); 
    for(int i=0; i<numHand;i++)
    {
      card = num(i);
      cardN= card.getMyNum();
      C[i]=cardN;
    }
    if(C[0] == C[1] &&C[1]==C[2] &&C[2]==C[3] &&C[3]==C[4])
    {
      otherKind =4;
    }
    if(C[0] == C[1] && C[1]==C[2] &&C[2]==C[3] &&C[3]!=C[4])
    {
      otherKind =4;
    }
    if(C[0] == C[1] && C[1]!=C[2] &&C[2]!=C[3] &&C[3]!=C[4])
    {
      otherPair=1;
    }
    if(C[0] != C[1] && C[1]==C[2] &&C[2]!=C[3] &&C[3]!=C[4])
    {
      otherPair=1;
    }
    if(C[0] != C[1] && C[1]!=C[2] &&C[2]==C[3] &&C[3]!=C[4])
    {
      otherPair=1;
    }
    if(C[0] != C[1] && C[1]!=C[2] &&C[2]!=C[3] &&C[3]==C[4])
    {
      otherPair=1;
    }
    if(C[0] == C[1] && C[2]==C[3] && C[3]!=C[4] && pair !=1)
    {
      otherPair=2;
    }
    if(C[1] == C[2] && C[3]==C[4] && C[0] !=C[1] && pair!=1)
    {
      otherPair=2;
    }
    
    
    
    if(otherC[0] == otherC[1] && otherC[1]==otherC[2] &&otherC[2]==otherC[3] &&otherC[3]==otherC[4])
    {
      kind =4;
    }
    if(otherC[0] == otherC[1] && otherC[1]==otherC[2] &&otherC[2]==otherC[3] &&otherC[3]!=otherC[4])
    {
      kind =3;
    }
    if(otherC[0] == otherC[1] && otherC[1]!=otherC[2] &&otherC[2]!=otherC[3] &&otherC[3]!=otherC[4])
    {
      pair =1;
    }
    if(otherC[0] != otherC[1] && otherC[1]==otherC[2] &&otherC[2]!=otherC[3] &&otherC[3]!=otherC[4])
    {
      pair =1;
    }
    if(otherC[0] != otherC[1] && otherC[1]!=otherC[2] &&otherC[2]==otherC[3] &&otherC[3]!=otherC[4])
    {
      pair =1;
    }
    if(otherC[0] != otherC[1] && otherC[1]!=otherC[2] &&otherC[2]!=otherC[3] &&otherC[3]==otherC[4])
    {
      pair =1;
    }
    if(otherC[0] == otherC[1] && otherC[2]==otherC[3] &&otherC[3]!=otherC[4] && pair!=1)
    {
      pair =2;
    }
    if(otherC[0] != otherC[1] && otherC[2]==otherC[3] &&otherC[3]==otherC[4] && pair!=1)
    {
      pair =2;
    }
    
    
    if(kind>otherKind){return 0;}
    if(otherKind>kind){return 1;}
    if(pair>otherPair){return 2;}
    if(otherPair<pair){return 3;}
    
    return -1;
  }
  public Card num(int i)
  {
    return hand.get(i);
  }
  
  
  
  
}
