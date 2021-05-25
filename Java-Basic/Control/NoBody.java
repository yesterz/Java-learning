/**
 * File: NoBody.java
 * -----------------
 * The target of a loop can be empty
 */
package Control;

public class NoBody {

    public void run() {
        int i, j ;

        i = 100 ;
        j = 200 ;

        // find midpoint between i and j
        while(++i< --j) ; // no body in this loop
        
        System.out.println("Midpoint is " + i) ;
    } // end run

    public static void main(String args[]) {
        new NoBody().run() ;
    } // end main
} // end NoBody
