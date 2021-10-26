package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Zekrom extends Pokemon{
    
    public Zekrom(String name, int level){
        // init name and level
        super(name, level);
        // Set base stats
        setStats(100, 150, 120, 120, 100, 90);
        // init type of pokemon
        setType(Type.DRAGON, Type.ELECTRIC);
        // init move
        setMove(new XScissor(), new DynamicPunch(), new Thunder(), new Slash());
        
    }
}
