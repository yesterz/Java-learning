/**
 * File: BoxDemo3.java
 * -------------------
 * This program includes a method inside the box class
 */
package Class;

class Box3 {
    double width ;
    double height ;
    double depth ;

    // display volume of a box
    void volume() {
        System.out.print("Volume is ") ;
        System.out.println(width * height * depth) ;
    } // end volume
} // end Box
public class BoxDemo3 {
    
    public void run() {
        Box3 mybox1 = new Box3() ;
        Box3 mybox2 = new Box3() ;

        // assign values to mybox1's instance variables
        mybox1.width = 10 ;
        mybox1.height = 20 ;
        mybox1.depth = 15 ;

        /* assign different values to mybox2's
            instance variables */
        mybox2.width = 3 ;
        mybox2.height = 6 ;
        mybox2.depth = 9 ;

        // display volume of first box
        mybox1.volume() ;
    } // end run

    public static void main(String args[]) {
        new BoxDemo3().run() ;
    } // end main
} // end BoxDemo3
