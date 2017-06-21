package example.codeclan.com.godzilla;

/**
 * Created by michaelrobertson on 21/06/2017.
 */

public class Tank extends HumanConstructs implements Destroyable{
    public Tank(String type, int healthValue) {
        super(type, healthValue);
    }

    public String die() {
        return "IS DEED";
    }

    public String attack(Kaiju kaiju) {
        return "Belter mate!";
    }

}
