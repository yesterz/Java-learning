/**
 * File: OverloadCons.java
 * -----------------------
 * Here, Box2 defines three constructors to initialize
 * the dimensions of a box various ways
 */
package advancedClassAndMethod;

class Box2 {
    
    double width ;
    double height ;
    double depth ;
    // constructor used when all dimensions specified
    Box2(double w, double h, double d) {
        width = w ;
        height = h ;
        depth = d ;
    } // end Box2

    // constructor used when no dimensions specified
    Box2() {
        width = -1 ; // use -1 to indicate
        height = -1 ; // an uninitialized
        depth = -1 ; // box
    } // end Box2

    // constructor used when cube is created
    Box2(double len) {
        width = height = depth = len ;
    } // end Box2
    
    // compute and ruturn volume
    double volume() {
        return (width * height * depth) ;
    } // end volume
} // end Box2

public class OverloadCons {
    
    public void run() {
        // create boxes using the various constructors
        Box2 mybox1 = new Box2(10, 20, 15) ;
        Box2 mybox2 = new Box2() ;
        Box2 mycube = new Box2(7) ;

        double vol ;

        // get volume of first box
        vol = mybox1.volume() ;
        System.out.println("Volume of mybox1 is " + vol) ;

        // get volume of second box
        vol = mybox2.volume() ;
        System.out.println("Volume of mybox2 is " + vol) ;

        // get volume of cube
        vol = mycube.volume() ;
        System.out.println("Volume of mycube is " + vol) ;
    } // end run

    public static void main(String args[]) {
        new OverloadCons().run() ;
    } // end main
} // end OverloadCons