/**
 * File: OverloadDemo.java
 * -----------------------
 * Demonstrate method overloading
 */
package advancedClassAndMethod;

class OverloadDemo {
    
    void test() {
        System.out.println("No parameters") ;
    } // end test

    // Overload test for one integer parameter
    void test(int a) {
        System.out.println("a: " + a) ;
    } // end test

    // Overload test for two integer parameters
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b) ;
    } // end test

    // Overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a) ;
        return (a*a) ;
    } // end test
} // end OverloadDemo

class Overload {

    public void run() {
        OverloadDemo ob = new OverloadDemo() ;
        double result ;

        // call all versions of test()
        ob.test() ;
        ob.test(10) ;
        ob.test(10, 20) ;
        result = ob.test(123.25) ;
        System.out.println("Result of ob.test(123.25)") ;
    } // end run

    public static void main(String args[]) {
        new Overload().run() ;
    } // end main
} // end Overload
