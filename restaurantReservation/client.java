// should add methods for sorting arraylists

package restaurantreservation;

import static java.lang.System.out;
import java.util.*;

/**
 *
 * @author Nick_Marv
 */
public class client {

String fixedData[] ={"Name:", "Time of Reservation:", "Table Number:", "People:"};
ArrayList names = new ArrayList();
ArrayList times = new ArrayList();
ArrayList tables = new ArrayList();
ArrayList tableNums = new ArrayList();
ArrayList persons = new ArrayList();
ArrayList sumOfPeople = new ArrayList();

public void display() {
    out.println(fixedData[0]+ names);
    out.println(fixedData[1]+times);
    out.println(fixedData[2]+tableNums);
    out.println(fixedData[3]+persons);
}

public void displayNames(){
    out.println(fixedData[0]+ names);
}


public void sumClients(){
    int sum = 0 ;
    
    for (int i=0 ; i < persons.size(); i++){
    sum = sum + persons.get(i);
}
  out.println("Total Clients:"+sum);
  persons.clear();              // clears Arraylist, should remain there?
}

public void sumOfTables(){
    int sum =  tableNums.size();       // sum of reserved tables for the night
    
    ArrayList tableCounters = new ArrayList();
    
    for (int i=0; i< tableNums.size(); i++){
      while  (tableCounters.contains(tableNums.get(i))) {
           tableCounters.set(i,tableNums.get(i));
      }
    }
}


}
