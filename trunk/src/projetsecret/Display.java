/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetsecret;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Clément
 */
public class Display extends JFrame{

    protected Board lePlateau;
    protected Skin laPeau;

    private Canvas myCanvas;

    public class Canvas extends JPanel{

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

    }

    public Display(Board theBoard, Skin theSkin)
    {
        this.lePlateau = theBoard;
        this.laPeau = theSkin;

        this.setSize(640,480);
       // this.pack();
        this.setVisible(true);

        this.myCanvas = new Canvas();
    }

    public void Draw()
    {
        this.add(myCanvas);

    }

}
