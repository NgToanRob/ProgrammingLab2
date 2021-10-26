package Moves;
import ru.ifmo.se.pokemon.*;
public class JumpKick extends PhysicalMove{
    public JumpKick(){
        super(Type.FIGHTING, 100, 95);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe(){
        return "Use Jump Kick";
    }
}
