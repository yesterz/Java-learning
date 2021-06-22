/**
 * File: AccountBalance.java
 * -------------------------
 * A simple package
 */

package packageAndInterface.MyPack;

class Balance {
    String name ;
    double bal ;

    Balance(String n, double b) {
        name = n ;
        bal = b ;
    } // end balance

    void show() {
        if (bal < 0) {
            System.out.println("--> ") ;
        }
        System.out.println(name + ": $" + bal) ;
    } // end show
} // end Balance

public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3] ;

        current[0] = new Balance("K. J. Fielding", 123.23) ;
        current[1] = new Balance("Will Tell", 157.02) ;
        current[2] = new Balance("Tom Jackson", -12.23) ;

        for (int i=0; i<3; i++) {
            current[i].show() ;
        } // end for loop
    } // end main
} // end AccountBalance