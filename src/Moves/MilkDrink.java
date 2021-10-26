package Moves;
import ru.ifmo.se.pokemon.*;
public class MilkDrink extends StatusMove {
    public MilkDrink(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -2);
    }

    @Override
    protected String describe(){
        return "Drink Milk";
    }
}
