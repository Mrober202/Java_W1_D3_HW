package example.codeclan.com.godzilla;

/**
 * Created by michaelrobertson on 21/06/2017.
 */

public class Godzilla extends Kaiju implements Attack{

    public Godzilla(String name, int healthValue) {
        super(name, healthValue);
    }

    public int getDestructiveForce() {
        return 200;
    }

    public String roar() {
        return "Where the Godzillitas at?!";
    }
}
