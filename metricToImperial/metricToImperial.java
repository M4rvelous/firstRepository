/* Should add some inheritance properties and 
exception handling.
*/

package metrictoimperialv2;

import static java.lang.System.out;
import java.util.Scanner;

public class MetricToImperialV2 {

    public static void main(String[] args) {
       
        Scanner letter = new Scanner(System.in);
        String initial ; 
        Scanner number = new Scanner(System.in);
        double x ;
        out.println("Select converter type(L,A,V,M,T)");
        initial = letter.nextLine();
        
        
      
        
        if (initial == "l" || initial == "L"){
            length testLength = new length();
            out.println("Insert meters");
            x = number.nextDouble();          //Scanner Object
            testLength.x = number.nextDouble();
            
            out.println("Select Imperial measurement(F,Y,I)");
            initial = letter.nextLine();
            
             if (initial == "f" || initial == "F"){
                 testLength.feetConvert();
                 testLength.display();
             }
             else if (initial == "y" || initial == "Y"){
                 testLength.yardConvert();
                 testLength.display();
             }
             else if (initial == "i" || initial == "I"){
                 testLength. inchesConvert();
                 testLength.display();
             }
             else {
                 out.println("Invalid Data Entry");
             }
              
            
        }
        else if ( initial == "a" || initial == "A" ) {
            area testArea = new area();
            out.println("Insert square meters");
            x = number.nextDouble();          //Scanner Object
            testArea.x = number.nextDouble();
            
            out.println("Select Imperial measurement(F,Y,I)");
            initial = letter.nextLine();
            
             if (initial == "f" || initial == "F"){
                 testArea.feetConvert();
                 testArea.display();
             }
             else if (initial == "y" || initial == "Y"){
                 testArea.yardConvert();
                 testArea.display();
             }
             else if (initial == "i" || initial == "I"){
                 testArea. inchesConvert();
                 testArea.display();
             }
             else {
                 out.println("Invalid Data Entry");
             }
        }
        else if (initial == "v" || initial == "V") {
            Volume testVolume = new Volume();
            out.println("Insert cubic meters");
            x = number.nextDouble();          //Scanner Object
            testVolume.x = number.nextDouble();
            
            out.println("Select Imperial measurement(F,Y,I)");
            initial = letter.nextLine();
            
             if (initial == "f" || initial == "F"){
                 testVolume.feetConvert();
                 testVolume.display();
             }
             else if (initial == "y" || initial == "Y"){
                 testVolume.yardConvert();
                 testVolume.display();
             }
             else if (initial == "i" || initial == "I"){
                 testVolume. inchesConvert();
                 testVolume.display();
             }
             else {
                 out.println("Invalid Data Entry");
             }
            
        }
        else if (initial == "m" || initial == "M") {
             mass testMass = new mass();
            out.println("Insert cubic meters");
            x = number.nextDouble();          //Scanner Object
            testMass.x = number.nextDouble();
            
            out.println("Select Imperial measurement(P,O)");
            initial = letter.nextLine();
            
             if (initial == "p" || initial == "P"){
                 testMass.poundConvert();
                 testMass.display();
             }
             else if (initial == "o" || initial == "O"){
                 testMass.ounceConvert();
                 testMass.display();
             }
            
             else {
                 out.println("Invalid Data Entry");
             }
            
        }
        else if (initial == "t" || initial == "T"){
            temperature testTemp = new temperature();
            out.println("Insert Celcius");
            x = number.nextDouble();          //Scanner Object
            testTemp.x = number.nextDouble();
            
            testTemp.fahrConvert();
            testTemp.display();
         
        }
        else {
            out.println("Invalid entry");
        }
        
        
    }

}
