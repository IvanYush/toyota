package enums;

/**
 * Enum на диаметр шин
 */
public enum WheelDiameterEnum {
    WHEEL_DIAMETER_16(16),
    WHEEL_DIAMETER_17(17),
    WHEEL_DIAMETER_20(20);

    private int diameter;

    WheelDiameterEnum(int diameter) {
        this.diameter = diameter;
    }
}
