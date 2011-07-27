package projetsecret;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.xml.transform.Transformer;

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
        laPeau.Handler.get(0).paintComponent(g);
        for (int i = 0 ; i < lePlateau.getNombre_nodes(); i++)
        {
            if (lePlateau.getNodes(i).droite != null )
            {
                Coord tmp = lePlateau.get_Coordonnees_node(i);
                laPeau.Handler.get(1).SetCoord(tmp.myX + 40, tmp.myY + 28);
                laPeau.Handler.get(1).paintComponent(g);
            }
            if (lePlateau.getNodes(i).basdroite != null)
            {
                Coord tmp = lePlateau.get_Coordonnees_node(i);
                laPeau.Handler.get(3).SetCoord(tmp.myX + 40, tmp.myY+40);
                laPeau.Handler.get(3).paintComponent(g);
            }

            if (lePlateau.getNodes(i).basgauche != null)
            {
                Coord tmp = lePlateau.get_Coordonnees_node(i);
                laPeau.Handler.get(2).SetCoord(tmp.myX, tmp.myY+40);
                laPeau.Handler.get(2).paintComponent(g);
            }

            if ( lePlateau.getNodes(i).getToken().isActive() )
            {
                if ( lePlateau.getNodes(i).getToken().getColor() == Color.Blanc )
                {
                    (laPeau.Handler.get(5)).SetCoord(lePlateau.get_Coordonnees_node(i));
                    (laPeau.Handler.get(5)).paintComponent(g);
                }
                else
                {
                    (laPeau.Handler.get(6)).SetCoord(lePlateau.get_Coordonnees_node(i));
                    (laPeau.Handler.get(6)).paintComponent(g);
                }
            }
            else
            {
                Coord tmp = lePlateau.get_Coordonnees_node(i);
                laPeau.Handler.get(4).SetCoord(tmp.myX + 20, tmp.myY + 20);
                laPeau.Handler.get(4).paintComponent(g);
            }

        }
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        Mouse.depart = new Coord(e.getX(), e.getY());
        //System.out.println("depart : " + e.getX() + " ; " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
         Mouse.arrive = new Coord(e.getX(), e.getY());
         //System.out.println("arrive : " + e.getX() + " ; " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }


}
