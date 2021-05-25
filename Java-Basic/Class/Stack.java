/**
 * File: Stack.java
 * ----------------
 * This class defines an integer stack that can hold 10 values.
 */
package Class;

class Stack {
    
    int stck[] = new int[10] ;
    int tos ;

    // initialize top-of-stack
    Stack() {
        tos = -1 ;
    } // end Stack's constructor

    // Push an item onto the stack
    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full.") ;
        else
        stck[++tos] = item ;
    } // end push

    int pop() {
        if(tos<0) {
            System.out.println("Stack underflow.") ;
            return 0 ;
        } else 
            return stck[tos--] ;
    } // end pop
} // end Stack
