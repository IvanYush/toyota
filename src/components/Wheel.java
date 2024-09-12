package components;

import enums.WheelDiameterEnum;

/**
 * Класс "колесо"
 */
public class Wheel {
    private boolean isPuncture; //наличие прокола
    private WheelDiameterEnum diameter; //размер

    public Wheel() {
    }

    public Wheel(boolean isPuncture, WheelDiameterEnum diameter) {
        this.isPuncture = isPuncture;
        this.diameter = diameter;
    }

    public boolean isPuncture() {
        return isPuncture;
    }

    public void setPuncture(boolean puncture) {
        isPuncture = puncture;
    }
}