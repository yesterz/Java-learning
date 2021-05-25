/**
 * File: StaticByName.java
 * -----------------------
 * balabala
 */
package advancedClassAndMethod;

class StaticDemo {
    
    static int a = 42 ;
    static int b = 99 ;
    static void callme() {
        System.out.println("a = " + a) ;
    } // end call me
} // end StaticDemo

public class StaticByName {

    public void run() {
        StaticDemo.callme() ;
        System.out.println("b = " + StaticDemo.b) ;
    } // end run

    public static void main(String args[]) {
        new StaticByName().run() ;
    } // end main
} // end StaticByName
