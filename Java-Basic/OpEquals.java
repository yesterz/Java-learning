/**
 * File: OpEquals.java
 * -------------------
 * Demonstrate several assignment operators
 */
public class OpEquals {
    
    public void run() {
        int a = 1 ;
        int b = 2 ;
        int c = 3 ;

        a += 5 ;
        b *= 4 ;
        c += a * b ;
        c %= 6 ;
        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;
        System.out.println("c = " + c) ;
    } // end run
    public static void main(String args[]) {
        new OpEquals().run() ;
    } // end main
} // end OpEquals
