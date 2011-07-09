/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projetsecret;

/**
 *
 * @author Clément
 */
public class Rules {

    private Board lePlateau;

    public Rules(Board theBoard)
    {
        this.lePlateau = theBoard;
    }

    public void InitBoard()
    {
        int total = this.lePlateau.getNombre_nodes();

        for (int i = 0; i < total ; i++)
        {
            if ( i < (int)(total/2))
            {
                this.lePlateau.getNodes(i).getToken().setColor(Color.Noir);
                this.lePlateau.getNodes(i).getToken().setActive(true);
            }
            else if ( i == (int)(total+1/2))
            {
                this.lePlateau.getNodes(i).getToken().setActive(false);
            }
            else
            {
                this.lePlateau.getNodes(i).getToken().setColor(Color.Blanc);
                this.lePlateau.getNodes(i).getToken().setActive(true);
            }
        }
    }

    public boolean Move(Color col, Coord drag, Coord drop)
    {

        return false;
    }
    
    protected int Count(Color col)
    {
        int total = this.lePlateau.getNombre_nodes();
        int tmp = 0;

        for (int i = 0; i < total ; i++)
        {
            if ( this.lePlateau.getNodes(i).getToken().getColor() == col)
            {
                tmp++;
            }
        }
        return tmp;
    }

    public boolean IsOver()
    {
        if ( this.Count(Color.Blanc) == 0 || this.Count(Color.Noir) == 0)
            return true;
        else
            return false;
    }

}
