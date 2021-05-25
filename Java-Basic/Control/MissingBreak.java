/**
 * File: MissingBreak.java
 * -----------------------
 * In a switch, break statements are optional
 */
package Control;

public class MissingBreak {
    
    
    public void run() {        
        for(int i=0; i<12; i++) {
            switch(i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5") ;
                    break ;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10") ;
                    break ;
                default:
                    System.out.println("i is 10 or more") ;
            } // end switch
        } // end for loop
    } // end run

    public static void main(String args[]) {
        new MissingBreak().run() ;
    } // end main
} // end MissingBreak
