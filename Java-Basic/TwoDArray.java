/**
 * File: TwoDArray.java
 * --------------------
 * Demonstrate a two-dimensional array.
 */
public class TwoDArray {
    
    public static void main(String args[]) {
        int twoD[][] = new int[4][5] ;
        int i, j, k = 0 ;

        for(i=0; i<4; i++) {
            for(j=0; j<5; j++) {
                twoD[i][j] = k ;
                k++ ;
            } // end for inner loop
        } // end for outer loop

        for(i=0; i<4; i++) {
            for(j=0; j<5; j++) {
                System.out.print(twoD[i][j] + " ") ;
            } // end for inner loop
            System.out.println() ;
        } // end for outer loop
    } // end main
} // end TwoDArray
