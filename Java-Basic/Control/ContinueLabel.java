/**
 * File: ContinueLabel.java
 * ------------------------
 * Using continue with a label
 */
package Control;

public class ContinueLabel {

    public void run() {
        outer: for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(j > i) {
                    System.out.println() ;
                    continue outer ;
                } // end if statements
                System.out.print(" " + (i*j)) ;
            } // end inner for loop
        } // end outer for loop label
        System.out.println() ;
    } // end run

    public static void main(String args[]) {
        new ContinueLabel().run() ;
    } // end main
} // end ContinueLabel
