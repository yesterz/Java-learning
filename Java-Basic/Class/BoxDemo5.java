/**
 * File: BoxDemo5.java
 * -------------------
 * This program uses a parameterized method
 */
package Class;

class Box5 {
    
    double width ;
    double height ;
    double depth ;

    // compute and return volume
    double volume() {
        return (width * height * depth) ;
    } // end volume

    // sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w ;
        height = h ;
        depth = d ;
    } // end setDim
} // end Box5

public class BoxDemo5 {
    
    public void run() {
        Box5 mybox1 = new Box5() ;
        Box5 mybox2 = new Box5() ;
        double vol ;

        // initialize each box
        mybox1.setDim(10, 20, 15) ;
        mybox2.setDim(3, 6, 9) ;

        // get volume of first box
        vol = mybox1.volume() ;
        System.out.println("Volume is " + vol) ;

        // get volume of second box
        vol = mybox2.volume() ;
        System.out.println("Volume is " + vol) ;
    } // end run

    public static void main(String args[]) {
        new BoxDemo5().run() ;
    } // end main
} // end BoxDemo5