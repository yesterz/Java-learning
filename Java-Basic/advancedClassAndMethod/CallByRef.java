/**
 * File: CallByRef.java
 * --------------------
 * Objects are passed by reference
 */
package advancedClassAndMethod;

class Test3 {
    int a, b ;

    Test3(int i, int j) {
        a = i ;
        b = j ;
    } // end Test3

    // pass an object
    void meth(Test3 o) {
        o.a *= 2 ;
        o.b /= 2 ;
    } // end meth
} // end Test3
public class CallByRef {
    
    public void run() {
        Test3 ob = new Test3(15, 20) ;
        System.out.println("ob.a and ob.b before call: " +
            ob.a + " " + ob.b) ;
        ob.meth(ob) ;
        System.out.println("ob.a and ob.b after call: " +
            ob.a + " " + ob.b) ;
    } // end run

    public static void main(String args[]) {
        new CallByRef().run() ;
    } // end main
} // end CallByRef