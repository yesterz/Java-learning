/**
 * File: DemoBoxWeight.java
 * ------------------------
 * This program uses inheritance to extend Box
 */
package Inheritance;

import Class.BoxDemo7;

class Box8{

    double width ;
    double height ;
    double depth ;

    // construct clone of an object
    Box8(Box8 ob) { // pass object to construct
        width = ob.width ;
        height = ob.height ;
        depth = ob.depth ;
    } // end constructor Box8

    // constructor used when all dimensions specified
    Box8(double w, double h, double d) {
        width = w ;
        height = h ;
        depth = d ;        
    } // end constructor Box8

    // constructor used when no dimensions specified
    Box8() {
        width = -1 ; // use -1 to indicate
        height = -1 ; // an uninitialized
        depth = -1 ; // box
    } // end constructor Box8

    // constructor used when cube is created
    Box8(double len) {
        width = height = depth = len ;
    } // end constructor Box8

    // compute and return volume
    double volume() {
        return (width * height * depth) ;
    } // end volume
 } // end Box8

 // constructor for BoxWeight
 
 class BoxWeight extends Box8 {

    double weight ; // weight of box

    // constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w ;
        height = h ;
        depth = d ;
        weight = m ;
    } // end BoxWeight

 }  // end BoxWeight
 
public class DemoBoxWeight {
    
    public void run() {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3) ;
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076) ;
        double vol ;

        vol = mybox1.volume() ;
        System.out.println("Volume of mybox1 is " + vol) ;
        System.out.println("Weight of mybox1 is " + mybox1.weight) ;
        System.out.println() ;

        vol = mybox2.volume() ;
        System.out.println("Volume of mybox2 is " + vol) ;
        System.out.println("Weight of mybox2 is " + mybox2.weight) ;
    } // end run

    public static void main(String args[]) {
        new DemoBoxWeight().run() ;
    } // end main
} // end DemoBoxWeight
