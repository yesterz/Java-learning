/**
 * File: Comma.java
 * ----------------
 * Using the comma
 */
package Control;

public class Comma {
    
    public void run() {
        int a, b ;
        for(a=1, b=4; a<b; a++, b--) {
            System.out.println("a = " + a) ;
            System.out.println("b = " + b) ;
        } // end for loop
    } // end run

    public static void main(String args[]) {
        new Comma().run() ;
    } // end main
} // end Comma
