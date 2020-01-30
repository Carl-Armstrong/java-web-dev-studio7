package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD (String discName, int discCapacity) {
        super(1600, discName, discCapacity, "DVD");

    }

    public void playMovie() {
        System.out.println("The movie looks great on your giant screen and your" +
                " surround sound makes your neighbors call the police.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
