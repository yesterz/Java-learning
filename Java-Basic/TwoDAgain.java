/**
 * File: TwoDAgain.java
 * --------------------
 * Manually allocate differing size second dimensions.
 */

public class TwoDAgain {
    
    public void run() {
        int twoD[][] = new int[4][] ;
        twoD[0] = new int[1] ;
        twoD[1] = new int[2] ;
        twoD[2] = new int[3] ;
        twoD[3] = new int[4] ;

        int i, j, k = 0 ;

        for(i=0; i<4; i++) {
            for(j=0; j<i+1; j++) {
                twoD[i][j] = k ;
                k++ ;
            } // end for inner loop
        } // end for outer loop

        for(i=0; i<4; i++) {
            for(j=0; j<i+1; j++) {
                System.out.print(twoD[i][j] + " ") ;
            } // end for inner loop
            System.out.println() ;
        } // end for outer loop
    } // end run

    public static void main(String args[]) {
        new TwoDAgain().run() ;
    } // end main
} // end TwoDAgain
