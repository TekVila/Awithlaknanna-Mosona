/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetsecret;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Panel;
//import java.awt.image.BufferedImage;
import java.awt.Toolkit;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;

/**
 *
 * @author Clément
 */
public class Picture extends Panel{

    private static final long serialVersionUID = 1L;
    private Image image;
    //private BufferedImage image;
    private int x,y;

    public Picture()
    {
        image = null;
        x = 0;
        y = 0;
    }
    
    public Picture(String fileName)
    {
        /*try {
            image = ImageIO.read(new File(fileName));
            this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        } catch (IOException ie) {
            System.out.println("Loading Picture problem !!!");
        }*/

        java.net.URL url = this.getClass().getResource( "../" +fileName);
        System.out.print(url);
        image = Toolkit.getDefaultToolkit().getImage(url);
        try {
            MediaTracker mt = new MediaTracker(this);
            mt.addImage(image, 0);
            mt.waitForAll();
        } catch (Exception e) {
        }
        this.setPreferredSize(new Dimension(image.getWidth(this), image.getHeight(this)));
        
    }

    public void SetCoord(int theX, int theY)
    {
        this.x = theX;
        this.y = theY;
    }

    public void SetCoord(Coord coord)
    {
        this.x = coord.myX;
        this.y = coord.myY;
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(this.image, this.x, this.y, null);
    }

}
