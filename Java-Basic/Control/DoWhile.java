/**
 * File: DoWhile.java
 * ------------------
 * Demonstrate the do-while loop
 */
package Control;

public class DoWhile {
    
    public void run() {
        int n = 10 ;

        do {
            System.out.println("tick " + n) ;
        } while(--n > 0) ;
    } // end run

    public static void main(String args[]) {
        new DoWhile().run() ;
    } // end main
} // end DoWhile