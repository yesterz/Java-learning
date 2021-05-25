/**
 * File: BoxDemo7.java
 * -------------------
 * Here, Box uses a parameterized constructor to
 * initialize the dimensions of a box
 */
package Class;

class Box7 {

    double width ;
    double height ;
    double depth ;

    // This is the constructor for Box
    Box7(double w, double h, double d) {
        width = w ;
        height = h ;
        depth = d ;
    } // end Box7's constructor

    // compute and return volume
    double volume() {
        return (width  * height * depth) ;
    } // end volume
} // end Box7

public class BoxDemo7 {
    
    public void run() {
        // declare, allocate, and initialize Box objects
        Box7 mybox1 = new Box7(10, 20, 15) ;
        Box7 mybox2 = new Box7(3, 6, 9) ;

        double vol ;

        // get volume of first box
        vol = mybox1.volume() ;
        System.out.println("Volume is " + vol) ;

        // get volume of second box
        vol = mybox2.volume() ;
        System.out.println("Volume is " + vol) ;
    } // end run

    public static void main(String args[]) {
        new BoxDemo7().run() ;
    } // end main
} // end BoxDemo7