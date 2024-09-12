package model;

import components.*;

public class Dyna extends HeavyCar {
    private boolean isCharger;

    public Dyna(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, GasTank gasTank, Electricity electricity,
                Engine engine, int loadCapacity, boolean isCharger) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheel1, wheel2, wheel3, wheel4, gasTank,
                electricity, engine, loadCapacity);
        this.isCharger = isCharger;
    }

    public void setCharger(boolean charger) {
        isCharger = charger;
        if (charger) {
            System.out.println("Телефон заряжается");
        } else {
            System.out.println("Телефон не заряжается");
        }
    }
}
