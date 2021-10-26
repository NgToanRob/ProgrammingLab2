package Pokemons;
import Moves.*;
public class Victreebel extends Weepinbell {
    public Victreebel(String name, int level){
        super(name, level);
        setStats(80, 105, 65, 100, 70, 70);
        addMove(new DoubleTeam());
    }
}
