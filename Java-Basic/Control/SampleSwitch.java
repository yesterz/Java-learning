/**
 * File: SampleSwitch.java
 * -----------------------
 * A simple example of the switch
 */
package Control;

public class SampleSwitch {
    
    public void run() {
        for(int i=0; i<6; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is zero.") ;
                    break ;
                case 1:
                    System.out.println("i is one.") ;
                    break ;
                case 2:
                    System.out.println("i is two") ;
                    break ;
                case 3:
                    System.out.println("i is three.") ;
                    break ;
                default:
                    System.out.println("i is greater than 3.") ;
            } // end switch
        } // end for loop
    } // end run
    public static void main(String args[]) {
        new SampleSwitch().run();
    } // end main
} // end SampleSwitch
