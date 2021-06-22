/**
 * File: TaskThreadDemo.java
 * -------------------------
 * show the thread's basic usages
 */
package IntroJavaProgramming8e.MultithreadedProgramming;

public class TaskThreadDemo {
    
    public static void main(String[] args) {
        // Create tasks
        Runnable printA = new PrintChar('a', 10000) ;
        Runnable printB = new PrintChar('b', 10000) ;
        Runnable print100 = new PrintNum(10000) ;

        // Create threads
        Thread thread1 = new Thread(printA) ;
        Thread thread2 = new Thread(printB) ;
        Thread thread3 = new Thread(print100) ;

        // Start threads
        thread1.start() ;
        thread2.start() ;
        thread3.start() ;
    } // end main
} // end TaskThreadDemo

// The task for printing a character a specified number of times
class PrintChar implements Runnable {
    private char charToPrint ; // The character to print
    private int times ; // The number of times to repeat

    /**
     * Construct a task with specified character and number of
     * times to print the character
     */

     public PrintChar(char c, int t) {
        charToPrint = c ;
        times = t ;
     } // end PrintChar

     /**
      * Override the run() method to tell the system
      * what task to perform
      */

      public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(charToPrint) ;
        } // end for loop
      } // end run
} // end PrintChar

// The task class for printing numbers from 1 to n for a given n
class PrintNum implements Runnable {
    private int lastNum ;

    /** Construct a task for printing 1, 2, ... , n */
    public PrintNum(int n) {
        lastNum = n ;
    } // end PrintNum

    /** Tell the thread how to run */
    public void run() {
        for (int i=1; i<=lastNum; i++) {
            System.out.println(" " + i) ;
        } // end for loop
    } // end run
} // end PrintNum