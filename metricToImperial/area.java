
package metrictoimperialv2;

import static java.lang.System.out;


public class area {
   
   double x ; // square meters
   double y = Math.pow(3.28 , 2)  ; //square feet
   double a = Math.pow(1.09 , 2) ;//square yards
   double b = Math.pow(39.37 , 2) ;  //square inches 
   
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
