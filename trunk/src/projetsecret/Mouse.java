package projetsecret;
/**
 * Classe statique du contrôle de la souris
 */
public class Mouse {
    static Coord depart = null;
    static Coord arrive = null;

    /**
     * Retourne les Coords de la souris au départ
     * @return Coord
     */
    static Coord Drag()
    {
        return depart;
    }

    /**
     * Retourne les Coords de la souris à l'arrivé
     * @return Coord
     */
    static Coord Drop()
    {
        return arrive;
    }
}
