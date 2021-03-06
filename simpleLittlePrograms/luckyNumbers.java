/*Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

        luckySum(1, 2, 3) → 6
        luckySum(1, 2, 13) → 3
        luckySum(1, 13, 3) → 1 */

import static java.lang.System.out;

public class Main {

    public static int luckySum(int a, int b, int c) {

        int sum = 0 ;

        if (a == 13) {
            sum = 0 ;
        }
        else if(b == 13) {
            sum = a ;
        }
        else if (c == 13) {
            sum = a + b ;
        }
        else {
            sum = a + b +c ;
        }
        return sum ;
    }

    public static void main(String[] args) {


        out.println(luckySum(13 , 1 , 4)); 
        out.println(luckySum(14 , 13 , 54));
        out.println(luckySum(12 , 11 , 13));
        out.println(luckySum( 1 , 58 , 12 ));

    }
}
