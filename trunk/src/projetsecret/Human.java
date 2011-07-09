package projetsecret ;

public class Human extends Player
{
    
	public Human()
	{
		maCouleur= null;
		mesRegles= null ;
	}
	
        public void Think()
        {
            if(super.mesRegles.Move(maCouleur, Mouse.Drag(), Mouse.Drop()) !=true)
            {
                while ((Mouse.Drop()==null)&& (Mouse.Drag()==null))
                {}
            
            }
        }

}