package projetsecret ;

public class Token 
{
	private Color maCouleur;

	private  boolean est_actif ;
	
	public Token()
	{
		maCouleur= NULL ;
		est_actif = false;
	}
		 
	public void setColor (Color theColor)
	{
		maCouleur = theColor ;
	}
	
	public void setActive (boolean actif)
	{
		est_actif = actif ;
	}
	
	public boolean isActive()
	{
		return est_actif ;
	}
	
	public Color getColor()
	{
		return maCouleur ;
	}
}