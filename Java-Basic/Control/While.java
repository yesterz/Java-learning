/**
 * File: While.java
 * ----------------
 * Demonstrate the while loop
 */
package Control;

public class While {
    

    public void run() {
        int n = 10 ;

        while(n > 0) {
            System.out.println("tick " + n) ;
            n-- ;
        } // end while loop
    } // end run
    public static void main(String args[]) {
        new While().run() ;
    } // end main
} // end While
