/**
 * File: OverloadCons2.java
 * ------------------------
 * Here, Box allows one object to initialize another
 */
package advancedClassAndMethod;

class Box3 {

    double width ;
    double height ;
    double depth ;

    // construct clone of an object
    Box3(Box3 ob) { // pass object to constructor
        width = ob.width ;
        height = ob.height ;
        depth = ob.depth ;
    } // end Box3

    Box3(double w, double h, double d) {
        width = w ;
        height = h ;
        depth = d ;
    } // end Box3

    // constructor used when no dimensions specified
    Box3() {
        width = -1 ; // use -1 to indicate
        height = -1 ; // an uninitialized
        depth = -1 ; // box
    } // end Box3

    // constructor used when cube is created
    Box3(double len) {
        width = height = depth = len ;
    } // end Box3

    double volume() {
        return (width * height * depth) ;
    } // end volume
} // end Box2

public class OverloadCons2 {
    
    public void run() {
        // create boxes using the various constructors
        Box3 mybox1 = new Box3(10, 20, 15) ;
        Box3 mybox2 = new Box3() ;
        Box3 mycube = new Box3(7) ;

        Box3 myclone = new Box3(mybox1) ;

        double vol ;
        // get volume of first box
        vol = mybox1.volume() ;
        System.out.println("volume of mybox1 is " + vol) ;
        // get volume of second box
        vol = mybox2.volume() ;
        System.out.println("volume of mybox2 is " + vol) ;        
        // get volume of cube
        vol = mycube.volume() ;
        System.out.println("volume of cube is " + vol) ;

        // get volume of clone
        vol = myclone.volume() ;
        System.out.println("Volume of clone is " + vol) ;
    } // end run

    public static void main(String args[]) {
        new OverloadCons2().run() ;
    } // end main
} // end OverloadCons2