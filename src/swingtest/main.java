package swingtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Proof of concept for a on-screen touch-able keyboard macro.
 */
public class main {

    public main(){
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        JPanel pane = new JPanel();

        JButton button = new JButton("paste");
        button.setFocusable(false);
        frame.setFocusable(false);
        frame.setFocusableWindowState(false);
        frame.setAlwaysOnTop(true);
        pane.setFocusable(false);

        button.addActionListener((ae)->{
            try {
                Robot r = new Robot();

                r.keyPress(KeyEvent.VK_CONTROL);
                r.keyPress(KeyEvent.VK_V);

                Thread.sleep(100);
                r.keyRelease(KeyEvent.VK_CONTROL);
                r.keyRelease(KeyEvent.VK_V);

            } catch (AWTException e) {
                e.printStackTrace();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        pane.add(button);
        frame.setContentPane(pane);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        main m = new main();

    }
}
