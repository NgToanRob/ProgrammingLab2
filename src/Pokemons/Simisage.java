package Pokemons;
import Moves.*;
public class Simisage extends Pansage {
    public Simisage(String name, int level){
        super(name, level);
        setStats(75, 98, 63, 98, 63, 101);
        addMove(new GyroBall());
    }
}
