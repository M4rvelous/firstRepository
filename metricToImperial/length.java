
package metrictoimperialv2;

import static java.lang.System.out;
import java.util.Scanner;


public class length {
    
   double x ; //meters
   double y = 3.28 ; // feet
   double a = 1.09 ; // yards
   double b = 39.37 ;  // inches 
   
   public void setMeters() {
       this.x = x ;
   }
   
   public double feetConvert() {
       x = x * y ; 
       return x ; 
   }
   
   public double yardConvert(){
       x = x * a; 
       return x ; 
   }
   
   public double inchesConvert(){
       x = x * b ;
       return x ; 
   }
   
   public void display(){
       out.println(x);
   }
   
}
