/**
 * File: BoxDemo.java
 * ------------------
 * A program that uses the Box class
 * call this file BoxDemo.java
 */
package Class;

class Box {
    double width ;
    double height ;
    double depth ;
} // end Box

// This class declares an object of type Box
public class BoxDemo {
    
    public void run() {
        Box mybox = new Box() ;
        // Box mybox ; // declare reference to object
        // mybox = new Box() ; // allocate a Box object
        double vol ;

        // assign values to mybox's instance variable
        mybox.width = 10 ;
        mybox.height = 20 ;
        mybox.depth = 15 ;

        // compute volume of box
        vol = mybox.width * mybox.height * mybox.depth ;

        System.out.println("Volume is " + vol) ;
    } // end run

    public static void main(String args[]) {
        new BoxDemo().run() ;
    } // end main
} // end BoxDemo
