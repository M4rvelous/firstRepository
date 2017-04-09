/* A relatively simple program which simulates a primitive ticket issuing system.
Tickets are divided into three different categories with the different prices, and
so is the discount options that the operator has. Finally the program also gives
the possibility of issuing directly a return ticket. Sooner or later I want to
build a GUI version of this program and add several other different functions in
there, like possible discounts for return tickets and a baggage charging system
which will be relative to the weight of the luggage. 
*/
package busservice;

import static java.lang.System.out;
import java.util.Scanner;


public class BusService {

    public static void main(String[] args) {
        
       out.println("Choose destination(1,2,3)");           //each number represents a ticket price
       Scanner destination = new Scanner(System.in);
       int dest = destination.nextInt();
       double x = 0;                                      // price of the ticket, initiazized it a zero for convenience  
      
       try {                                               //exception handling to handle other numbers 
       if (dest == 1){                                      // price change depending on the ticket
         x = 45.50;
       }
       else if(dest == 2)
       {
         x = 50.60;
      }       
       else {
            x = 25.20;
       }
       }
       catch(Exception e) {
            out.println("Invalid Entry"); 
       }
       
        Scanner name = new Scanner(System.in);
        Scanner dis = new Scanner(System.in);
        
        out.println("Enter Name");                          // inserting the passenger's name
        String client = name.nextLine();
        out.println("Enter discount rate perchentage(0%,10%,25%,50%)");        // discount rate selection 
        double discount = dis.nextDouble();
        
        try{                                                // exception handling of wrong discount rates
        if (discount == 10) {
            x = x - (x*0.1);
        }
        else if (discount == 25 ) {
        x = x - (x*0.25);
        }
        else if (discount == 50) {
            x = x - (x*0.5);
        }
        else if (discount == 0) {
            
        }
        else  {
            out.println("Invalid discount rate");
        }
        } catch (Exception  e) {
           out.println("Invalid Entry");  
        }
        
        out.println("Would you like a return ticket as well?(y,n)");        // ossibility of issuing a return ticket as well
        Scanner ret = new Scanner(System.in);
        String returnTicket = ret.nextLine();
        
        if (returnTicket == "y"){
            x = x *2;
        }
        else if (returnTicket == "n") {
            
        }
        else {
            out.println("No extra ticket will be charged");                 //invalid entry means non extra ticket will be charged
        }
        
        out.println("-----------------");                                   // printing the ticket and all the relative data 
        out.println("Client:"+client);
        out.println("Price:$"+x);
        out.println("Discount percentage:" + discount + "%");
        
         
        if (returnTicket == "y"){
           out.println("Return Ticket:Yes");
        }
        else   {
            out.println("Return Ticket:No");
        }
        out.println("Thank you and have a great trip!");
        out.println("-----------------");
        
                }
}
