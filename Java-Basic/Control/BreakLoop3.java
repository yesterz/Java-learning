/**
 * File: BreakLoop3.java
 * ---------------------
 * Using break to exit a while loop
 */
package Control;

public class BreakLoop3 {
    
    public void run() {
        for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ") ;
            for(int j=0; j<100; j++) {
                if(j == 10) break ; // terminate loop if j is 10
                System.out.print(j + " ") ;
            } // end inner for loop
            System.out.println() ;
        } // end outer for loop
        System.out.println("Loops complete.") ;
    } // end run
    public static void main(String args[]) {
        new BreakLoop3().run() ;
    } // end main
} // end BreakLoop3
