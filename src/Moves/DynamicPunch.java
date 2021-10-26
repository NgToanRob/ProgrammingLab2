package Moves;
import ru.ifmo.se.pokemon.*;

public class DynamicPunch extends PhysicalMove{
    public DynamicPunch(){
        super(Type.FIGHTING, 100, 50);  
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }

    @Override
    protected String describe(){
        return "Use Dynamic Punch";
    }
}