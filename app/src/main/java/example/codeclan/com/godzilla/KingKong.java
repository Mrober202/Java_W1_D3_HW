package example.codeclan.com.godzilla;

/**
 * Created by michaelrobertson on 21/06/2017.
 */

public class KingKong extends Kaiju implements Attack {

    public KingKong(String name, int healthValue) {
        super(name, healthValue);
    }

    public int getDestructiveForce() {
        return 100;
    }

    public String roar() {
        return "OO OO AA AA";
    }

}
