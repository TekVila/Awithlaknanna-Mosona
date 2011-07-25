package projetsecret ;

public class Human extends Player
{
    
	public Human(Rules myRules, Color myColor)
	{
		super.maCouleur= myColor;
		super.mesRegles= myRules ;
	}
	
        
        
        public void Think()
        {
             Coord temp1,temp2;
             
        //ce qu'il doit faire c'est tant que le coup n'est pas validé par les règles ... 
        //il boucle sur 
        //si la souris Drag alors on regarde si  elle Drop 
        //et si les 2 marches alors on demande si le coup est bon
            
             temp1 = new Coord();
             temp2 = new Coord();
            
         
            
            
            while(super.mesRegles.Move(super.maCouleur,temp1,temp2)== false) 
            { // On teste rules.move, tant qu'il est faux, c'est à dire que 
                // le déplacement n'a pas été validé
                // on continue de demander au joueur un déplacement
                // on quitte la boucle quand rules.move= vrai
            
                if( (temp1=Mouse.Drag()) !=null)
                {// On teste la prise du pion, si elle est différente de null
                    // le pion à été pris et on continue
                    
                    while((temp2=Mouse.Drop())== null)
                    {// on teste la dépose du pion, avant qu'elle soit valide.
                        // si elle est valide, alors on passe au joueur suivant
                        
                    }
                }
            
            }
            
            
         }
}