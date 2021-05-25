/**
 * File: IncDex.java
 * ------------------ 
 * Demonstrate ++ operator
 */
public class IncDec {
    
    public void run() {
        int a = 1 ;
        int b = 2 ;
        int c ;
        int d ;
        c = ++b ;
        d = a++ ;
        c++ ;
        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;
        System.out.println("c = " + c) ;
        System.out.println("d = " + d) ;
    } // end run
    public static void main(String args[]) {
        new IncDex().run() ;
    } // end main
} // end IncDex
