package Moves;

import ru.ifmo.se.pokemon.*;
import Pokemons.Simisage;

public class GyroBall extends PhysicalMove {
    public GyroBall(){
        super(Type.STEEL, 0, 100);
    }

    public double seflSpeed;

    @Override
    protected void applySelfDamage(Pokemon p, double dame){
        this.seflSpeed = p.getStat(Stat.SPEED);
        super.applySelfDamage(p, dame);
    }

    @Override
    protected void applyOppDamage(Pokemon p_user, double dam){
        double k = 25 * p_user.getStat(Stat.SPEED) / this.seflSpeed;
        super.applyOppDamage(p_user, k);
    }
    
    @Override
    protected String describe(){
        return "Use Gyro Ball";
    }
}
