package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Pansage extends Pokemon{
    
    public Pansage(String name, int level){
        // init name and level
        super(name, level);
        // Set base stats
        setStats(50, 53, 48, 53, 48, 64);
        // init type of pokemon
        setType(Type.GRASS);
        // init move
        setMove(new JumpKick(), new FurySwipes(), new MilkDrink());
        
    }
}
