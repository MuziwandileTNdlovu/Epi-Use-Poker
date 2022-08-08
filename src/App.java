

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.String;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class App {
    public static int HAND_SIZE = 0;
    public static void main(String[] args) throws IOException {
        System.out.println("-------------Welcome to the Poker Game---------------");
        selectVariant();
    }
    /**
     * @description This method is used to select the variant of the game.
     * @return void
     * @throws IOException
     */
    public static void selectVariant() throws IOException{
        System.out.println("Please Select a variant: ");
        System.out.println("1. Five-card draw poker");
        System.out.println("2. Exit");
        try (Scanner selection = new Scanner(System.in)) {
            if(selection.hasNextInt()){
                int variant = selection.nextInt();
                if(variant == 1){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    fiveCardDraw();
                }
                else if(variant == 2){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.exit(0);
                }
                else{
                    System.out.println("Invalid variant");
                    selectVariant();
                }
            }
            else{
                System.out.println("Invalid variant");
                selectVariant();
            }
        }   
    }

    /**
     * @description This method is used to set the hand size.
     * @param handSize
     * @return int
     */
    public static int setHandSize(int handSize){
        HAND_SIZE = handSize;
        return HAND_SIZE;
    }
    /**
     * @description This method is used to start the game for the user.
     * @return void
     * @throws UnsupportedEncodingException
     * @throws IOException
     */
    private static void fiveCardDraw() throws UnsupportedEncodingException {
        System.out.println("Welcome to Five-Card Draw Poker");
        
        setHandSize(5);
        Deck deck = new Deck();
        deck.setDeck();
        deck.shuffleDeck();
        Player player = new Player(dealHands(deck, HAND_SIZE));
        System.out.println("Your hand: " + player.printHand(player.getHand()));
        System.out.println("You have: " + player.evaluateHand(player.getHand()));
    }
    /**
     * @description This method is used to deal the hands to the player.
     * @param deck
     * @param HandSize
     * @return ArrayList<Card>
     */
    public static ArrayList<Card>  dealHands(Deck deck, int HandSize){
        ArrayList<Card>  hand = new ArrayList<Card>(HandSize);
        Random rand = new Random();
        for(int count =0   ; count < HandSize; count++){
            int index =rand.nextInt(deck.getDeck().size());
            hand.add(count, deck.dealtCard(deck, index));
        }
        return hand;
    }
}
