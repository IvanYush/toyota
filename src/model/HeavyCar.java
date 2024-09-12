package model;

import components.*;

public abstract class HeavyCar extends Car {
    protected int loadCapacity;

    public HeavyCar(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                    Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, GasTank gasTank, Electricity electricity,
                    Engine engine, int loadCapacity) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheel1, wheel2, wheel3, wheel4, gasTank,
                electricity, engine);
        this.loadCapacity = loadCapacity;
    }
}
