package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;
public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level){
        super(name, level);
        // Set base stats
        setStats(50, 75, 35, 70, 30, 40);
        // init type of pokemon
        setType(Type.GRASS, Type.POISON);
        // init move
        setMove(new LeechLife(), new Earthquake());
    }

}
