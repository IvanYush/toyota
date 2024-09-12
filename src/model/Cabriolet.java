package model;

import components.*;

public abstract class Cabriolet extends LightCar{
    protected boolean roof;

    public Cabriolet(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                     Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, GasTank gasTank, Electricity electricity,
                     Engine engine, boolean cruise, boolean roof) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheel1, wheel2, wheel3, wheel4, gasTank,
                electricity, engine, cruise);
        this.roof = roof;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
        if (roof) {
            System.out.println("Крыша поднята");
        } else {
            System.out.println("Крыша опущена");
        }
    }
}
