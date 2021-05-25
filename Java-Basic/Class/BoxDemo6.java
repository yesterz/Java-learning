/**
 * File: BoxDemo6.java
 * --------------------
 * Here, Box uses a constructor to initialize the
 * dimensions of a box
 */
package Class;

class Box6 {

    double width ;
    double height ;
    double depth ;

    // This is the constructor for Box
    Box6() {
        System.out.println("Constructing Box") ;
        width = 10 ;
        height = 10 ;
        depth = 10 ;
    } // end the constructor

    // compute and return volume
    double volume() {
        return (width * height * depth) ;
    } // end volume
} // end Box6

public class BoxDemo6 {
    
    public void run() {
        // declare, allocate, and initialize Box objects
        Box6 mybox1 = new Box6() ;
        Box6 mybox2 = new Box6() ;

        double vol ;

        // get volume of first box
        vol = mybox1.volume() ;
        System.out.println("Volume is " + vol) ;
        
        // get volume of second box
        vol = mybox2.volume() ;
        System.out.println("Volume is " + vol) ;
    } // end run

    public static void main(String args[]) {
        new BoxDemo6().run() ;
    } // end main
} // end BoxDemo6
