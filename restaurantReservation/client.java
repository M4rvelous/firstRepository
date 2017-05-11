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
ArrayList<String> names = new ArrayList();
ArrayList<Double> times = new ArrayList();
ArrayList<Integer> tables = new ArrayList();
ArrayList<Integer> tableNums = new ArrayList();
ArrayList<Integer> persons = new ArrayList();

public void display() {
    out.println(fixedData[0]+ names);
    out.println(fixedData[1]+times);
    out.println(fixedData[2]+tableNums);
    out.println(fixedData[3]+persons);
}

public void displayNames(){                 //display names of clients that resereved today
    for (int i= 0 ; i < names.size(); i++){
    out.println(fixedData[0]+ names.get(i));
    }
}

public void sumClients(){               //sums the clients for that evening 
    int sum  = 0 ; 
    for (int i=0 ; i < persons.size(); i++){
    sum = sum + persons.get(i);
}
  out.println("Total Clients:"+sum);
  persons.clear();                     // clears Arraylist, should remain there?
}

int[] tablesArray = { 0,0,0,0,0,0,0,0,0,0}; 
int sum;
public void sumOfTables(){                 //sums reserved tables and sorts how many times a table was reserved that night
     sum = tableNums.size();
    
    for (int i=0; i < tableNums.size(); i++){
    if (tableNums.equals(1)){
        tablesArray[0] ++ ;
    }
    else if (tableNums.equals(2)) {
        tablesArray[1] ++ ;
    }
    else if (tableNums.equals(3)) {
        tablesArray[2] ++ ;
    }
      else if (tableNums.equals(4)) {
        tablesArray[3] ++ ;
    }
    else if (tableNums.equals(5)) {
        tablesArray[4] ++ ;
}
    else if (tableNums.equals(6)) {
        tablesArray[5] ++ ;
    }
    else if (tableNums.equals(7)) {
        tablesArray[6] ++ ;
    }
      else if (tableNums.equals(8)) {
        tablesArray[7] ++ ;
    }
    else if (tableNums.equals(9)) {
        tablesArray[8] ++ ;
    }
     else if (tableNums.equals(10)) {
        tablesArray[9] ++ ;
}
            else{}}}

  public void tablePercentages(){                     // percentahges on table popularity for the night
       for (int i=0; i < 10; i++) {
      out.println("Table"+tablesArray[i]+":"+(tablesArray[i]*100)/sum + "%");
  }
  }

}
