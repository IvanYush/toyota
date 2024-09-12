package model;

import components.*;
import exception.StartCarException;

/**
 * Абстрактный класс "машина"
 */
public abstract class Car {
    protected String color; //цвет
    protected int maxSpeed; //максимальная скорость
    protected String transmissionType; //тип коробки передач
    protected boolean isRide; //состояние движения

    protected Headlights headlights;

    protected Wheel wheel1;
    protected Wheel wheel2;
    protected Wheel wheel3;
    protected Wheel wheel4;

    protected Wheel[] wheels = new Wheel[4];

    protected GasTank gasTank;

    protected Electricity electricity;

    protected Engine engine;

    public Car(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
               Wheel[] wheels, GasTank gasTank, Electricity electricity, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.isRide = isRide;
        this.headlights = headlights;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.electricity = electricity;
        this.engine = engine;
    }

    public Car(String color, int maxSpeed, String transmissionType, boolean isRide, Headlights headlights,
               Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, GasTank gasTank,
               Electricity electricity, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmissionType = transmissionType;
        this.isRide = isRide;
        this.headlights = headlights;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
        this.gasTank = gasTank;
        this.electricity = electricity;
        this.engine = engine;
    }

//    public void startMoving() throws StartCarException {
//        if (wheel1.isPuncture() || wheel2.isPuncture() || wheel3.isPuncture() || wheel4.isPuncture()) {
//            throw new StartCarException("Проколото колесо");
//        } else if (gasTank.getFuelLevel() < 0) {
//            throw new StartCarException("Нет бензина");
//        } else if (!electricity.isServiceability()) {
//            throw new StartCarException("Электрика не работоспособна");
//        } else if (!engine.isServiceability()) {
//            throw new StartCarException("Двигатель не работоспособен");
//        } else {
//            this.isRide = true;
//            System.out.println("Машина едет");
//        }
//    }

    public void startMoving() throws StartCarException {
        if (wheels[0].isPuncture() || wheels[1].isPuncture() || wheels[2].isPuncture() || wheels[3].isPuncture()) {
            throw new StartCarException("Проколото колесо");
        } else if (gasTank.getFuelLevel() < 0) {
            throw new StartCarException("Нет бензина");
        } else if (!electricity.isServiceability()) {
            throw new StartCarException("Электрика не работоспособна");
        } else if (!engine.isServiceability()) {
            throw new StartCarException("Двигатель не работоспособен");
        } else {
            this.isRide = true;
            System.out.println("Машина едет");
        }
    }

    public void stopMoving() {
        System.out.println("Машина остановлена");
    }

    public void headlihtsSwitchOn() {
        System.out.println("Фары включены");
    }
}