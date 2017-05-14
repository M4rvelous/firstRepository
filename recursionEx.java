package com.company;

// a series of solutions to simple recursion problems

import java.util.Random;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
    
    //calculating the sum of all the elements of an array(two different ways)
    
	Random myRandom = new Random(10) ;
        int [] a = new int[10];
        int sum = 0  ;
        int x = 0 ;

        for ( int i = 0 ; i < 10 ; i++) {
            a[i] = myRandom.nextInt();
            sum = x + a[i];
            x = sum ;

        }
        out.println("Sum is " + x ) ;

        // or

        for ( int i =  0  ; i !=a.length ; i++ ) {
            sum = sum + a[i];
        }
        out.println("Sum is " + sum) ;
	
	// reversing the elements of an array composed of Strings

        String[] b =  {"k ", "e", "w" , "q", "o", "b"} ;

        for (int i = b.length -1 ; i >= 0 ; i--) {
          out.println(b[i] + " ") ;
        }
	
	//detecting how many times the number 11 can be found in the array 
	
	 int[] a = {11, 11, 11, 25 , 45 , 4 , 7 , 11 , 22 , 11 , 58 , 88   };
        int counter = 0; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 11) {
                counter = counter + 1;

            } else {

            }
        }
        out.println(counter);


        }


    }

