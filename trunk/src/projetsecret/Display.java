/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetsecret;

import javax.swing.JFrame;

/**
 *
 * @author Clément
 */
public class Display extends JFrame{

    protected Board lePlateau;
    protected Skin laPeau;

    private GameSpace laZone;

    

    public Display(Board theBoard, Skin theSkin)
    {
        this.lePlateau = theBoard;
        this.laPeau = theSkin;
        this.laZone = new GameSpace(this.laPeau);

        this.setSize(640,480);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       // this.pack();
        this.setVisible(true);
    }

    public void Draw()
    {
        this.add(this.laZone);
    }

}
