/**
 * File: BreakLoop.java
 * --------------------
 * Using break to exit a loop
 */
package Control;

public class BreakLoop {
    
    public void run() {
        for(int i=0; i<100; i++) {
            if(i == 0) break ; // terminate loop if i is 10
            System.out.println("i: " + i) ;
        } // end for
        System.out.println("Loop complete.") ;
    } // end run
    
    public static void main(String args[]) {
        new BreakLoop().run() ;
    } // end main
} // end BreakLoop
