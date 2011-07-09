/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetsecret;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Clément
 */
public class GameSpace extends JPanel implements MouseListener{
    
    private Skin laPeau;

    public GameSpace(Skin theSkin)
    {
        super();
        this.addMouseListener(this);
        this.laPeau = theSkin;

    }

    @Override
    public void paint(Graphics g) {
        for ( int i = 0 ; i < laPeau.Handler.size()+1; i++) {
            if (i == 5){
                (laPeau.Handler.get(4)).SetCoord(80, 200);
                (laPeau.Handler.get(4)).paint(g);
            } else
            {
                if (i == 4)
                {
                    (laPeau.Handler.get(i)).SetCoord(50, 100);
                }
                (laPeau.Handler.get(i)).paint(g);
            }
        }
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        Mouse.depart = new Coord(e.getX(), e.getY());
        System.out.println("depart : " + e.getX() + " ; " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
         Mouse.arrive = new Coord(e.getX(), e.getY());
         System.out.println("arrive : " + e.getX() + " ; " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }


}
