/**
 * File: BreakLoop4.java
 * ---------------------
 * Using break to exit from nested loops
 */
package Control;

public class BreakLoop4 {
    
    public void run() {
        outer: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ") ;
            for(int j=0; j<100; j++) {
                if(j == 10) break outer ; // exit both loops
                System.out.print(j + " ") ;
            } // end inner for loop
            System.out.println("This will not print") ;
        } // end outer for loop
        System.out.println("Loops complete.") ;
    } // end run

    public static void main(String args[]) {
        new BreakLoop4().run() ;
    } // end main
} // end BreakLoop4
