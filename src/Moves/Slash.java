package Moves;
import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double dam){
        super.applyOppDamage(def, 2*dam);
    }

    @Override
    protected String describe(){
        return "Use Slash";
    }
}
