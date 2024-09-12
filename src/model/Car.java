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

    public void startMoving() throws StartCarException {
        if (wheels[0].isPuncture() || wheels[1].isPuncture() || wheels[2].isPuncture() || wheels[3].isPuncture()) {
            throw new StartCarException("Проколото колесо");
        } else if (wheels[0] == null || wheels[1] == null || wheels[2] == null || wheels[3] == null) {
            throw new StartCarException("В машине не хватает колес");
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
        this.isRide = false;
        System.out.println("Машина остановлена");
    }

    public void headlihtsSwitchOn() {
        System.out.println("Фары включены");
    }
}