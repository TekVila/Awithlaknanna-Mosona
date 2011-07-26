package projetsecret;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 * Classe d'affichage à l'écran
 */
public class Display extends JFrame{

    private GameSpace laZone;

    public Display(Board theBoard, Skin theSkin)
    {
        this.addWindowListener(new WindowAdapter()
           {@Override
            public void windowClosing(WindowEvent e)
                  {System.exit(0);
                  }
             } ) ; 
        this.laZone = new GameSpace(theSkin, theBoard);

        this.setSize(800,600);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       // this.pack();
        this.setVisible(true);
    }

    public void Draw()
    {
        this.add(this.laZone);
        this.repaint();
    }

}
