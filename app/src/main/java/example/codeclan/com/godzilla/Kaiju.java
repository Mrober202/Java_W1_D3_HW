package example.codeclan.com.godzilla;

import static android.R.attr.value;

public abstract class Kaiju {

    private String name;
    private int healthValue;

    public Kaiju(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

// Wizards - Kaiju -> godzilla/attack
//    mythical beasts - human constructs -> destroyable
//

//in Kaiju create two monsters.(These implement attack)
//    Interfaces called attack and Destroy.
//    in Human Constructs create a building or tank etc. (these implement destroy)
//

}