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
    private Board lePlateau;

    public GameSpace(Skin theSkin, Board theBoard)
    {
        super();
        this.addMouseListener(this);
        this.laPeau = theSkin;
        this.lePlateau = theBoard;

    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0 ; i < lePlateau.getNombre_nodes(); i++)
        {
            if ( lePlateau.getNodes(i).getToken().isActive() )
            {
                if ( lePlateau.getNodes(i).getToken().getColor() == Color.Blanc )
                {
                    (laPeau.Handler.get(3)).SetCoord(lePlateau.get_Coordonnees_node(i));
                    (laPeau.Handler.get(3)).paint(g);
                }
                else
                {
                    (laPeau.Handler.get(4)).SetCoord(lePlateau.get_Coordonnees_node(i));
                    (laPeau.Handler.get(4)).paint(g);
                }
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
