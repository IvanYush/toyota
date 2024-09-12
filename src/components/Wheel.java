package components;

import enums.WheelDiameterEnum;

public class Wheel {
    private boolean isPuncture;
    private WheelDiameterEnum diameter;

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

    //сделать проверку. Если колесо null, то машина не должна поехать. И сделать проверку, что все колеса одного диаметра.
    //через exception.
}
