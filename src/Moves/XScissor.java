package Moves;

import ru.ifmo.se.pokemon.*;

public class XScissor extends PhysicalMove{
    public XScissor(){
        super(Type.BUG, 80, 100);
    }    

    @Override
    protected String describe(){
        return "Use X-Scissor";
    }
}