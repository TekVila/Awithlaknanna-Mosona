package projetsecret ;

public class Board
{
	private Node[] monPlateau ;
	private Coord[] mesCoord;

	public Board()
	{
            int derniere_case=0 ;
            int taille ;
            
            monPlateau = new Node[25];
            mesCoord= new Coord[25];      
        
            for(int i=0 ; i<25; i++)
            {
                monPlateau[i]= new Node();
                mesCoord[i] = new Coord();
            }
            
            for( int j=0; j< 3 ; j++ )
            {
                if (j== 0)
                {
                    taille = 8;
                }
                else if (j==1) 
                {
                    taille =9 ;
                }
                else
                {
                    taille = 8;
                }

                for(int i = 0 ; i< taille ; i++ )
                {
                    
                    if (j == 1)
                        mesCoord[i+derniere_case].myX = i * 80 + 15;
                    else
                        mesCoord[i+derniere_case].myX = i * 80 + 55;
                    
                    mesCoord[i+derniere_case].myY = j * 80 + 15;


                    if ((i+1)<taille)
                    {
			monPlateau[i+derniere_case].droite=monPlateau[i+derniere_case+1];
			monPlateau[i+derniere_case+1].gauche=monPlateau[i+derniere_case] ;
                    }
		
                    if (j==0) 
                    {
			monPlateau[i].basgauche=monPlateau[taille+i];
			monPlateau[taille + i].hautdroite=monPlateau[i];
			monPlateau[i].basdroite=monPlateau[taille+i+1];
			monPlateau[taille+1+i].hautgauche=monPlateau[i];
                    }
                    else if (j==1) 
                    {   
			if (i!=0) 
			{
				monPlateau[i+derniere_case].basgauche=monPlateau[i+derniere_case+taille-1];
				monPlateau[+derniere_case+taille-1].hautdroite=monPlateau[i+derniere_case] ;
			}
			if ((i+1)<taille)
			{
				monPlateau[i+derniere_case].basdroite=monPlateau[i+derniere_case+taille];
				monPlateau[+derniere_case+taille].hautgauche=monPlateau[i+derniere_case] ;
			}
                    }
                  }
	
                  derniere_case=derniere_case + taille;
                }
            }
	
	public int getNombre_nodes()
	{
            return 25;
	}

	public Coord get_Coordonnees_node(int indice)
	{	
            return mesCoord[indice];	
	}
	
	public Node getNodes(int indice)
	{
            return monPlateau[indice] ;
	}

        public int IndiceOfCoord(Coord coord)
        {
            for (int i = 0 ; i < getNombre_nodes() ; i++)
            {
                Coord tmp = mesCoord[i];
                if (coord.myX >= tmp.myX && coord.myX < tmp.myX+60 && coord.myY >= tmp.myY && coord.myY < tmp.myY )
                    return i;
            }
            return -1;
        }
}