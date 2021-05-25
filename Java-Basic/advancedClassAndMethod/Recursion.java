/**
 * File: Recursion.java
 * --------------------
 * A simple example of recursion
 */
package advancedClassAndMethod;

class Factorial {

    // this is a recursive function
    int fact(int n) {
        int result ;

        if(n==1) return 1 ;
        result = fact(n-1) * n ;
        return result ;
    } // end fact
} // end Factorial

public class Recursion {
    
    public void run() {
        Factorial f = new Factorial() ;
        System.out.println("Factorial of 3 is " + f.fact(3)) ;
        System.out.println("Factorial of 4 is " + f.fact(4)) ;
        System.out.println("Factorial of 5 is " + f.fact(5)) ;
    } // end run

    public static void main(String args[]) {
        new Recursion().run() ;
    } // end main

} // end Recursion
