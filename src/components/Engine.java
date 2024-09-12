package components;

public class Engine {
    private boolean isServiceability;

    public Engine() {
    }

    public Engine(boolean isServiceability) {
        this.isServiceability = isServiceability;
    }

    public boolean isServiceability() {
        return isServiceability;
    }

    public void setServiceability(boolean serviceability) {
        isServiceability = serviceability;
    }
}
