package projetsecret;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clément
 */
public class Coord {

    //myX et myY sont publics pour des raisons pratiques
    public int myX;
    public int myY;

    public Coord()
    {
        this.myX = 0;
        this.myY = 0;
    }

    public Coord(int x, int y)
    {
        this.myX = x;
        this.myY = y;
    }

}
