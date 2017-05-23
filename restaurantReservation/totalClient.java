
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
void displayAllNames() {
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

int sum1= 0 , sum2= 0  , sum3 = 0 ,  sum4=0 , sum5=0 , sum6=0 , sum7=0 , sum8=0 , sum9=0,  sum10=0;

void sumOfAllTables(){
 for (int i = 0 ; i < totalTableNums.size(); i++){
     if (totalTableNums.get(i).equals(1)){
         sum1 ++ ; 
     }
     else if (totalTableNums.get(i).equals(2)){
         sum2 ++ ; 
 }
    else if (totalTableNums.get(i).equals(3)){
         sum3 ++ ; 
    
}
    else if (totalTableNums.get(i).equals(4)){
         sum4 ++ ; 
     }
     else if (totalTableNums.get(i).equals(5)){
         sum5 ++ ; 
     }
     else if (totalTableNums.get(i).equals(6)){
         sum6 ++ ; 
     }
     else if (totalTableNums.get(i).equals(7)){
         sum7 ++ ; 
     }    
     else if (totalTableNums.get(i).equals(8)){
         sum8 ++ ; 
     }
     else if (totalTableNums.get(i).equals(9)){
         sum9 ++ ; 
     }
     else if (totalTableNums.get(i).equals(10)){
         sum10 ++ ; 
     }
     else{
         
     }
  

 }
 }
void totalTablePercentages(){
    
out.println("Table 1:"+(sum1*100)/totalTableNums.size() + "%" );
out.println("Table 2:"+(sum2*100)/totalTableNums.size() + "%" );
out.println("Table 3:"+(sum3*100)/totalTableNums.size() + "%" );
out.println("Table 4:"+(sum4*100)/totalTableNums.size() + "%" );
out.println("Table 5:"+(sum5*100)/totalTableNums.size() + "%" );
out.println("Table 6:"+(sum6*100)/totalTableNums.size() + "%" );
out.println("Table 7:"+(sum7*100)/totalTableNums.size() + "%" );
out.println("Table 8:"+(sum8*100)/totalTableNums.size() + "%" );
out.println("Table 9:"+(sum9*100)/totalTableNums.size() + "%" );
out.println("Table 10:"+(sum10*100)/totalTableNums.size() + "%" );
               
}
}
