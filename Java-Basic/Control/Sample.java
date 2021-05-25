/**
 * File: Sample.java
 * -----------------
 * balabala
 */
package Control;

public class Sample {
    
    public void run() {
        int a, b ;
        b = 4 ;
        for(a=1; a<b; a++) {
            System.out.println("a = " + a) ;
            System.out.println("b = " + b) ;
            b-- ;
        } // end for loop
    } // end run
    public static void main(String args[]) {
        new Sample().run() ;
    } // end main
} // end Sample
