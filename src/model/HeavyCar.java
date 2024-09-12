package model;

import components.*;

/**
 * Абстрактный класс "грузовой"
 */
public abstract class HeavyCar extends Car {
    protected int loadCapacity;

    public HeavyCar(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                    Wheel[] wheels, GasTank gasTank, Electricity electricity, Engine engine, int loadCapacity) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheels, gasTank, electricity, engine);
        this.loadCapacity = loadCapacity;
    }
}