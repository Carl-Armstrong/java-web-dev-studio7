package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD (String discName, int discCapacity) {
        super(500, discName, discCapacity, "CD");

    }

    public void playMusic() {
        System.out.println("As you cruise slowly down the main strip, everybody" +
                " looks for the source of your sweet tunes.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
