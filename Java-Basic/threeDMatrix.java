/**
 * File: threeDMatrix.java
 * -----------------------
 * Demonstrate a three-dimensional array
 */
class threeDMatrix {
    
    public void run() {
        int threeD[][][] = new int[3][4][5] ;
        int i, j, k ;
        
        for(i=0; i<3; i++) {
            for(j=0; j<4; j++) {
                for(k=0; k<5; k++) {
                    threeD[i][j][k] = i * j * k ;
                }
            }
        } // end triple for loop

        for(i=0; i<3; i++) {
            for(j=0; j<4; j++) {
                for(k=0; k<5; k++) {
                    System.out.print(threeD[i][j][k] + " ") ;
                }
                System.out.println() ;
            }
            System.out.println() ;
        }
    } // end run
    public static void main(String args[]) {
        new threeDMatrix().run() ;
    } // end main
} // end three-dimensional
