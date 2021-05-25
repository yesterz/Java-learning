/**
 * File: FindPrime.java
 * --------------------
 * Test for primes
 */
package Control;

public class FindPrime {
    
    public void run() {
        int num ;
        boolean isPrime = true ;

        num = 14 ;
        for(int i=2; i <= num/2; i++) {
            if((num % i) == 0) {
                isPrime = false ;
                break ;
            } // end if
        } // end for
        if(isPrime) System.out.println("Prime") ;
        else System.out.println("Not Prime") ;
    } // end run

    public static void main(String args[]) {
        new FindPrime().run() ;
    } // end main
} // end FindPrime
