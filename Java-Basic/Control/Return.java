/**
 * File: Return.java
 * -----------------
 * Demonstrate return
 */
package Control;

public class Return {

    public void run() {
        boolean t = true ;

        System.out.println("Before the return") ;
        if(t) return ; // return to caller
        System.out.println("This won't execute.") ; // unreachable code
    } // end run
    
    public static void main(String args[]) {
        new Return().run() ;
    } // end main
} // end Return
