/**
 * File: Dispatch.java
 * -------------------
 * Dynamic Method Dispatch
 */
package Inheritance;

class A3 {

    void callme() {
        System.out.println("Inside A's callme method") ;
    } // end callme
} // end A

class B3 extends A3 {

    // override callme()
    void callme() {
        System.out.println("Inside B's callme method") ;
    } // end callme
} // end B

class C3 extends A3 {

    // override callme()
    void callme() {
        System.out.println("Inside C's callme method") ;
    } // end callme
} // end C

public class Dispatch {

    public void run() {
        A3 a = new A3() ; // object of type A
        B3 b = new B3() ; // object of type B
        C3 c = new C3() ; // object of type C
        A3 r ; // obtain a reference of type A

        r = a ; // r refers to an A object
        r.callme() ; // call A's version of callme

        r = b ; // r refers to an A object
        r.callme() ; // calls A's version of callme
        r = c ; // r refers to a C object
        r.callme() ; // calls C's version of callme
    } // end run
    public static void main(String args[]) {
        new Dispatch().run() ;
    } // end main
} // end Dispatch
