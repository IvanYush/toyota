package components;

/**
 * Класс "фары"
 */
public class Headlights {
    private boolean isServiceability; //работоспособность

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