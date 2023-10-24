package anstraction.statickeyword;

import java.awt.*;

public class Airplane {
    static List passengers;

    public static final byte numberOfEngines = 2;
    static boolean canFly = true;
    static byte getNumberOfEngines() {
        return numberOfEngines;
    }


    static boolean fly() {
        return canFly; // Error

    }

    static {
        passengers.add("Anna");
        passengers.add("John");
        passengers.add("Marlyn");
    }
}
