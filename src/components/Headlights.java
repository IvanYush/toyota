package components;

public class Headlights {
    private boolean isServiceability;

    public Headlights() {
    }

    public Headlights(boolean isServiceability) {
        this.isServiceability = isServiceability;
    }

    public boolean isServiceability() {
        return isServiceability;
    }

    public void setServiceability(boolean serviceability) {
        isServiceability = serviceability;
    }
}
