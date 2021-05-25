/**
 * File: CallByValue.java
 * ----------------------
 * Simple types are passed by value
 */
package advancedClassAndMethod;

class Test2 {
    void meth(int i, int j) {
        i *= 2 ;
        j /= 2 ;
    } // end meth
} // end Test2

public class CallByValue {
    
    public void run() {
        Test2 ob = new Test2() ;
        int a = 15, b = 20 ;
        System.out.println("a and b before call: " +
            a + " " + b) ;
        ob.meth(a, b) ;
        System.out.println("a and b after call: " +
            a + " " + b) ;
    }  // end run

    public static void main(String args[]) {
        new CallByValue().run() ;
    } // end main
} // end CallByValue
