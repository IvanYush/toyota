package model;

import components.*;

public class Solara extends Cabriolet {
    private boolean isFridge;

    public Solara(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                  Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, GasTank gasTank, Electricity electricity,
                  Engine engine, boolean cruise, boolean roof, boolean isFridge) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheel1, wheel2, wheel3, wheel4, gasTank,
                electricity, engine, cruise, roof);
        this.isFridge = isFridge;
    }

    public void setFridge(boolean fridge) {
        isFridge = fridge;
        if (fridge) {
            System.out.println("Холодильник включен");
        } else {
            System.out.println("Холодильник выключен");
        }
    }
}
