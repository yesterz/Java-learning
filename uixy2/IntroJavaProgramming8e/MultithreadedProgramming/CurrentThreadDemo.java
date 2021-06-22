/**
 * File: CurrentThreadDemo.java
 * ----------------------------
 * Controlling the main Thread.
 */
package IntroJavaProgramming8e.MultithreadedProgramming;

public class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread() ;

        System.out.println("Current thread: " + t) ;
    } // end main
} // end CurrentThreadDemo
