/**
 * File: UseStatic.java
 * --------------------
 * Demonstrate static variables, methods, and blocks
 */
package advancedClassAndMethod;

public class UseStatic {
    
    static int a = 3 ;
    static int b ;

    static void meth(int x) {
        System.out.println("x = " + x) ;
        System.out.println("a = " + a) ;
        System.out.println("b = " + b) ;
    } // end meth

    public void run() {
        meth(42) ;
    } // end run

    public static void main(String args[]) {
        new UseStatic().run() ;
    } // end main
} // end Usestatic