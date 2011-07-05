package projetsecret ;


public class Node
{
 
	private Token maPierre ;

	public Node gauche,droite,hautdroite,hautgauche,basdroite,basgauche;
	
	public Node()
	{
		maPierre = new Token() ;
		gauche=null;
		droite=null;
		hautdroite= null;
		hautgauche=null;
		basgauche=null;
		basdroite=null;
	
	}
	
	public Token getToken()
	{
		return maPierre;
	}

}