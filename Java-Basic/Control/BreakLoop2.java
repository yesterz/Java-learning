/**
 * File: BreakLoop2.java
 * ---------------------
 * Using break to exit a while loop
 */
package Control;

public class BreakLoop2 {
    
    public void run() {
        int i = 0 ;

        while(i < 100) {
            if(i == 10) break ; // terminate loop if i is 10
            System.out.println("i: " + i) ;
            i++ ;
        } // end while
        System.out.println("Loop complete.") ;
    } // end run
    public static void main(String args[]) {
        new BreakLoop2().run() ;
    } // end main
} // end BreakLoop2
