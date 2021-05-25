/**
 * File: HexByte.java
 * ------------------
 * Masking sign extension
 */
public class HexByte {
    
    public void run() {
        char hex[] = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        } ;
        byte b = (byte) 0xf1 ;

        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]) ;
    } // end run
    static public void main(String args[]) {
        new HexByte().run() ;
    } // end main
} // end HexByte
