
package restaurantreservation;

import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author Nick_Marv
 */
public class totalClient {
    
String fixedData[] ={"Name:", "Time of Reservation:", "Table Number:", "People:"};
ArrayList<String> totalNames = new ArrayList();
ArrayList<Double> totalTimes = new ArrayList();
ArrayList<Integer> totaTables = new ArrayList();
ArrayList<Integer> totalTableNums = new ArrayList();
ArrayList<Integer> totalPersons = new ArrayList();

public void display() {
    out.println(fixedData[0]+ totalNames);
    out.println(fixedData[1]+ totalTimes);
    out.println(fixedData[2]+ totalTableNums);
    out.println(fixedData[3]+totalPersons);
}
void displayTotalNames() {
 for (int i= 0 ; i < totalNames.size(); i++){
    out.println(fixedData[0]+ totalNames.get(i));
    }   
}
void sumAllClients(){
     int sum  = 0 ; 
    for (int i=0 ; i < totalPersons.size(); i++){
    sum = sum + totalPersons.get(i);
}
   out.println("Total Clients:"+sum); 
}
int[] tablesArray = { 0,0,0,0,0,0,0,0,0,0}; 
int sum;
void sumOfAllTables(){
   for (int i=0; i < totalTableNums.size(); i++){
    if (totalTableNums.equals(1)){
        tablesArray[0] ++ ;
    }
    else if (totalTableNums.equals(2)) {
        tablesArray[1] ++ ;
    }
    else if (totalTableNums.equals(3)) {
        tablesArray[2] ++ ;
    }
      else if (totalTableNums.equals(4)) {
        tablesArray[3] ++ ;
    }
    else if (totalTableNums.equals(5)) {
        tablesArray[4] ++ ;
}
    else if (totalTableNums.equals(6)) {
        tablesArray[5] ++ ;
    }
    else if (totalTableNums.equals(7)) {
        tablesArray[6] ++ ;
    }
      else if (totalTableNums.equals(8)) {
        tablesArray[7] ++ ;
    }
    else if (totalTableNums.equals(9)) {
        tablesArray[8] ++ ;
    }
     else if (totalTableNums.equals(10)) {
        tablesArray[9] ++ ;
}
            else{}}
}
void totaltablePercentage(){
    for (int i=0; i < 10; i++) {
      out.println("Table"+tablesArray[i]+":"+(tablesArray[i]*100)/sum + "%");
  } 
}
}
