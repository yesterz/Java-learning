/**
 * File: FlashingText.java
 * -----------------------
 * print a flashing text
 */
package IntroJavaProgramming8e.MultithreadedProgramming;

import javax.swing.*;

public class FlashingText extends JApplet implements Runnable{
    private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER) ;

    public FlashingText() {
        add(jlblText) ;
        new Thread(this).start() ;
    } // end FlashingText

    /** Set the text on/off every 200 milliseconds */
    public void run() {
        try {
            while (true) {
                if (jlblText.getText() == null)
                    jlblText.setText("Welcome") ;
                else
                    jlblText.setText(null) ;
                Thread.sleep(200) ;
            } // end while loop
        } catch (InterruptedException ex) {
        }
    } // end run
} // end FlashingText