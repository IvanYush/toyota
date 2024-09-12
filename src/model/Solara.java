package model;

import components.*;

public class Solara extends Cabriolet {
    private boolean isFridge;

    public Solara(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                  Wheel[] wheels, GasTank gasTank, Electricity electricity,
                  Engine engine, boolean cruise, boolean isRoofUp, boolean isFridge) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheels, gasTank,
                electricity, engine, cruise, isRoofUp);
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
