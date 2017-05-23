

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
 // persons.clear();                     // clears Arraylist, should remain there?
}

int[] tablesArray = { 1,2,3,4,5,6,7,8,9,10}; 
int sum = tableNums.size();
int sum1= 0 , sum2= 0  , sum3 = 0 ,  sum4=0 , sum5=0 , sum6=0 , sum7=0 , sum8=0 , sum9=0,  sum10=0;

public void sumOfTables(){                 //sums reserved tables and sorts how many times a table was reserved that night
    for (int i = 0; i< tableNums.size() ; i++){
     if (tableNums.get(i).equals(1)){
         sum1 ++ ; 
     }  
     else if (tableNums.get(i).equals(2)){
         sum2 ++ ; 
    }
     else if (tableNums.get(i).equals(3)){
         sum3 ++ ; 
     }
     else if (tableNums.get(i).equals(4)){
         sum4 ++ ; 
     }
     else if (tableNums.get(i).equals(5)){
         sum5 ++ ; 
     }
      else if (tableNums.get(i).equals(6)){
         sum6 ++ ; 
     }
      else if (tableNums.get(i).equals(7)){
         sum7 ++ ; 
     }
      else if (tableNums.get(i).equals(8)){
         sum8 ++ ; 
     }
      else if (tableNums.get(i).equals(9)){
         sum9 ++ ; 
     }
      else if (tableNums.get(i).equals(10)){
         sum10 ++ ; 
     }
      else {
          
      }
}
}
  public void tablePercentages(){                     // percentahges on table popularity for the night
     
out.println("Table 1:"+(sum1*100)/tableNums.size() + "%" );
out.println("Table 2:"+(sum2*100)/tableNums.size() + "%" );
out.println("Table 3:"+(sum3*100)/tableNums.size() + "%" );
out.println("Table 4:"+(sum4*100)/tableNums.size() + "%" );
out.println("Table 5:"+(sum5*100)/tableNums.size() + "%" );
out.println("Table 6:"+(sum6*100)/tableNums.size() + "%" );
out.println("Table 7:"+(sum7*100)/tableNums.size() + "%" );
out.println("Table 8:"+(sum8*100)/tableNums.size() + "%" );
out.println("Table 9:"+(sum9*100)/tableNums.size() + "%" );
out.println("Table 10:"+(sum10*100)/tableNums.size() + "%" );
               
  }
 
 void clear(){               // clears all ArrayLists
    names.clear();
    times.clear();
    tables.clear();
    tableNums.clear();
    persons.clear();
}

}
