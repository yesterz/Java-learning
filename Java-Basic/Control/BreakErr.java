/**
 * File: BreakErr.java
 * -------------------
 * This program contains an error
 */
package Control;

public class BreakErr {
    
    public void run() {
        one: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ") ;
        }

        for(int j=0; j<100; j++) {
            if(j == 10) break one ; // WRONG
            System.out.print(j + " ") ;
        } // end for loop
    } // end run

    public static void main(String args[]) {
        new BreakErr().run() ;
    } // end main
} // end BreakErr
