package components;

public class GasTank {
    private int fuelLevel;

    public GasTank() {
    }

    public GasTank(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
