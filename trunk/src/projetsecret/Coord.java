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
    public float myX;
    public float myY;

    public Coord()
    {
        this.myX = 0.f;
        this.myY = 0.f;
    }

    public Coord(float x, float y)
    {
        this.myX = x;
        this.myY = y;
    }

}
