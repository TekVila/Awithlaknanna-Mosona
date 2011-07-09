package projetsecret;
/**
 * Classe statique du contrôle de la souris
 */
public class Mouse {
    /**
     * Coord au moment ou la souris est pressée
     */
    static Coord depart = null;
    /**
     * Coord au moment ou la souris est relachée
     */
    static Coord arrive = null;

    /**
     * Retourne les Coords de la souris au départ
     * @return Coord
     */
    static Coord Drag()
    {
        arrive = null;
        return depart;
    }

    /**
     * Retourne les Coords de la souris à l'arrivé
     * @return Coord
     */
    static Coord Drop()
    {
        depart = null;
        return arrive;
    }
}
