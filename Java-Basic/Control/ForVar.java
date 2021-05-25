/**
 * File: ForVar.java
 * -----------------
 * Parts of the for loop can be empty
 */
package Control;

public class ForVar {
    
    public void run() {
        int i ;
        boolean done = false ;

        i = 0 ;
        for( ; !done; ) {
            System.out.println("i is " + i) ;
            if(i == 10) done = true ;
            i++ ;
        } // end for loop
    } // end run

    public static void main(String args[]) {
        new ForVar().run() ;
    } // end main
} // end ForVar
