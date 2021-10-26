package Moves;

import ru.ifmo.se.pokemon.*;

public class LeechLife extends PhysicalMove {
    public LeechLife(){
        super(Type.BUG, 80,100);
    }

    // public double userHP;
    @Override
    protected void applySelfDamage(Pokemon p, double dam){
        double userMaxHP = p.getStat(Stat.HP);
        double currentHP = p.getHP();
        // Stat stat = p.getStat();
        p.setMod(Stat.HP, (int) (-0.5*(userMaxHP-currentHP)));
        super.applySelfDamage(p, dam);
    }

    @Override
    protected String describe(){
        return "Use Leech Life";
    }

}
