/**
 * File: StringDemo.java
 * ---------------------
 * Demonstrating Strings
 */
package advancedClassAndMethod;

public class StringDemo {
    
    public void run() {
        String strOb1 = "First String" ;
        String strOb2 = "Second String" ;
        String strOb3 = strOb1 + " and " + strOb2 ;

        System.out.println(strOb1) ;
        System.out.println(strOb2) ;
        System.out.println(strOb3) ;
    } // end run

    public static void main(String args[]) {
        new StringDemo().run() ;
    } // end main
} // end StringDemo
