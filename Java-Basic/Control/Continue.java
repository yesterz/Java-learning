/**
 * File: Continue.java
 * -------------------
 * Demonstrate continue
 */
package Control;

public class Continue {

    public void run() {
        for(int i=0; i<10; i++) {
            System.out.print(i + " ") ;
            if (i%2 == 0) continue ;
            System.out.println("") ;
        } // end for loop
    } // end run

    public static void main(String args[]) {
        new Continue().run() ;
    } // end main
} // end Continue
