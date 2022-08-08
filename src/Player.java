



import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;

public class Player {  
     private ArrayList<Card> hand;

    public Player(ArrayList<Card> hand) {
        this.hand = hand;
    }

    /**
     * @description returns the hand of the player
     * @return  ArrayList<Card>
     * 
     */
    public ArrayList<Card> getHand() {
        return hand;
    }
   
    /**
     * @param hand
     * @description prints the hand of the player
     * @return  String
     * @throws UnsupportedEncodingException
     * 
     */
    public String printHand(ArrayList<Card> hand) throws UnsupportedEncodingException {
        String handString = "";
        for(int i = 0; i < hand.size(); i++){
			
           handString += hand.get(i).getType().label + hand.get(i).getSuit().label + " " ;
        }
        return handString;
    }
   /**
    * @description evaluates the hand of the player
    * @param hand
    * @return String
    */
    public String evaluateHand(ArrayList<Card> hand) {
		for(int x=0; x<=4; x++){
			for(int y=0; y<=4; y++){
			if(hand.get(x).type.ordinal() > hand.get(y).type.ordinal()){
				Collections.swap(hand, x, y);
				}
		    }
         }
		int firstCardRankOrdinal = hand.get(0).type.ordinal();
		int secondCardRankOrdinal = hand.get(1).type.ordinal();
		int thirdCardRankOrdinal = hand.get(2).type.ordinal();
		int fourthCardRankOrdinal = hand.get(3).type.ordinal();
		int fifthCardRankOrdinal = hand.get(4).type.ordinal();
		
		int firstCardSuitOrdinal = hand.get(0).suit.ordinal();
		int secondCardSuitOrdinal = hand.get(1).suit.ordinal();
		int thirdCardSuitOrdinal = hand.get(2).suit.ordinal();
		int fourthCardSuitOrdinal = hand.get(3).suit.ordinal();
		int fifthCardSuitOrdinal = hand.get(4).suit.ordinal();
		
		if((firstCardRankOrdinal == secondCardRankOrdinal + 1) &&
			   (firstCardRankOrdinal == thirdCardRankOrdinal + 2)  &&
			    (firstCardRankOrdinal == fourthCardRankOrdinal + 3)  &&
			    firstCardRankOrdinal == fifthCardRankOrdinal + 4 &&
			    firstCardSuitOrdinal == secondCardSuitOrdinal &&
			    secondCardSuitOrdinal == thirdCardSuitOrdinal &&
			    thirdCardSuitOrdinal == fourthCardSuitOrdinal &&
			    fourthCardSuitOrdinal == fifthCardSuitOrdinal){
					return "Straight Flush";
				}
	   
		else if(firstCardRankOrdinal == 12 && (firstCardRankOrdinal == secondCardRankOrdinal + 9) &&
				   firstCardRankOrdinal == thirdCardRankOrdinal + 10  &&
				    firstCardRankOrdinal == fourthCardRankOrdinal + 11  &&
				    firstCardRankOrdinal == fifthCardRankOrdinal + 12 &&
				    firstCardSuitOrdinal == secondCardSuitOrdinal &&
				    secondCardSuitOrdinal == thirdCardSuitOrdinal &&
				    thirdCardSuitOrdinal == fourthCardSuitOrdinal &&
				    fourthCardSuitOrdinal == fifthCardSuitOrdinal){
			
					Collections.swap(hand, 0, 1);
					Collections.swap(hand, 1, 2);
					Collections.swap(hand, 2, 3);
					Collections.swap(hand, 3, 4);
					
					return "Straight Flush";
		}
		else if((firstCardRankOrdinal == secondCardRankOrdinal) &&
				   (firstCardRankOrdinal == thirdCardRankOrdinal)  &&
				    (firstCardRankOrdinal == fourthCardRankOrdinal)){	
			return "Four Of A Kind";
		}
		else if ((secondCardRankOrdinal == thirdCardRankOrdinal) &&
				   (secondCardRankOrdinal == fourthCardRankOrdinal)  &&
				    (secondCardRankOrdinal == fifthCardRankOrdinal)){
			
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 3, 4);
			
			return "Four Of A Kind";
		}
		
