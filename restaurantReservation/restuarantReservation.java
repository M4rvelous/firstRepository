// A restaurant reservation program.
// Add exception handling.

package restaurantreservation;

import com.sun.glass.ui.SystemClipboard;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Nick_Marv
 */
public class RestaurantReservation {

    public static void main(String[] args) {
        
       Scanner addNewClient = new Scanner(System.in);
       out.println("Add new client?");
       String x = addNewClient.nextLine();
       client newClient = new client();
        
       if (x.equals("y") ){
           do{
          
           out.println("Enter name.");
           String y = addNewClient.nextLine();
           newClient.names.add(y);
           
           out.println("Enter Reservation Time");
           double a = addNewClient.nextDouble();
           newClient.times.add(a);
           
           out.println("Enter table number");
           int b = addNewClient.nextInt();
           newClient.tableNums.add(b);
           
           out.println("Enter people");
           int c = addNewClient.nextInt();
           newClient.persons.add(c);
        
            out.println("Add new client?");
            x = addNewClient.nextLine();
           }while(x.equals("y"));
       }
       else {
           
       }
       
        newClient.display();
     
    }

}
