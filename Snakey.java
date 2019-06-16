
package snakey;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Snakey {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //frame.pack(); <- call pack before setPositionRelativeTo(null) // DIDN'T WORK
        
        //WINDOW SIZE AND LOCATION VARIABLES
        int[] windowLoc = {dim.width/4, dim.height/4}; //LOCATION ARRAY
        int[] screenSize = {dim.width/2, dim.height/2}; 
                
        frame.setLocation(windowLoc[0], windowLoc[1]); //looks comfortable
        frame.setSize(screenSize[0], screenSize[1]); // takes your screensize and makes a window half its size
        
        //to close the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //make it show
        frame.setVisible(true); //deprecated method show(): use setVisible instead
    }
    
}
