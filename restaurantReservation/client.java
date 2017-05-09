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


public void display() {
    out.println(fixedData[0]+ names);
    out.println(fixedData[1]+times);
    out.println(fixedData[2]+tableNums);
    out.println(fixedData[3]+persons);
}

}
