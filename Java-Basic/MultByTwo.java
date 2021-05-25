/**
 * File: MultByTwo.java
 * --------------------
 * Left shifting as a quick way to multiply by 2
 */
public class MultByTwo {
    
    public void run() {
        int i ;
        int num = 0xFFFFFFE ;

        for(i=0; i<4; i++) {
            num = num << 1 ;
            System.out.println(num) ;
        } // end for loop
    } // end run

    public static void main(String args[]) {
        new MultByTwo().run() ;
    } // end main
} // end MultByTwo
