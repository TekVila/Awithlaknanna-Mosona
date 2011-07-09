package projetsecret;

/**
 * Classe décrivant les régles de jeu
 */
public class Rules {

    /**
     * Le Board sur lequel s'appliqueront les règles
     * @see Board
     */
    private Board lePlateau;

    /**
     * Constructeur
     * @param theBoard Le Board auquel on souhaite que les règles s'appliquent
     */
    public Rules(Board theBoard)
    {
        this.lePlateau = theBoard;
    }

    /**
     * Initialisation des Tokens du Board en position de début de partie.
     */
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
            else if ( i == (int)(total/2))
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

    /**
     * Demande et effectue si possible le déplacement requis
     * @param col Color du Player faisant la demande
     * @param drag Position initiale de la souris sur l'écran
     * @param drop Position finale de la souris sur l'écran
     * @return TRUE si le déplacement a réussi
     */
    public boolean Move(Color col, Coord drag, Coord drop)
    {
        int ind1;
        if ( ( ind1 = this.lePlateau.IndiceOfCoord(drag) ) != -1 )
        {
            System.out.println(ind1);
            if (this.lePlateau.getNodes(ind1).getToken().getColor() == col)
            {
                int ind2;
                if ( ( ind2 = this.lePlateau.IndiceOfCoord(drop) ) != -1 )
                {
                    System.out.println(ind2);
                    if ( ind2 != ind1)
                    {
                        //On va switcher pour le moment
                        Color testCol = this.lePlateau.getNodes(ind1).getToken().getColor();
                        boolean actif = this.lePlateau.getNodes(ind1).getToken().isActive();

                        this.lePlateau.getNodes(ind1).getToken().setColor(this.lePlateau.getNodes(ind2).getToken().getColor());
                        this.lePlateau.getNodes(ind1).getToken().setActive(this.lePlateau.getNodes(ind2).getToken().isActive());

                        this.lePlateau.getNodes(ind2).getToken().setColor(testCol);
                        this.lePlateau.getNodes(ind2).getToken().setActive(actif);

                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * Compte le nombre de Token sur le Board de la Color demandée
     * @param col Color choisie
     * @return Le nombre de Token de cette Color
     */
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

    /**
     * Détermine si la partie est terminée
     * @return TRUE si elle l'est
     */
    public boolean IsOver()
    {
        if ( this.Count(Color.Blanc) == 0 || this.Count(Color.Noir) == 0)
            return true;
        else
            return false;
    }

}
