/**
 * File: CommandLine.java
 * ----------------------
 * Display all command-line arguments
 */
package advancedClassAndMethod;

public class CommandLine {

    public static void main(String args[]) {
        for(int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " +
            args[i]) ;
        } // end for loop
    } // end main
} // end CommandLine
