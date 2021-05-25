/**
 * File: AccessTest.java
 * ---------------------
 * This program demonstrates the difference
 * between public and private
 */
package advancedClassAndMethod;

class Test5 {

    int a ; // default access
    public int b ; // public access
    public int c ; // private access

    // methods to access c
    void setc(int i) { // set c's value
    c = i ;
    } // end setc

    int getc() { // get c's value
        return c ;
    } // end getc
} // end Test

public class AccessTest {

    public void run() {
        Test5 ob = new Test5() ;

        // These are OK, a and b may be accessed directly
        ob.a = 10 ;
        ob.b = 20 ;

        // This is not OK and will cause an error
        // ob.c = 100 ; // Error!

        // You must access c through its methods
        ob.setc(100) ; // OK
        System.out.println("a, b, and c: " + ob.a + " " +
            ob.b + " " + ob.getc()) ;
    } // end run

    public static void main(String args[]) {
        new AccessTest().run() ;
    } // end main

} // end AccessTest