/**
 * File: ByteShift.java
 * --------------------
 * Left shifting a byte value
 */
public class ByteShift {
    
    public void run() {
        byte a = 64, b ;
        int i ;

        i = a << 2 ;
        b = (byte) (a << 2) ;

        System.out.println("Original value of a: " + a) ;
        System.out.println("i and b: " + i + " " + b) ;
    } // end run

    public static void main(String args[]) {
        new ByteShift().run() ;
    } // end main
} // end ByteShift
