
package snakey;

import static com.sun.javafx.scene.control.skin.Utils.getResource;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
//import javafx.scene.paint.Color;
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
        
        //GRAPHICS - COLORS ETC.
        //frame.setIconImage(Toolkit.getDefaultToolkit().getImage("snake.png"));
        String imgPath = "../media_resources/snake.png";
        InputStream imgStream = Snakey.class.getResourceAsStream(imgPath);
        BufferedImage myIcon;
        try {
            myIcon = ImageIO.read(imgStream);
            frame.setIconImage(myIcon);
        } catch (IOException ex) {
            Logger.getLogger(Snakey.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

           
        
        //make it show
        frame.setVisible(true); //deprecated method show(): use setVisible instead
    }
    
}
