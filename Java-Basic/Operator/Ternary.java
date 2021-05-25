/**
 * File: Ternary.java
 * ------------------
 * Demonstrate ?
 */
package Operator;

public class Ternary {
    
    public void run() {
        int i, k ;
        i = 10 ;
        k = i < 0 ? -i : i ; // get absolute value of i
        System.out.print("Absolute value of ") ;
        System.out.println(i + " is " + k) ;
        i = -10 ;
        k = i < 0 ? -i : i ; // get absolute value of i
        System.out.print("Absolute value of ") ;
        System.out.println(i + " is " + k) ;
    } // end run

    public static void main(String args[]) {
        new Ternary().run() ;
    } // end main
} // end Ternary
