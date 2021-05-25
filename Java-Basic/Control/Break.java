/**
 * File: Break.java
 * ----------------
 * Using break as a civilized form of goto
 */
package Control;

public class Break {
    
    public void run() {
        boolean t = true ;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.") ;
                    if(t) break second ; // break out of second block
                    System.out.println("This won't execute") ;
                } // end third block
                System.out.println("This won't execute") ;
            } // end second block
            System.out.println("This is after second block.") ;
        } // end first block
    } // end run
    
    public static void main(String args[]) {
        new Break().run() ;
    } // end main
} // end Break
