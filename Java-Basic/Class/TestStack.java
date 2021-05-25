/**
 * File: TestStack.java
 * --------------------
 * test class Stack
 */
package Class;

public class TestStack {
    
    public void run() {
        Stack mystack1 = new Stack() ;
        Stack mystack2 = new Stack() ;

        // push some numbers onto the stack
        for(int i=0; i<10; i++) mystack1.push(i) ;
        for(int i=10; i<20; i++) mystack2.push(i) ;

        // pop those numbers off the stack
        System.out.println("Stack in mystack1:") ;
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop()) ;

        System.out.println("Stack in mystack2:") ;
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop()) ;
        
    } // end run

    public static void main(String args[]) {
        new TestStack().run() ;
    } // end main
} // end TestStack
