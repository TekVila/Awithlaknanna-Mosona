package projetsecret;

import javax.swing.JFrame;

/**
 * Classe d'affichage à l'écran
 */
public class Display extends JFrame{

    protected Board lePlateau;
    protected Skin laPeau;

    private GameSpace laZone;

    public Display(Board theBoard, Skin theSkin)
    {
        this.lePlateau = theBoard;
        this.laPeau = theSkin;
        this.laZone = new GameSpace(this.laPeau, this.lePlateau);

        this.setSize(800,600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       // this.pack();
        this.setVisible(true);
    }

    public void Draw()
    {
        this.add(this.laZone);
    }

}
