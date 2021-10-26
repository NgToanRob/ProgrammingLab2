import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

class Battleground {
    public static void main(String[] args) {
        // Init a Battle
        Battle b = new Battle();

        // Pokemons join Battle
        Simisage p1 = new Simisage("Nguyễn Văn A", 1);
        Zekrom p2 = new Zekrom("Trần Thị B", 2);
        Weepinbell p3 = new Weepinbell("Nhốc", 3);
        Zekrom p4 = new Zekrom("Đặng Thị C", 1);
        Pansage p5 = new Pansage("Hứa Văn Hẹn", 3);
        Bellsprout p6 = new Bellsprout("Hihi", 3);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        // Fight!!!
        b.go();
    }
}
