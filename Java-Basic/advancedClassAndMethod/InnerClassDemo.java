/**
 * File: InnerClassDemo.java
 * -------------------------
 * Demonstrate an inner class
 */
package advancedClassAndMethod;

class Outer {

    int outer_x = 100 ;

    void test() {
        Inner inner = new Inner() ;
        inner.display() ;
    } // end test


    // this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x) ;
        } // end display
    } // end Inner

} // end Outer

public class InnerClassDemo {
    
    public void run() {
        Outer outer = new Outer() ;
        outer.test() ;
    } // end run

    public static void main(String args[]) {
        new InnerClassDemo().run() ;
    } // end main
} // end InnerClassDemo