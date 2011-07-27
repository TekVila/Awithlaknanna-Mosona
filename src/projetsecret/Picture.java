package projetsecret;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class Picture extends JPanel{

    private static final long serialVersionUID = 1L;
    private Image image;
    private int x,y;

    public Picture()
    {
        image = null;
        x = 0;
        y = 0;
    }
    
    public Picture(String fileName)
    {
        super();
        java.net.URL url = this.getClass().getResource( "../" +fileName);
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
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        /** Désactivation de l'anti-aliasing */
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        /** Demande de rendu rapide */
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_SPEED);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_DISABLE);

        /*AffineTransform origXform = g2d.getTransform();
        AffineTransform newXform = (AffineTransform)(origXform.clone());
        //center of rotation is center of the panel
        int xRot = this.getWidth()/2;
        int yRot = this.getHeight()/2;
        newXform.rotate(Math.toRadians(this.angle));
        //newXform.rotate(Math.toRadians(this.angle), xRot, yRot);
        g2d.setTransform(newXform);
        //draw image centered in panel
        //int tmpx = (this.getWidth() - image.getWidth(this))/2;
        //int tmpy = (this.getHeight() - image.getHeight(this))/2;*/
        g2d.drawImage(image, this.x, this.y, this);
        //g2d.setTransform(origXform);
    }

}
