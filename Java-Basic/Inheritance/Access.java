/**
 * File: Access.java
 * ------------------
 * In a class hierarchy, private members remain
 * private to their class.
 * This program contains an error and will not 
 * compile.
 */
package Inheritance;

// Create a superclass.
class A2 {
    int i ; // public by default
    private int j ; // private to A

    void setij(int x, int y) {
        i = x ;
        j = y ;
    } // end setij
} // end A

// A's j is not accessible here
class B2 extends A2 {

    int total ;

    void sum() {
        total = i + j ; // ERROR, j is not accessible here
    } // end sum
} // end B2

public class Access {
    
    public void run() {
        B2 subOb = new B2() ;

        subOb.setij(10, 12) ;

        subOb.sum() ;
        System.out.println("Total is " + subOb.total) ;
    } // end run

    public static void main(String args[]) {
        new Access().run() ;
    } // end main
} // end Access


/**
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        The field A2.j is not visible
 */