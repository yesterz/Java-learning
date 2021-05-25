/**
 * File: ForTick.java
 * ------------------
 * Demonstrate the for loop
 */
package Control;

public class ForTick {
    
    public void run() {
        int n ;

        for(n=10; n>0; n--)
            System.out.println("tick " + n) ;
    } // end run

    // Declare a loop control variable inside the for
    public void otherRun() {
        // here, n is declared inside of the for loop
        for(int n=10; n>0; n--)
            System.out.println("tick " + n) ;
    } // end otherRun
    public static void main(String args[]) {
        new ForTick().otherRun() ;
    } // end main
} // end ForTick
