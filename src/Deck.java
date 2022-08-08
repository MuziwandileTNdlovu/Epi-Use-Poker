

import java.util.Random;

import java.util.ArrayList;
public class Deck extends Card {
    
   //SIZE OF THE DECK OF CARDS
   private int DECK_SIZE = 52;
   //ARRAY OF THE PLAYING CARDS
   private ArrayList<Card> deck;
   //CONSTRUCTOR FOR THE DECK OF CARDS 
   public Deck(){
        super();
       deck = new ArrayList<Card>(DECK_SIZE);
   }
   /**
    * @description This method gets the deck of cards
    * @return  ArrayList<Card>
    */
   public ArrayList<Card>  getDeck(){
        return deck;
     
   }
   /**
    * @description This method sets the deck of cards
    * @return void
    */
   public void setDeck(){
       for(int i = 0; i < 4; i++){
           for(int j = 0; j < 13; j++){
               deck.add( new Card(SUIT.values()[i],TYPE.values()[j]));
           }
       }
   }
   /**
    * @description This method shuffles the deck of cards
    * @return void
    */
   public void shuffleDeck(){
       Random rand = new Random();
       Card temp;
       System.out.println("Shuffling ... Shuffling ... Shuffling ...");
       for(int numberOfShuffles = 0; numberOfShuffles < 100; numberOfShuffles++){
           for(int count = 0; count < DECK_SIZE ; count++){
               int index =rand.nextInt(13);
               temp = deck.get(count);
               deck.set(count, deck.get(index));
               deck.set(index,  temp);
           }
       }

   }
   /**
    * @description This method is used to deal the hands to the player and remove dealt card from deck.
    * @param deck
    * @param index
    * @return Card
    */
   public Card dealtCard(Deck deck, int index){
         return deck.getDeck().remove(index);
   }
   /**
    * @description This method is used to print the deck of cards
    * @return void
    */
   public void printDeck(){
       for(int i = 0; i < DECK_SIZE; i++){
           System.out.println(i + ". " + deck.get(i).getSuit() + " " + deck.get(i).getType());
       }
   }




    
}
