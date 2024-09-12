package model;

import components.*;

public class Hiance extends HeavyCar {
    private Wheel spareWheel;

    public Hiance(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                  Wheel[] wheels, GasTank gasTank, Electricity electricity,
                  Engine engine, int loadCapacity, Wheel spareWheel) {
        super(color, maxSpeed, transmissionType, isRide, headlights,
                wheels, gasTank, electricity, engine, loadCapacity);
        this.spareWheel = spareWheel;
    }
}