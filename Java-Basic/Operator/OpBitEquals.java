/**
 * File: OpBitEquals.java
 * ----------------------
 * 
 */
package Operator;

public class OpBitEquals {
    
    public void run() {
        int a = 1 ;
        int b = 2 ;
        int c = 3 ;

        a |= 4 ;
        b >>= 1 ;
        c <<= 1 ;
        a ^= c ;
        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;
        System.out.println("c = " + c) ;
    } // end run

    public static void main(String args[]) {
        new OpBitEquals().run() ;
    } // end main
} // end OpBitEquals