		else if((firstCardRankOrdinal == secondCardRankOrdinal) &&
				   (firstCardRankOrdinal == thirdCardRankOrdinal) &&
				   (fourthCardRankOrdinal == fifthCardRankOrdinal) &&
				   (firstCardRankOrdinal != fifthCardRankOrdinal)){
			
			
			return "Full House";
		}
		//check for Full House 2 and 3...
		else if((firstCardRankOrdinal == secondCardRankOrdinal) &&
				   (thirdCardRankOrdinal == fourthCardRankOrdinal) &&
				   (thirdCardRankOrdinal == fifthCardRankOrdinal) &&
				   (firstCardRankOrdinal != fifthCardRankOrdinal)){
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 3, 4);
			Collections.swap(hand, 0, 3);
			return "Full House";
		}
		else if(firstCardSuitOrdinal == secondCardSuitOrdinal
				&& thirdCardSuitOrdinal == fourthCardSuitOrdinal && 
				fourthCardSuitOrdinal == fifthCardSuitOrdinal &&
				firstCardSuitOrdinal == thirdCardSuitOrdinal &&
				firstCardSuitOrdinal == fourthCardSuitOrdinal &&
				thirdCardSuitOrdinal == fifthCardSuitOrdinal){		
			return "Flush";
		}
		else if((firstCardRankOrdinal == secondCardRankOrdinal + 1) &&
				   (firstCardRankOrdinal == thirdCardRankOrdinal + 2)  &&
				    (firstCardRankOrdinal == fourthCardRankOrdinal + 3)  &&
				    firstCardRankOrdinal == fifthCardRankOrdinal + 4){
			return "Straight";
		}
		else if(firstCardRankOrdinal == 12 && (firstCardRankOrdinal == secondCardRankOrdinal + 9) &&
				   firstCardRankOrdinal == thirdCardRankOrdinal + 10  &&
				    firstCardRankOrdinal == fourthCardRankOrdinal + 11  &&
				    firstCardRankOrdinal == fifthCardRankOrdinal + 12){
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 3, 4);
			return "Straight";
		}
		else if(firstCardRankOrdinal == secondCardRankOrdinal &&
				secondCardRankOrdinal == thirdCardRankOrdinal){
			return "Three Of A Kind";
		}
		else if(secondCardRankOrdinal == thirdCardRankOrdinal &&
				thirdCardRankOrdinal == fourthCardRankOrdinal)
		{
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			return "Three Of A Kind";
		}
		else if(thirdCardRankOrdinal == fourthCardRankOrdinal &&
				fourthCardRankOrdinal == fifthCardRankOrdinal)
		{
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 3, 4);
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
            return "Three Of A Kind";
		}
		else if(firstCardRankOrdinal == secondCardRankOrdinal &&
				thirdCardRankOrdinal == fourthCardRankOrdinal &&
				firstCardRankOrdinal != thirdCardRankOrdinal){
			    return "Two Pair";
		}
		else if(secondCardRankOrdinal == thirdCardRankOrdinal &&
				fourthCardRankOrdinal == fifthCardRankOrdinal &&
				firstCardRankOrdinal >= secondCardRankOrdinal){
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 3, 4);
			return "Two Pair";
		}
		else if(firstCardRankOrdinal == secondCardRankOrdinal &&
				fourthCardRankOrdinal == fifthCardRankOrdinal &&
				thirdCardRankOrdinal >= fourthCardRankOrdinal){
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 3, 4);
		    return "Two Pair";
		}
		else if(firstCardRankOrdinal == secondCardRankOrdinal &&
				firstCardRankOrdinal != thirdCardRankOrdinal && 
				firstCardRankOrdinal != fourthCardRankOrdinal && 
				firstCardRankOrdinal != fifthCardRankOrdinal){
			return "One Pair";
			
		}
		
		else if(secondCardRankOrdinal == thirdCardRankOrdinal &&
				firstCardRankOrdinal != secondCardRankOrdinal && 
				fourthCardRankOrdinal != secondCardRankOrdinal && 
				fifthCardRankOrdinal != secondCardRankOrdinal){
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			return "One Pair";
		}
		else if(thirdCardRankOrdinal == fourthCardRankOrdinal &&
				thirdCardRankOrdinal != firstCardRankOrdinal && 
				thirdCardRankOrdinal != secondCardRankOrdinal && 
				thirdCardRankOrdinal != fifthCardRankOrdinal){
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
			return "One Pair";
		}
		else if(fourthCardRankOrdinal == fifthCardRankOrdinal &&
				fourthCardRankOrdinal != firstCardRankOrdinal && 
				fourthCardRankOrdinal != secondCardRankOrdinal && 
				fourthCardRankOrdinal != thirdCardRankOrdinal){
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 3, 4);
			Collections.swap(hand, 1, 2);
			Collections.swap(hand, 2, 3);
			Collections.swap(hand, 0, 1);
			Collections.swap(hand, 1, 2);
            return "One Pair";
		}
		else{
			return "High Card";
		}
       
    }
        

        
    
   
}
