/**
 * File: Box.java
 * --------------
 * overload class Box constructor
 */
package advancedClassAndMethod;

public class Box {
    
    double width ;
    double height ;
    double depth ;

    // This is the constructor for Box
    Box(double w, double h, double d) {
        width = w ;
        height = h ;
        depth = d ;
    } // end Box

    // compute and return volume
    double volume() {
        return (width * height * depth ) ;
    } // end volume
} // end Box
