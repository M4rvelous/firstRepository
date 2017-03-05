// A simple program inspired originally by the freeCodeCamp challenge called counting cards
// This was originally written in Java script. 

//Original problem
//In the casino game Blackjack, a player can gain an advantage over the house by keeping track of the relative number of high and low cards remaining in the deck. This is called Card Counting.
//Having more high cards remaining in the deck favors the player. Each card is assigned a value according to the table below. When the count is positive, the player should bet high. When the count is zero or negative, the player should bet low.
//You will write a card counting function. It will receive a card parameter and increment or decrement the global count variable according to the card's value (see table). The function will then return a string with the current count and the string "Bet" if the count is positive, or "Hold" if the count is zero or negative. The current count and the player's decision ("Bet" or "Hold") should be separated by a single space.


package countingcards;

import static java.lang.System.out;
import  java.util.Scanner;

public class CountingCards {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in) ; 
        int y = 0 ;
       String card ;
       int result = 0; 
 
       for (int i = 0 ; i < 100; i++ ) {
             if ( y == 0) {
       out.println("Enter card or type \"Done\" to exit");
       card = myScanner.nextLine();  
 
       switch (card) {
           case "2" : 
           case "3":
           case "4":
           case "5":
           case "6":
                result = result +1 ;
               break ; 
           case "7" : 
           case "8" :
           case "9" :
               result = result;
               break; 
           case "10" :
           case "A"  :
           case "Q"  :
           case "J"  :
               result = result -1 ;
               break;
           case "Done" :
           case "DONE" :
           case "done":
            
               y = 1; 
            
                 break  ; 
                       }
    
    } else {
                    break ;
   }
               }
         if (result >= 1) {
                   out.println(result +" Bet");     }
                   else  {
                           out.println(result +" Hold");
       }
  
    }
}
