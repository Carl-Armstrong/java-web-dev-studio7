package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {
    private int spinSpeed;
    private String discName;
    private int discCapacity;
    private String discType;
    private ArrayList<String> collectedData;

    public BaseDisc(int spinSpeed, String discName, int discCapacity, String discType) {
        this.spinSpeed = spinSpeed;
        this.discName = discName;
        this.discCapacity = discCapacity;
        this.discType = discType;
        this.collectedData = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Disc Name: " + discName +
                "\nDisc Type: " + discType +
                "\nDisc Capacity: " + discCapacity + "GB";
    }

    @Override
    public void write(String inputData) {
        collectedData.add(inputData);
    }

    @Override
    public void read() {
        for (String datum: collectedData
             ) {
            System.out.println(datum);
        }
    }

    public void spinDisc() {
        System.out.println("The disc is spinning at " + spinSpeed + " RPM.");
    }


}
