/**
 * File: Nested.java
 * -----------------
 * Loops may be nested
 */
package Control;

public class Nested {
    
    public void run() {
        int i, j ;

        for(i=0; i<10; i++) {
            for(j=i; j<10; j++)
                System.out.print(".") ;
            System.out.println() ;
        } // end for loop
    } // end run
    
    public static void main(String args[]) {
        new Nested().run() ;
    } // end main
} // end Nested
