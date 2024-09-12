package components;

/**
 * Класс "электрика"
 */
public class Electricity {
    private boolean isServiceability; //работоспособность

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