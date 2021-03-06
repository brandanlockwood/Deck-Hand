import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

/**
 * creates a deck of cards and shuffles them
 */
public class Deck {
  private Stack<Card> shuffleD = new Stack<Card>();
  private  final Card[] pile = new Card[52];
  public Deck()
  {
    
    
    Card cards;
    for(int i=0; i<52; i++)
    {
      pile[i]= new Card(i);
      
      
    }
    shuffleD=shuffle(pile);
    
  }
  /**
   * Gets the shuffled deck
   * param--none
   * return shuffle deck
   */
  public Stack<Card> getDeck()
  {
    return shuffleD;
  }
  /**
   * Deals one card off the top of the deck
   * param--none
   * return a card
   */
  public Card deal()
  {
    Card pop;
    pop=shuffleD.pop();
    return pop;
  }
  /**
   * Shuffles an array of Cards into a stack of cards
   * param--Card[] unshuffled
   * return Stack<Card>
   */
  public Stack<Card> shuffle(Card[] unshuffled)
  {
    Random generator = new Random();
    
    int randomT =generator.nextInt(30-22)+22;//random cut point top stack
    
    int randomB = 51-randomT; //random cut point bottom stack
    
    
    Stack<Card> shuffled = new Stack<Card>();//create occurrence for shuffled cards
    
    Stack<Card> top = new Stack<Card>(); //top stack
    
    Stack<Card> bottom = new Stack<Card>(); //bottom stack
    
    ArrayList<Card> topC= new ArrayList<Card>(); //top array for the top stack
    
    ArrayList<Card> bottomC = new ArrayList<Card>(); //bottom array for the bottom stack
    
    if(randomT>randomB)//if randomT is greater then B add the list of unshuffled 
    {
      for(int i=0; i<randomT;i++)//add topC until RandomT
      {
        topC.add(unshuffled[i]);
      }
      for(int i=randomT;i<52;i++)// add rest to bottom
      {
        bottomC.add(unshuffled[i]);
      }
    }//end of adding to list  of unshuffled cards two stacks
    
    if(randomB>randomT) //if randomB is greater then T add the list of unshuffled 
    {
      for(int i=0; i<randomB;i++) //add topC until random B
      {
        topC.add(unshuffled[i]);
      }
      for(int i=randomB;i<52;i++) //add rest to bottom
      {
        bottomC.add(unshuffled[i]);
      }
    }//end of adding to list  of unshuffled cards two stacks
    
    for(int i=0;i<3;i++) //shuffle three times
    {
    	
      if(randomT>randomB) //if random T is greater shuffle this way
      { 
        
        for(int j=0; j<topC.size();j++) //push top array on to top stack
        {
          top.push(topC.get(j));
          
          
          
          if(j<bottomC.size()) //push bottom array on to bottom stack
          {
            bottom.push(bottomC.get(j));
          }
          
        }
        for(int j=0; j<topC.size();j++) //add stacks to shuffle stack
        {
          shuffled.push(top.pop());
          
          
          
          if(j<bottomC.size())
          {
            shuffled.push(bottom.pop()); //add bottom till gone
          }
          
        }
        topC.clear(); //clear top array
        bottomC.clear();//clear bottom array
        if(i!=2)//shuffle three times
        {
          for(int j=0; j<randomT;j++) // pop shuffle stack to add topC array
          {
            topC.add(shuffled.pop());
          }
          for(int j=randomT; j<52;j++) // pop shuffle stack to add bottomC array
          {
            bottomC.add(shuffled.pop());
          }
        }//end of if statement
        
        
      }//end of for loop
      
      if(randomB>randomT) //if randomB is greater then shuffle this way
      { 
        
        for(int j=0; j<topC.size();j++) //add to top stack
        {
          top.push(topC.get(j));
          
          
          
          if(j<bottomC.size()) //add to bottom stack
          {
            bottom.push(bottomC.get(j));
          }
          
        }
        for(int j=0; j<topC.size();j++)  //add to shuffle stack
        {
          shuffled.push(top.pop());
          
          
          
          if(j<bottomC.size()) //add bottom till gone
          {
            shuffled.push(bottom.pop());
          }
          
        }
        topC.clear(); //clear both arrays
        bottomC.clear();
        if(i!=2)//only three shuffles
        {
          for(int j=0; j<randomB;j++)
          {
            topC.add(shuffled.pop());
          }
          for(int j=randomB; j<52;j++)
          {
            bottomC.add(shuffled.pop());
          }
        }//end of if statement
        
      }//end of if statement
    }//end of the loop for shuffling three times
    
    
    
    return shuffled; //returns shuffled deck
  }
  
  
}

