/**
 * File: SimpleInheritance.java
 * ----------------------------
 * A simple example of ingeritance
 */

package Inheritance;

// Create a supercalss
class A {

    int i, j ;
    void showij() {
        System.out.println("i and j: " + i + " " + j) ;
    } // end showij
} // end A

class B extends A {

    int k ;

    void showk() {
        System.out.println("k: " + k) ;
    } // end showk

    void sum() {
        System.out.println("i+j+k: " +(i+j+k)) ;
    } // end sum
} // end B

public class SimpleInheritance {
    
    public void run() {
        A superOb = new A() ;
        B subOb = new B() ;

        // The superclass may be used by itself
    } // end run

    public static void main(String args[]) {
        new SimpleInheritance().run() ;
    } // end main
} // end SimpleInheritance
