package projetsecret;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clément
 */
public class Mouse {
    static Coord depart = null;
    static Coord arrive = null;

    static Coord Drag()
    {
        return depart;
    }

    static Coord Drop()
    {
        return arrive;
    }
}
