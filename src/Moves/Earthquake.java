package Moves;
import ru.ifmo.se.pokemon.*;
public class Earthquake extends PhysicalMove {
    public Earthquake(){
        super(Type.GROUND, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double dam){
        if (Math.random() < 0.3){
            super.applyOppDamage(p, 2*dam);
        }
    }

    @Override
    protected String describe(){
        return "Use Earthquake";
    }
}
