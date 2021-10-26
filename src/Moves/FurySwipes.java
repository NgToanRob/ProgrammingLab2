package Moves;
import ru.ifmo.se.pokemon.*;
import java.util.Random;
public class FurySwipes extends PhysicalMove {
    public FurySwipes(){
        super(Type.NORMAL, 18, 80);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double dam){
        Random random = new Random();
        int randomNumber = random.nextInt(5 - 2) + 2;
        if (randomNumber == 2){
            super.applyOppDamage(p, dam*2);
        }
        else if (randomNumber == 3){
            super.applyOppDamage(p, dam*3);
        }
        else if (randomNumber == 4){
            super.applyOppDamage(p, dam*4);
        }
        else {
            super.applyOppDamage(p, dam*5);
        }
    }

    @Override
    protected String describe(){
        return "Use Fury Swipes";
    }
}
