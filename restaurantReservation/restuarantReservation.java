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
       totalClient newTotalClient = new totalClient();
        
       while (x.equals("y") ){
          
           
           out.println("Enter name.");
           Scanner addNames = new Scanner(System.in);
           String y = addNames.nextLine();
           newClient.names.add(y);
           newTotalClient.totalNames.add(y);
           
           out.println("Enter Reservation Time");
           double a = addNewClient.nextDouble();
           newClient.times.add(a);
           newTotalClient.totalTimes.add(a);
           
           out.println("Enter table number");
           int b = addNewClient.nextInt();
           newClient.tableNums.add(b);
           newTotalClient.totalTableNums.add(b);
           
           out.println("Enter people");
           int c = addNewClient.nextInt();
           newClient.persons.add(c);
           newTotalClient.totalPersons.add(c);
           
           Scanner checkClient = new Scanner(System.in);
           out.println("Add new client?");
           x = checkClient.nextLine();
            
       }
      
       
        newClient.display();
        newClient.displayNames();
        newClient.sumClients();
        newClient.sumOfTables();
        newClient.tablePercentages();
                
     
    }

}
