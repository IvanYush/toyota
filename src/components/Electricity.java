package components;

public class Electricity {
    private boolean isServiceability;

    public Electricity() {
    }

    public Electricity(boolean isServiceability) {
        this.isServiceability = isServiceability;
    }

    public boolean isServiceability() {
        return isServiceability;
    }

    public void setServiceability(boolean serviceability) {
        isServiceability = serviceability;
    }
}