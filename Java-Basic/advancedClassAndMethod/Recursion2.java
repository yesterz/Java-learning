/**
 * File: Recursion2.java
 * ---------------------
 * Another example that uses recursion
 */
package advancedClassAndMethod;

class RecTest {

    int values[] ;

    RecTest(int i) {
        values = new int[i] ;
    } // end RecTest

    // display array - recursively
    void printArray(int i) {
        if(i==0) return ;
        else printArray(i-1) ;
        System.out.println("[" + (i-1) + "]" + values[i-1]) ;
    } // end printArray
} // end RecTest

public class Recursion2 {
    
    public void run() {

    } // end run

    public static void main(String args[]) {
        RecTest ob = new RecTest(10) ;
        int i;

        for(i=0; i<10; i++) ob.values[i] = i ;
        ob.printArray(10) ;
    } // end main
} // end Recursion2
