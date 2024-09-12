package model;

import components.*;

/**
 * Абстрактный класс "кабриолет"
 */
public abstract class Cabriolet extends LightCar {
    protected boolean isRoofUp; //поднята ли крыша

    public Cabriolet(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                     Wheel[] wheels, GasTank gasTank, Electricity electricity,
                     Engine engine, boolean cruise, boolean isRoofUp) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheels, gasTank, electricity, engine, cruise);
        this.isRoofUp = isRoofUp;
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }

    public void setRoof(boolean isRoofUp) {
        this.isRoofUp = isRoofUp;
        if (isRoofUp) {
            System.out.println("Крыша поднята");
        } else {
            System.out.println("Крыша опущена");
        }
    }
}