


public class Card implements Comparable<Card> 
{
  private   int rank=0; 
  private String suit = "";
  private String rankNum = "";
  private   int  number=0;
  private int num=0;
  /**
   * Card constructor that creates all the cards to the nth by rank and number
   */ 
  public Card(int n)
  {
    num = n%13;
    number = n;
    
    switch(num) //ranks each card by their number from Ace to King
    {
      case 0:  rankNum = "2";     break;     
      case 1:  rankNum = "3";      break;
      case 2:  rankNum = "4";   break; 
      case 3:  rankNum = "5";   break; 
      case 4:  rankNum = "6";   break; 
      case 5:  rankNum = "7";   break; 
      case 6:  rankNum = "8";   break;
      case 7:  rankNum = "9";   break;
      case 8:  rankNum = "10";   break;
      case 9: rankNum = "Jack";   break;
      case 10: rankNum = "Queen";   break;
      case 11: rankNum = "King";   break;
      case 12: rankNum = "Ace";   break;
      default: rankNum = "Error!";
      
    }
    if (n>=0 && n<=12)
    { 
      suit="Clubs";
      rank=0;
      
    }//end of Clubs if statement
    if (n>=13 && n<=25)
    {
      suit="Diamonds";
      rank=1;
      
    }//end of Diamonds statement
    if (n>=26 && n<=38)
    {
      suit="Hearts";
      rank =2;
      
    }//end of hearts statement
    if (n>=39 && n<=51)
    {
      suit="Spades";
      rank=3;
      
    }//end of Spades statement
  }
  /**
   * Gets the rank of the card
   * param-none
   * return rank
   */
  public int getRank()
  {
    return rank;
  }
  /**
   * Gets the name of the card of the card
   * param-none
   * return rankNum
   */
  public String getCard()
  {
    return rankNum;
  }
  /**
   * Gets the suit of the card of the card
   * param-none
   * return suit
   */
  public String getSuit()
  {
    return suit;
  }
  /**
   * Gets the number of of the card of the card
   * param-none
   * return suit
   */
  public int getNum()
  {
    return number;
  }
  /**
   * Compares two cards to tell which one is greater return -1 if less 0 if greater and return 20 if not an object of card
   * param Card otherObject
   * return int
   */
  public int compareTo(Card otherObject) {
    Card other = (Card) otherObject;
    
    if(getNum()>other.getNum()){return -1;}
    if(getNum()<other.getNum()){return 0;}
    
    
    return 20;
  }
  /**
   * Gives number of the card
   * param none
   * return number of the card
   */
  public String toString()
  {
    int card = getNum();
    String  number = (""+card+"");
    return number;
  }
  /**
   * Gives number of the modulo divided card
   * param none
   * return number of the modulo divided card
   */
  public int getMyNum()
  {
    return num;
  }
  
}





