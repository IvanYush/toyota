package model;

import components.*;

public abstract class LightCar extends Car {
    private boolean cruise;

    public LightCar(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                    Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, GasTank gasTank, Electricity electricity,
                    Engine engine, boolean cruise) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheel1, wheel2, wheel3, wheel4, gasTank, electricity, engine);
        this.cruise = cruise;
    }

    public LightCar(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                    Wheel[] wheels, GasTank gasTank, Electricity electricity, Engine engine, boolean cruise) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheels, gasTank, electricity, engine);
        this.cruise = cruise;
    }

    public void setCruise(boolean cruise) {
        this.cruise = cruise;
        if (cruise) {
            System.out.println("Круиз включен");
        } else {
            System.out.println("Круиз контроль выключен");
        }
    }

    public boolean isCruise() {
        return cruise;
    }
}
