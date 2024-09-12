package model;

import components.*;

public class Camry extends LightCar {
    private boolean isMusicOn;

    public Camry(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                 Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, GasTank gasTank, Electricity electricity,
                 Engine engine, boolean cruise, boolean isMusicOn) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheel1, wheel2, wheel3, wheel4, gasTank,
                electricity, engine, cruise);
        this.isMusicOn = isMusicOn;
    }

    public Camry(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
                 Wheel[] wheels, GasTank gasTank, Electricity electricity, Engine engine, boolean cruise, boolean isMusicOn) {
        super(color, maxSpeed, transmissionType, isRide, headlights, wheels, gasTank, electricity, engine, cruise);
        this.isMusicOn = isMusicOn;
    }

    public void setMusicOn(boolean musicOn) {
        isMusicOn = musicOn;
        if (musicOn) {
            System.out.println("Музыка включена");
        } else {
            System.out.println("Музыка выключена");
        }
    }
}