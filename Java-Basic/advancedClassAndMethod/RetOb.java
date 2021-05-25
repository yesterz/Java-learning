/**
 * File: RetOb.java
 * ----------------
 * Returning an object
 */
package advancedClassAndMethod;

class Test4 {

    int a ;

    Test4(int i) {
        a = i ;
    } // end Test4

    Test4 incrByTen() {
        Test4 temp = new Test4(a+10) ;
        return temp ;
    } // end incrByTen
} // end Test4

public class RetOb {
    
    public void run() {
        Test4 ob1 = new Test4(2) ;
        Test4 ob2 ;
    
        ob2 = ob1.incrByTen() ;
        System.out.println("ob1.a: " + ob1.a) ;
        System.out.println("ob2.a: " + ob2.a) ;
    
        ob2 = ob2.incrByTen() ;
        System.out.println("ob2.a after second increase: "
            + ob2.a) ;
    } // end run

    public static void main(String args[]) {
        new RetOb().run() ;
    } // end main

} // end RetOb
